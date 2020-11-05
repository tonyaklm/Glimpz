package com.example.glimpz;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.glimpz.data.Books;

import java.util.List;

interface OnBookClickListener {
    void onClick(Book book);
}

public class LikedBooksAdapter extends RecyclerView.Adapter<LikedBookViewHolder> {

    private final OnBookClickListener onClick;
    private final List<Book> books;

    public LikedBooksAdapter(OnBookClickListener onClick, List<Book> books) {
        this.onClick = onClick;
        this.books = books;
    }

    @NonNull
    @Override
    public LikedBookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_liked_book, parent, false);
        return new LikedBookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LikedBookViewHolder holder, int position) {
        Book book = books.get(position);
        holder.setTitle(book);
        holder.setOnClickListener(onClick, book);
    }

    @Override
    public int getItemCount() {
        return books.size();
    }
}

class LikedBookViewHolder extends RecyclerView.ViewHolder {

    private final TextView title;

    public LikedBookViewHolder(@NonNull View itemView) {
        super(itemView);
        this.title = itemView.findViewById(R.id.title);
    }

    public void setOnClickListener(OnBookClickListener listener, Book book) {
        itemView.setOnClickListener(view -> {
            listener.onClick(book);
        });
    }

    public void setTitle(Book book) {
        title.setText(Books.getTitle(book));
    }
}
