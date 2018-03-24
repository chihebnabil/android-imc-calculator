package com.example.lenovo.imcalculette;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.lenovo.imcalculette.models.User;

import java.util.ArrayList;

public class Listing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listing);

        ListView ListV = (ListView)findViewById(R.id.Listview1);
        String categories[] = {"Aéronautique","Agro alimentaire","Architecture et urbanisme","Bâtiments et génie civil ",
                "Equipements industriels, outillage et pièces", "Etudes, consulting, formation et certification",
                "Immobilier ","Industrie de la cellulose, papier, carton et emballage","Industries manufacturières",
                "Informatique et bureautique ","Mines, cimenterie, agrégats et granulats","Port et aéroport "};
        ArrayAdapter<String> b = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, categories);

        ListV.setAdapter(b);

        User u= new User();
        u.setId(2);
        u.setFamilyName("John");
        u.setFirstName("Green");


        ListV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

     //   ListV.setAdapter();
    }
}
