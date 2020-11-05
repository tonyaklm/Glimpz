package com.example.glimpz.data;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;

import androidx.annotation.Nullable;

import com.example.glimpz.Book;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class TestStore {

    private static final String TESTS_KEY = "Key.Tests";
    private static final ArrayList<Test> EMPTY = new ArrayList<>();
    private static SharedPreferences prefs;

    public static void init(Context context) {
        prefs = context.getSharedPreferences(Users.getCurrentUserLogin(), Context.MODE_PRIVATE);
    }

    public static void addTest(Test test) {
        ArrayList<Test> tests = getTests(null);
        tests.add(test);
        prefs.edit()
                .putString(TESTS_KEY, toString(tests))
                .apply();
    }

    public static ArrayList<Test> getTests(@Nullable Book book) {
        String testsText = prefs.getString(TESTS_KEY, null);
        ArrayList<Test> allTests;
        if (testsText == null) {
            allTests = new ArrayList<>(EMPTY);
        } else {
            allTests = fromString(testsText);
        }
        allTests.addAll(DefaultTests.tests);
        ArrayList<Test> filteredTests = new ArrayList<>();
        for (Test test : allTests) {
            if (book == null || test.getBook() == book) {
                filteredTests.add(test);
            }
        }
        return filteredTests;
    }

    private static ArrayList<Test> fromString(String text) {
        return (ArrayList<Test>) ObjectDecoder.fromString(text, EMPTY);
    }

    private static String toString(ArrayList<Test> tests) {
        return ObjectDecoder.toString(tests);
    }
}
