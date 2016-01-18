package com.example.dongja94.samplerecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MyAdapter mAdapter;
    RecyclerView.LayoutManager layoutManager;

    int[] IDS = { R.drawable.gallery_photo_1,
            R.drawable.gallery_photo_2,
            R.drawable.gallery_photo_3,
            R.drawable.gallery_photo_4,
            R.drawable.gallery_photo_5,
            R.drawable.gallery_photo_6,
            R.drawable.gallery_photo_7,
            R.drawable.gallery_photo_8,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.recycler);
        mAdapter = new MyAdapter();
        recyclerView.setAdapter(mAdapter);

//        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
//        layoutManager = new GridLayoutManager(this, 2, GridLayoutManager.HORIZONTAL, false);
        layoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);

        initData();
    }

    private void initData() {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            MyData data = new MyData();
            data.icon = getResources().getDrawable(IDS[i%IDS.length]);
            data.title = "item " + i;
            data.fontSize = 20 + r.nextInt(40);
            mAdapter.add(data);
        }
    }
}
