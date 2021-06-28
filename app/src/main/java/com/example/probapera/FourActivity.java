package com.example.probapera;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class FourActivity extends AppCompatActivity {
    ImageView img1, img2, img3;
    int i, otv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.four_activity);
        int min = 1;
        int max = 3;
        int diff = max - min;
        Random random = new Random();
        i = random.nextInt(diff + 1);
        i += min;
        img1 = findViewById(R.id.Saper1);
        img2 = findViewById(R.id.Saper2);
        img3 = findViewById(R.id.Saper3);

    }
    public void SaperB1 (View v){
        if (i == 1){
            Toast toast = Toast.makeText(this, "Мина!!!!", Toast.LENGTH_LONG);
            toast.show();
            img1.setBackgroundColor(getResources().getColor(R.color.red));
        }
        else {
            img1.setBackgroundColor(getResources().getColor(R.color.purple_200));
        }
    }

}
