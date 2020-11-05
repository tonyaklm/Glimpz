package com.example.glimpz;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.glimpz.data.BookResult;

import java.util.List;

public class MyLevelAdapter extends RecyclerView.Adapter<MyLevelViewHolder> {

    private final List<BookResult> results;

    public MyLevelAdapter(List<BookResult> results) {
        this.results = results;
    }

    @NonNull
    @Override
    public MyLevelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_book_results, parent, false);
        return new MyLevelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyLevelViewHolder holder, int position) {
        BookResult result = results.get(position);
        holder.setTitle(result.getBook());
        holder.setAvgSpeed(result.getAvgPageTime());
        holder.setTestResult(result.getLastTestCorrect(), result.getLastTestTotal());
    }

    @Override
    public int getItemCount() {
        return results.size();
    }
}

class MyLevelViewHolder extends RecyclerView.ViewHolder {

    private final TextView title;
    private final TextView avgSpeed;
    private final TextView testResult;

    public MyLevelViewHolder(@NonNull View itemView) {
        super(itemView);
        this.title = itemView.findViewById(R.id.bookName);
        this.avgSpeed = itemView.findViewById(R.id.avgSpeed);
        this.testResult = itemView.findViewById(R.id.testResult);
    }

    public void setTitle(Book book) {
        this.title.setText(getTitle(book));
    }

    public void setAvgSpeed(double avgSpeed) {
        if (avgSpeed != -1) {
            double speed = ((double) ((int) (avgSpeed * 10))) / 10;
            this.avgSpeed.setText("Средняя скорость: " + speed);
            this.avgSpeed.setVisibility(View.VISIBLE);
        } else {
            this.avgSpeed.setVisibility(View.GONE);
        }
    }

    public void setTestResult(int correct, int total) {
        if (correct != -1 && total != -1) {
            this.testResult.setText("Последний тест: " + correct + "/" + total);
            this.testResult.setVisibility(View.VISIBLE);
        } else {
            this.testResult.setVisibility(View.GONE);
        }
    }

    private String getTitle(Book book) {
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
