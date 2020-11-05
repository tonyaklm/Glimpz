package com.example.glimpz.screen.yourtests;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.glimpz.Book;
import com.example.glimpz.DashboardActivity;
import com.example.glimpz.R;
import com.example.glimpz.TestActivity;
import com.example.glimpz.data.TestStore;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class YourTests extends AppCompatActivity {

    private static final String ARG_BOOK = "Arg.Book";

    private RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.your_tests);
        recycler = findViewById(R.id.recycler);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        YourTestsAdapter adapter = new YourTestsAdapter(TestStore.getTests(getBook(), getBook() != null), test -> {
            TestActivity.launch(this, test);
        });
        recycler.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        Button menu = (Button) findViewById(R.id.menu);
        menu.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, DashboardActivity.class);
            startActivity(startActivity);
        });
    }

    private Book getBook() {
        return (Book) getIntent().getSerializableExtra(ARG_BOOK);
    }

    public static void launch(Context context, @Nullable Book book) {
        Intent intent = new Intent(context, YourTests.class);
        intent.putExtra(ARG_BOOK, book);
        context.startActivity(intent);
    }
}
