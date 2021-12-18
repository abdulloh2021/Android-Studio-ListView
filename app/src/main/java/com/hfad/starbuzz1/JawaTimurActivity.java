package com.hfad.starbuzz1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class JawaTimurActivity extends AppCompatActivity {

    public static final String EXTRA_JATIMID = "jawaTimurId";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jawa_timur);
        //Get the drink from the intent
        int jawaTimurId = (Integer)getIntent().getExtras().get(EXTRA_JATIMID);
        JawaTimur jawatimur = JawaTimur.jawaTimurs[jawaTimurId];
        //Populate the drink name
        TextView name = (TextView)findViewById(R.id.name);
        name.setText(jawatimur.getName());
        //Populate the drink description
        TextView description = (TextView)findViewById(R.id.description);
        description.setText(jawatimur.getDescription());
        //Populate the drink image
        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(jawatimur.getImageResourceId());
        photo.setContentDescription(jawatimur.getName());
    }
}