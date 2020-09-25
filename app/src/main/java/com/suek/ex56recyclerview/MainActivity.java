package com.suek.ex56recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> items= new ArrayList<>();
    RecyclerView recyclerView;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items.add(new String("aaa"));
        items.add(new String("bbb"));
        items.add(new String("ccc"));
        items.add(new String("aaa"));
        items.add(new String("bbb"));
        items.add(new String("ccc"));
        items.add(new String("aaa"));
        items.add(new String("bbb"));
        items.add(new String("ccc"));
        items.add(new String("aaa"));
        items.add(new String("bbb"));
        items.add(new String("ccc"));
        items.add(new String("aaa"));
        items.add(new String("bbb"));
        items.add(new String("ccc"));
        items.add(new String("aaa"));
        items.add(new String("bbb"));
        items.add(new String("ccc"));
        items.add(new String("aaa"));
        items.add(new String("bbb"));
        items.add(new String("ccc"));

        adapter= new MyAdapter(this, items);
        recyclerView= findViewById(R.id.rectcler);
        recyclerView.setAdapter(adapter);
    }
}
