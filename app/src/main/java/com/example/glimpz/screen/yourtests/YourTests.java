package com.example.glimpz.screen.yourtests;

import android.os.Bundle;

import com.example.glimpz.R;
import com.example.glimpz.TestActivity;
import com.example.glimpz.data.TestStore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class YourTests extends AppCompatActivity {

    private RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.your_tests);
        recycler = findViewById(R.id.recycler);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        YourTestsAdapter adapter = new YourTestsAdapter(TestStore.getTests(), test -> {
            TestActivity.launch(this, test);
        });
        recycler.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
