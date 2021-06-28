package com.example.probapera;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;


public class ThreeActivity extends AppCompatActivity {
    int i;
    Button bt1, bt2, bt3, bt4;
    ImageView im;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three_activity);
        im = findViewById(R.id.Image);
        Random();
    }
    public void Image1 (View v){
        Random();
    }
    public void Image2 (View v){
        Random();
    }
    public void Image3 (View v){
        Random();
    }
    public void Random(){
        int min = 1;
        int max = 3 ;
        int diff = max - min;
        Random random = new Random();
        i = random.nextInt(diff + 1);
        i += min;
        if (i == 1){
            im.setBackgroundColor(getResources().getColor(R.color.white));
        }
        if (i == 2){
            im.setBackgroundColor(getResources().getColor(R.color.red));
        }
        if (i == 3){
            im.setBackgroundColor(getResources().getColor(R.color.blue));
        }

    }
}
