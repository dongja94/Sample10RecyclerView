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
    MyData data;

    public OnItemClickListener itemClickListener;
    public void setOnItemClickListener(OnItemClickListener listener) {
        itemClickListener = listener;
    }

    public MyViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (itemClickListener != null) {
                    itemClickListener.onItemClick(v, getAdapterPosition());
                }
            }
        });
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
