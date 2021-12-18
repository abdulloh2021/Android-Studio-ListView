package com.hfad.starbuzz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class JawaTengahCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jawa_tengah_category);
        ArrayAdapter<JawaTengah> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                JawaTengah.jawaTengahs);
        ListView listJawaTengahs = (ListView) findViewById(R.id.list_jawatengah);
        listJawaTengahs.setAdapter(listAdapter);

        //Create the listener
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener(){
                    public void onItemClick(AdapterView<?> listJawaTengahs,
                                            View itemView,
                                            int position,
                                            long id) {
                        //Pass the drink the user clicks on to DrinkActivity
                        Intent intent = new Intent(JawaTengahCategoryActivity.this,
                                JawaTengahActivity.class);
                        intent.putExtra(JawaTengahActivity.EXTRA_JATENGID, (int) id);
                        startActivity(intent);
                    }
                };
        //Assign the listener to the list view
        listJawaTengahs.setOnItemClickListener(itemClickListener);
    }
}