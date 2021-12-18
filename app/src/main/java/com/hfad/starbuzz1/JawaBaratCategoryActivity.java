package com.hfad.starbuzz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class JawaBaratCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jawa_barat_category);
        ArrayAdapter<JawaBarat> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                JawaBarat.jawaBarats);
        ListView listJawaBarats = (ListView) findViewById(R.id.list_jawabarat);
        listJawaBarats.setAdapter(listAdapter);

        //Create the listener
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener(){
                    public void onItemClick(AdapterView<?> listJawaBarats,
                                            View itemView,
                                            int position,
                                            long id) {
                        //Pass the drink the user clicks on to DrinkActivity
                        Intent intent = new Intent(JawaBaratCategoryActivity.this,
                                JawaBaratActivity.class);
                        intent.putExtra(JawaBaratActivity.EXTRA_JABARID, (int) id);
                        startActivity(intent);
                    }
                };
        //Assign the listener to the list view
        listJawaBarats.setOnItemClickListener(itemClickListener);
    }
}