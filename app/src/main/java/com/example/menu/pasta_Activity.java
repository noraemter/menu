package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class pasta_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasta);

        RecyclerView recycler = findViewById(R.id.pasta_recycler);

        String[] price = new String[pastamenu.pastamenus.length];
        String[] captions = new String[pastamenu.pastamenus.length];
        int[] ids = new int[pastamenu.pastamenus.length];

        for (int i = 0; i < captions.length; i++) {
            captions[i] = pastamenu.pastamenus[i].getName();
            price[i] = pastamenu.pastamenus[i].getPrice();
            ids[i] = pastamenu.pastamenus[i].getImageID();
        }
        recycler.setLayoutManager(new LinearLayoutManager(this));
        pastamenuAdapter adapter = new pastamenuAdapter(ids,captions, price);
        recycler.setAdapter(adapter);


    }


    }
