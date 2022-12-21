package com.example.menu;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class LacucinaActivity extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lacucina);
        RecyclerView recycler = findViewById(R.id.lacucina_recycler);

        String[] price = new String[Lacucina.Lacucinas.length];
        String[] captions = new String[Lacucina.Lacucinas.length];
        int[] ids = new int[Lacucina.Lacucinas.length];

        for (int i = 0; i < captions.length; i++) {
            captions[i] = Lacucina.Lacucinas[i].getName();
            price[i] = Lacucina.Lacucinas[i].getPrice();
            ids[i] = Lacucina.Lacucinas[i].getImageID();
        }
        recycler.setLayoutManager(new LinearLayoutManager(this));
        LucucinaImageAdapter adapter = new LucucinaImageAdapter(ids,captions, price);
        recycler.setAdapter(adapter);

    }
}
//        ArrayAdapter<Lacucina> listAdapter = new ArrayAdapter<Lacucina>(this,
//                android.R.layout.simple_list_item_1,
//                Lacucina.Lacucinas);
//
//        ListView listView = (ListView)findViewById(R.id.drinks_list);
//        listView.setAdapter(listAdapter);
//
//        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent,
//                                    View view,
//                                    int position,
//                                    long id) {
//                Intent intent = new Intent(LacucinaActivity.this,
//                        LacucinaDetails.class);
//                intent.putExtra("drink_id", (int)id);
//                startActivity(intent);
//
//            }
//        };
//        listView.setOnItemClickListener(itemClickListener);




