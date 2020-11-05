package com.example.glimpz.data;

import com.example.glimpz.Book;

import java.util.Arrays;
import java.util.List;

public class DefaultTests {

    static List<Test> tests = Arrays.asList(
            new Test(
                    Book.Balda,
                    "Тест по балде",
                    Arrays.asList(
                            new Question(
                                    "Кто такой Балда?",
                                    "Не скажу",
                                    Arrays.asList(
                                            "Совсем не знаю",
                                            "Не знаю",
                                            "Не знаю вообще"
                                    )
                            )
                    )
            ),
            new Test(
                    Book.Ball,
                    "Тест по балде",
                    Arrays.asList(
                            new Question(
                                    "Кто такой Балда?",
                                    "Не скажу",
                                    Arrays.asList(
                                            "Совсем не знаю",
                                            "Не знаю",
                                            "Не знаю вообще"
                                    )
                            )
                    )
            )
    );
}
