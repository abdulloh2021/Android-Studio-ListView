package com.hfad.starbuzz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class JawaTimurCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jawa_timur_category);
        ArrayAdapter<JawaTimur> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                JawaTimur.jawaTimurs);
        ListView listJawaTimurs = (ListView) findViewById(R.id.list_jawatimur);
        listJawaTimurs.setAdapter(listAdapter);

        //Create the listener
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener(){
                    public void onItemClick(AdapterView<?> listJawaTimurs,
                                            View itemView,
                                            int position,
                                            long id) {
                        //Pass the drink the user clicks on to DrinkActivity
                        Intent intent = new Intent(JawaTimurCategoryActivity.this,
                                JawaTimurActivity.class);
                        intent.putExtra(JawaTimurActivity.EXTRA_JATIMID, (int) id);
                        startActivity(intent);
                    }
                };
        //Assign the listener to the list view
        listJawaTimurs.setOnItemClickListener(itemClickListener);

    }
}