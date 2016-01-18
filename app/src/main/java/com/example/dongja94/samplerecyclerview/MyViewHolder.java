package com.example.dongja94.samplerecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by dongja94 on 2016-01-18.
 */
public class MyViewHolder extends RecyclerView.ViewHolder {
    ImageView iconView;
    TextView titleView;
    View view;
    MyData data;
    public MyViewHolder(View itemView) {
        super(itemView);
        view = itemView;
        iconView = (ImageView)itemView.findViewById(R.id.image_icon);
        titleView = (TextView)itemView.findViewById(R.id.text_title);
    }

    public void setData(MyData data) {
        this.data = data;
        iconView.setImageDrawable(data.icon);
        titleView.setText(data.title);
        titleView.setTextSize(data.fontSize);
    }
}
