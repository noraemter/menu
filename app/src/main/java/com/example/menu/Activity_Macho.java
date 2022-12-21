package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Activity_Macho extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_macho);


        RecyclerView recycler = findViewById(R.id.Macho_recycler);

        String[] price = new String[Macho.Machos.length];
        String[] captions = new String[Macho.Machos.length];
        int[] ids = new int[Macho.Machos.length];

        for (int i = 0; i < captions.length; i++) {
            captions[i] = Macho.Machos[i].getName();
            price[i] = Macho.Machos[i].getprice();
            ids[i] = Macho.Machos[i].getImageID();
        }
        recycler.setLayoutManager(new LinearLayoutManager(this));
        MachoImageAdapter adapter = new MachoImageAdapter(ids,captions, price);
        recycler.setAdapter(adapter);


    }
}