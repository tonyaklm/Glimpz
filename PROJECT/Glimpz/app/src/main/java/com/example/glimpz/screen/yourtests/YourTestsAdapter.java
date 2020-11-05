package com.example.glimpz.screen.yourtests;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.glimpz.R;
import com.example.glimpz.data.Test;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

interface OnTestClick {
    void onClick(Test test);
}

public class YourTestsAdapter extends RecyclerView.Adapter<YourTestViewHolder> {

    private final ArrayList<Test> tests;
    private final OnTestClick clickListener;

    public YourTestsAdapter(
            ArrayList<Test> tests,
            OnTestClick clickListener
    ) {
        this.tests = tests;
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public YourTestViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_your_test, parent, false);
        return new YourTestViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull YourTestViewHolder holder, int position) {
        Test test = tests.get(position);
        holder.setTitle(test.getTitle());
        holder.setClickListener(view -> {
            clickListener.onClick(test);
        });
    }

    @Override
    public int getItemCount() {
        return tests.size();
    }
}

class YourTestViewHolder extends RecyclerView.ViewHolder {

    private final TextView title;

    public YourTestViewHolder(
            @NonNull View itemView
    ) {
        super(itemView);
        title = itemView.findViewById(R.id.my_test);
    }

    public void setClickListener(View.OnClickListener listener) {
        itemView.setOnClickListener(listener);
    }

    public void setTitle(String title) {
        this.title.setText(title);
    }
}