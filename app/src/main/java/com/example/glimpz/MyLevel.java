package com.example.glimpz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.glimpz.data.Results;

public class MyLevel extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_level);
        RecyclerView recycler = findViewById(R.id.recycler);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        MyLevelAdapter adapter = new MyLevelAdapter(Results.getResults());
        recycler.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        Button menu = findViewById(R.id.menu);
        menu.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, DashboardActivity.class);
            startActivity(startActivity);
        });
    }
}
