package com.hfad.starbuzz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class JawaTengahActivity extends AppCompatActivity {

    public static final String EXTRA_JATENGID = "jawaTengahId";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jawa_tengah);
        //Get the drink from the intent
        int jawaTengahId = (Integer)getIntent().getExtras().get(EXTRA_JATENGID);
        JawaTengah jawatengah = JawaTengah.jawaTengahs[jawaTengahId];
        //Populate the drink name
        TextView name = (TextView)findViewById(R.id.name);
        name.setText(jawatengah.getName());
        //Populate the drink description
        TextView description = (TextView)findViewById(R.id.description);
        description.setText(jawatengah.getDescription());
        //Populate the drink image
        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(jawatengah.getImageResourceId());
        photo.setContentDescription(jawatengah.getName());
    }
}