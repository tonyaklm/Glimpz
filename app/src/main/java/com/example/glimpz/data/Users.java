package com.example.glimpz.data;

import android.content.Context;
import android.content.SharedPreferences;

public class Users {

    static SharedPreferences prefs;

    private static String currentUserLogin;

    public static void init(Context context) {
        prefs = context.getSharedPreferences("users", Context.MODE_PRIVATE);
    }

    public static void register(String login, String password, String email) {
        prefs.edit()
                .putString(login, password)
                .apply();
    }

    public static boolean login(String login, String password) {
        String expectedPassword = prefs.getString(login, "");
        return expectedPassword.equals(password);
    }

    public static String getCurrentUserLogin() {
        return currentUserLogin;
    }
}
