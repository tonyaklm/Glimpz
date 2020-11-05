package com.example.glimpz.data;

import com.example.glimpz.Book;

public class Books {
    public static String getTitle(Book book) {
        switch (book) {
            case Ball:
                return "После Бала";
            case Killman:
                return "Убить человека";
            case Knar:
                return "Кому на Руси жить хорошо";
            case Rusal:
                return "Русалочка";
            case Juk:
                return "Чук и Гек";
            case Balda:
                return "Сказка о попе и о работнике его Балде";
            case Mozart:
                return "Моцарт и Сальери";
            case Plenk:
                return "Кавказский пленник";
            case Levsha:
                return "Левша";
        }
        throw new RuntimeException("no book title");
    }
}
