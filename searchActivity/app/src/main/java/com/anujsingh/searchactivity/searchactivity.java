package com.anujsingh.searchactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class searchactivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private  RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchactivity);

        ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.ic_android,"Line 1","Line 2"));
        exampleList.add(new ExampleItem(R.drawable.ic_android,"Line 3","Line 4"));
        exampleList.add(new ExampleItem(R.drawable.ic_android,"Line 5","Line 6"));
        exampleList.add(new ExampleItem(R.drawable.ic_android, "Line 7", "Line 8"));
        exampleList.add(new ExampleItem(R.drawable.ic_audiotrack, "Line 9", "Line 10"));
        exampleList.add(new ExampleItem(R.drawable.ic_sun, "Line 11", "Line 12"));
        exampleList.add(new ExampleItem(R.drawable.ic_android, "Line 13", "Line 14"));
        exampleList.add(new ExampleItem(R.drawable.ic_audiotrack, "Line 15", "Line 16"));
        exampleList.add(new ExampleItem(R.drawable.ic_sun, "Line 17", "Line 18"));
        exampleList.add(new ExampleItem(R.drawable.ic_android, "Line 19", "Line 20"));
        exampleList.add(new ExampleItem(R.drawable.ic_audiotrack, "Line 21", "Line 22"));
        exampleList.add(new ExampleItem(R.drawable.ic_sun, "Line 23", "Line 24"));
        exampleList.add(new ExampleItem(R.drawable.ic_android, "Line 25", "Line 26"));
        exampleList.add(new ExampleItem(R.drawable.ic_audiotrack, "Line 27", "Line 28"));
        exampleList.add(new ExampleItem(R.drawable.ic_sun, "Line 29", "Line 30"));

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);


    }
}
