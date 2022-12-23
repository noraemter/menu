package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class fries_Activity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fries);


        RecyclerView recycler = findViewById(R.id.fries_recycler);

        String[] price = new String[friesmenu.friesmenus.length];
        String[] captions = new String[friesmenu.friesmenus.length];
        int[] ids = new int[friesmenu.friesmenus.length];

        for (int i = 0; i < captions.length; i++) {
            captions[i] = friesmenu.friesmenus[i].getName();
            price[i] = friesmenu.friesmenus[i].getPrice();
            ids[i] = friesmenu.friesmenus[i].getImageID();
        }
        recycler.setLayoutManager(new LinearLayoutManager(this));
        friesmenuAdapter adapter = new friesmenuAdapter(ids,captions, price);
        recycler.setAdapter(adapter);


    }
}