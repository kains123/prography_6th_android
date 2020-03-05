package com.kainsday.practice;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TestViewHolder extends RecyclerView.ViewHolder {

    public TextView tv_num, tv_title, tv_director, tv_release_date;
    public TestViewHolder(@NonNull View itemView) {
        super(itemView);

        tv_num = itemView.findViewById(R.id.tv_num);
        tv_title = itemView.findViewById(R.id.tv_title);
        tv_director = itemView.findViewById(R.id.tv_director);
        tv_release_date = itemView.findViewById(R.id.tv_release_date);

    }
}


