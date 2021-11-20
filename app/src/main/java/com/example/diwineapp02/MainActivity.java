package com.example.diwineapp02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        ArrayList<itemModel> itemModelist = new ArrayList<>();
        itemModelist.add(new itemModel("Ryzlink rýnský", "RR"));
        itemModelist.add(new itemModel("Merlot", "Me"));
        itemModelist.add(new itemModel("Rulandské šedé", "RŠ"));
        itemModelist.add(new itemModel("Civil", "This is civil Engineering"));
        itemModelist.add(new itemModel("Civil", "This is civil Engineering"));
        itemModelist.add(new itemModel("Civil", "This is civil Engineering"));
        itemModelist.add(new itemModel("Civil", "This is civil Engineering"));
        itemModelist.add(new itemModel("Civil", "This is civil Engineering"));
        itemModelist.add(new itemModel("Civil", "This is civil Engineering"));
        itemModelist.add(new itemModel("Civil", "This is civil Engineering"));
        itemModelist.add(new itemModel("Civil", "This is civil Engineering"));
        itemModelist.add(new itemModel("Civil", "This is civil Engineering"));
        itemModelist.add(new itemModel("Civil", "This is civil Engineering"));
        itemModelist.add(new itemModel("Civil", "This is civil Engineering"));
        itemModelist.add(new itemModel("Civil", "This is civil Engineering"));
        itemModelist.add(new itemModel("Civil", "This is civil Engineering"));
        itemModelist.add(new itemModel("Civil", "This is civil Engineering"));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ItemAdapter(itemModelist));

    }
}