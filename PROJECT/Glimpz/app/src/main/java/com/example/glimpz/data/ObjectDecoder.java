package com.example.glimpz.data;

import android.util.Base64;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectDecoder {
    public static Object fromString(String text, Object defaultValue) {
        try {
            if (text == null) {
                return defaultValue;
            }
            byte[] data = Base64.decode(text, Base64.DEFAULT);
            return (new ObjectInputStream(new ByteArrayInputStream(data))).readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return defaultValue;
        } catch (IOException e) {
            e.printStackTrace();
            return defaultValue;
        }
    }

    public static String toString(Object object) {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        try {
            (new ObjectOutputStream(stream)).writeObject(object);
            return Base64.encodeToString(stream.toByteArray(), Base64.DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
