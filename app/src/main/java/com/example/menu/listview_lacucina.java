package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class listview_lacucina extends AppCompatActivity {
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_lacucina);

        listView = findViewById(R.id.lstview);

        ArrayList<ListLacucina> arrayList = new ArrayList<>();
        //0
        arrayList.add(new ListLacucina (R.drawable.rest,"All"));
        //1
        arrayList.add(new ListLacucina (R.drawable.bbqpizza,"Pizzas"));
        //2
        arrayList.add(new ListLacucina (R.drawable.berrysalad,"Salads"));
        //3
        arrayList.add(new ListLacucina (R.drawable.fries,"Fries"));
        //4
        arrayList.add(new ListLacucina (R.drawable.chichensandwich,"Sandwich"));
        //5
        arrayList.add(new ListLacucina (R.drawable.salmon1,"Fish"));
        //6
        arrayList.add(new ListLacucina (R.drawable.pennepasta,"Pasta"));
        //7
        arrayList.add(new ListLacucina (R.drawable.lemonade,"Drinks"));


        ListLacucinaAdapter ListLacucinaAdapter = new ListLacucinaAdapter(this,R.layout.list_row_lacucina,arrayList);
        listView.setAdapter(ListLacucinaAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            if(position == 0){
                startActivity(new Intent(listview_lacucina.this,LacucinaActivity.class));
            }
            else if (position == 1){
                startActivity(new Intent(listview_lacucina.this,Pizza_Activity.class));

            }
            else if (position == 2){
                startActivity(new Intent(listview_lacucina.this,salad_Activity.class));

            }
            else if (position == 3){
                startActivity(new Intent(listview_lacucina.this,fries_Activity.class));

            }
            else if (position == 4){
                startActivity(new Intent(listview_lacucina.this,sandwich_Activity.class));

            }
            else if (position == 5){
                startActivity(new Intent(listview_lacucina.this,fish_Activity.class));

            }
            else if (position == 6){
                startActivity(new Intent(listview_lacucina.this,pasta_Activity.class));

            }
            else if (position == 7) {
                startActivity(new Intent(listview_lacucina.this, drinks_Activity.class));

            }

        }

});
    }
}