package com.example.glimpz;

import android.os.Bundle;

import com.example.glimpz.data.TestStore;
import com.example.glimpz.screen.yourtests.YourTestsAdapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class LikedBook extends AppCompatActivity {
    private RecyclerView recycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.liked_book);




    }
}
