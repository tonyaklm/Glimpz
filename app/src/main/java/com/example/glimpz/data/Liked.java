package com.example.glimpz.data;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.glimpz.Book;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Liked {

    private static final String LIKED_BOOKS = "Arg.LikedBooks";
    private static SharedPreferences prefs;

    public static void init(Context context) {
        prefs = context.getSharedPreferences("liked", Context.MODE_PRIVATE);
    }

    public static void likeBook(Book book) {
        List<Book> books = getLikedBooks();
        books.add(book);
        prefs.edit()
                .putString(LIKED_BOOKS, ObjectDecoder.toString(new HashSet<>(books)))
                .apply();
    }

    public static List<Book> getLikedBooks() {
        String text = prefs.getString(LIKED_BOOKS, null);
        return new ArrayList<>((Set<Book>) ObjectDecoder.fromString(text, new HashSet<>()));
    }
}
