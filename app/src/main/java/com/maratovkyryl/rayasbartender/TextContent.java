package com.maratovkyryl.rayasbartender;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TextContent extends AppCompatActivity {
    private int category;
    private int position;
    private int [] array_cocktails = {R.string.clover_club, R.string.aperol_spritz,R.string.mai_tai, R.string.old_fashioned,
                R.string.asian_mule, R.string.cosmopolitan, R.string.white_lady, R.string.whiskey_sour, R.string.negroni,
                R.string.cucumber_cooler, R.string.mediteranian_mohito};
    private int [] array_img = {R.drawable.clover_club, R.drawable.aperol_spritz, R.drawable.mai_tai, R.drawable.old_fashioned,
                R.drawable.asian_mule, R.drawable.cosmopolitan, R.drawable.white_lady, R.drawable.whiskey_sour, R.drawable.negroni,
                R.drawable.cucumber_cooler, R.drawable.mediteranian_mohito};
    private int [] array_vodka = {R.string.asian_mule, R.string.cosmopolitan};
    private int [] array_vodka_img = {R.drawable.asian_mule, R.drawable.cosmopolitan};
    private int [] array_gin = {R.string.clover_club, R.string.white_lady, R.string.cucumber_cooler, R.string.negroni};
    private int [] array_gin_img = {R.drawable.clover_club, R.drawable.white_lady, R.drawable.cucumber_cooler, R.drawable.negroni};
    private  int [] array_whiskey = {R.string.old_fashioned, R.string.whiskey_sour};
    private int [] array_whiskey_img = {R.drawable.old_fashioned, R.drawable.whiskey_sour};
    private int [] array_rum = {R.string.mai_tai};
    private int [] array_rum_img = {R.drawable.mai_tai};
    private int [] array_shots = {R.string.hiroshima, R.string.b52, R.string.blowjob, R.string.tumor_brain, R.string.jellyfish};
    private int [] array_shots_img = {R.drawable.hiroshima, R.drawable.b52, R.drawable.blowjob, R.drawable.tumor_brain, R.drawable.meduza};
    private TextView text_content;
    private ImageView iContent;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_content);
        text_content = findViewById(R.id.text_main_content);
        iContent = findViewById(R.id.image_content);
        reciveIntend();
    }

    private void reciveIntend(){
        Intent i = getIntent();
        if (i!= null){
            category = i.getIntExtra("category", 0);
            position = i.getIntExtra("position", 0);
        }
        switch (category){
            case(0):
                iContent.setImageResource(array_img[position]);
                text_content.setText(array_cocktails[position]);
                break;
            case(1):
                iContent.setImageResource(array_vodka_img[position]);
                text_content.setText(array_vodka[position]);
                break;
            case(2):
                iContent.setImageResource(array_gin_img[position]);
                text_content.setText(array_gin[position]);
                break;
            case(3):
                iContent.setImageResource(array_whiskey_img[position]);
                text_content.setText(array_whiskey[position]);
                break;
            case(4):
                iContent.setImageResource(array_rum_img[position]);
                text_content.setText(array_rum[position]);
                break;
            case(5):
                iContent.setImageResource(array_shots_img[position]);
                text_content.setText(array_shots[position]);
                break;
        }
    }
}
