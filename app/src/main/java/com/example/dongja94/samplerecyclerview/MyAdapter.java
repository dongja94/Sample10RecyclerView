package com.example.dongja94.samplerecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dongja94 on 2016-01-18.
 */
public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    List<MyData> items = new ArrayList<MyData>();

    public void add(MyData data) {
        items.add(data);
        notifyDataSetChanged();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.view_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.setData(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public MyData getItem(int position) {
        if (position < 0 || position >= items.size()) return null;

        return items.get(position);
    }
}
