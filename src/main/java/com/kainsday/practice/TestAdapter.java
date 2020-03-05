package com.kainsday.practice;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class TestAdapter extends RecyclerView.Adapter<TestViewHolder> {

    private Context mContext;
    private ArrayList<TestItem> itemList;

    public TestAdapter(Context mContext, ArrayList<TestItem> itemList) {
        this.mContext = mContext;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public TestViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View baseView = View.inflate(mContext, R.layout.item_test,null);
        TestViewHolder testViewHolder = new TestViewHolder(baseView);
        return testViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TestViewHolder testViewHolder, int position) {


        TestItem item = itemList.get(position);

        testViewHolder.tv_num.setText(String.valueOf(position+1));
        testViewHolder.tv_title.setText(item.getTitle());
        testViewHolder.tv_director.setText(item.getDirector());
        testViewHolder.tv_release_date.setText(item.getRelease_date());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}

