package com.example.glimpz.screen.yourtests;

import android.content.Intent;
import android.os.Bundle;

import com.example.glimpz.ListBookUni;
import com.example.glimpz.R;
import com.example.glimpz.TestActivity;
import com.example.glimpz.data.Test;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class YourTests extends AppCompatActivity {

    public static ArrayList<Test> tests = new ArrayList<>();

    private RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.your_tests);
        recycler = findViewById(R.id.recycler);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        YourTestsAdapter adapter = new YourTestsAdapter(tests, test -> {
            TestActivity.launch(this, test);
        });
        recycler.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
