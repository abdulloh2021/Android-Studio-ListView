package com.hfad.starbuzz1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class JawaBaratActivity extends AppCompatActivity {

    public static final String EXTRA_JABARID = "jawaBaratId";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jawa_barat);
        //Get the drink from the intent
        int jawaBaratId = (Integer)getIntent().getExtras().get(EXTRA_JABARID);
        JawaBarat jawabarat = JawaBarat.jawaBarats[jawaBaratId];
        //Populate the drink name
        TextView name = (TextView)findViewById(R.id.name);
        name.setText(jawabarat.getName());
        //Populate the drink description
        TextView description = (TextView)findViewById(R.id.description);
        description.setText(jawabarat.getDescription());
        //Populate the drink image
        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(jawabarat.getImageResourceId());
        photo.setContentDescription(jawabarat.getName());
    }
}