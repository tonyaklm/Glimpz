package com.example.glimpz.data;

import android.content.Context;
import android.content.SharedPreferences;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Base64;

public class TestStore {

    private static final String TESTS_KEY = "Key.Tests";
    private static final ArrayList<Test> EMPTY = new ArrayList<Test>();
    private static SharedPreferences prefs;

    public static void init(Context context) {
        prefs = context.getSharedPreferences(Users.getCurrentUserLogin(), Context.MODE_PRIVATE);
    }

    public static void addTest(Test test) {
        ArrayList<Test> tests = getTests();
        tests.add(test);
        prefs.edit()
                .putString(TESTS_KEY, toString(tests))
                .apply();
    }

    public static ArrayList<Test> getTests() {
        String testsText = prefs.getString(TESTS_KEY, null);
        if (testsText == null) {
            return EMPTY;
        }
        return fromString(testsText);
    }

    private static ArrayList<Test> fromString(String text) {
        try {
            byte[] data = Base64.getDecoder().decode(text);
            return (ArrayList<Test>) (new ObjectInputStream(new ByteArrayInputStream(data))).readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return EMPTY;
        } catch (IOException e) {
            e.printStackTrace();
            return EMPTY;
        }
    }

    private static String toString(ArrayList<Test> tests) {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        try {
            (new ObjectOutputStream(stream)).writeObject(tests);
            return Base64.getEncoder().encodeToString(stream.toByteArray());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
