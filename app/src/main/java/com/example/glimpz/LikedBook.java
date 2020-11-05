package com.example.glimpz;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.glimpz.data.Liked;

public class LikedBook extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.liked_book);
        RecyclerView recycler = findViewById(R.id.recycler);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        LikedBooksAdapter adapter = new LikedBooksAdapter(this::launchBookScreen, Liked.getLikedBooks());
        recycler.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private void launchBookScreen(Book book) {
        switch (book) {
            case Ball:
                PosleBalaOkno.launch(this);
                break;
            case Killman:
                KillmanOkno.launch(this);
                break;
            case Knar:
                KnarOkno.launch(this);
                break;
            case Rusal:
                RusalOkno.launch(this);
                break;
            case Juk:
                JukOkno.launch(this);
                break;
            case Balda:
                BaldaOkno.launch(this);
                break;
            case Mozart:
                MozartOkno.launch(this);
                break;
            case Plenk:
                PlenKOkno.launch(this);
                break;
            case Levsha:
                LevshaOkno.launch(this);
                break;
        }
    }
}
