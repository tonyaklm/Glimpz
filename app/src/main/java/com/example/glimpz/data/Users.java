package com.example.glimpz.data;

import android.content.Context;
import android.content.SharedPreferences;

public class Users {

    static SharedPreferences prefs;

    public static void init(Context context) {
        prefs = context.getSharedPreferences("users", Context.MODE_PRIVATE);
    }

    public static void register(String login, String password, String email) {
        prefs.edit()
                .putString(login, password)
                .apply();
    }

    public static boolean check(String login, String password) {
        String expectedPassword = prefs.getString(login, "");
        return expectedPassword.equals(password);
    }
}
