package com.example.probapera;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class TwoActivity extends AppCompatActivity {
    int i;
    Button bt1, bt2, bt3, bt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two_activity);
        bt1 = findViewById(R.id.twobutton1);
        bt2 = findViewById(R.id.twobutton2);
        bt3 = findViewById(R.id.twobutton3);
        bt4 = findViewById(R.id.twobutton4);
        Random();
        Moment();

    }
    public void Random(){
        int min = 1;
        int max = 4 ;
        int diff = max - min;
        Random random = new Random();
        i = random.nextInt(diff + 1);
        i += min;
    }
    public void TwoButton1 (View v){
        if (i == 1){
            Random();
            Moment();
        }
        else {
            Toast toast = Toast.makeText(getApplicationContext(), "Ошибка", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void TwoButton2 (View v){
        if (i == 2){
            Random();
            Moment();
        }
        else {
            Toast toast = Toast.makeText(getApplicationContext(), "Ошибка", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void TwoButton3 (View v){
        if (i == 3){
            Random();
            Moment();
        }
        else {
            Toast toast = Toast.makeText(getApplicationContext(), "Ошибка", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void TwoButton4 (View v){
        if (i == 4){
            Random();
            Moment();
        }
        else {
            Toast toast = Toast.makeText(getApplicationContext(), "Ошибка", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public void Moment (){
        if (i == 1){
            bt1.setBackgroundColor(getResources().getColor(R.color.white));
            bt2.setBackgroundColor(getResources().getColor(R.color.black));
            bt3.setBackgroundColor(getResources().getColor(R.color.black));
            bt4.setBackgroundColor(getResources().getColor(R.color.black));
            bt1.setTextColor(getResources().getColor(R.color.black));
            bt2.setTextColor(getResources().getColor(R.color.white));
            bt3.setTextColor(getResources().getColor(R.color.white));
            bt4.setTextColor(getResources().getColor(R.color.white));
        }
        if (i == 2){
            bt1.setBackgroundColor(getResources().getColor(R.color.black));
            bt2.setBackgroundColor(getResources().getColor(R.color.white));
            bt3.setBackgroundColor(getResources().getColor(R.color.black));
            bt4.setBackgroundColor(getResources().getColor(R.color.black));
            bt1.setTextColor(getResources().getColor(R.color.white));
            bt2.setTextColor(getResources().getColor(R.color.black));
            bt3.setTextColor(getResources().getColor(R.color.white));
            bt4.setTextColor(getResources().getColor(R.color.white));
        }
        if (i == 3){
            bt1.setBackgroundColor(getResources().getColor(R.color.black));
            bt2.setBackgroundColor(getResources().getColor(R.color.black));
            bt3.setBackgroundColor(getResources().getColor(R.color.white));
            bt4.setBackgroundColor(getResources().getColor(R.color.black));
            bt1.setTextColor(getResources().getColor(R.color.white));
            bt2.setTextColor(getResources().getColor(R.color.white));
            bt3.setTextColor(getResources().getColor(R.color.black));
            bt4.setTextColor(getResources().getColor(R.color.white));
        }
        if (i == 4){
            bt1.setBackgroundColor(getResources().getColor(R.color.black));
            bt2.setBackgroundColor(getResources().getColor(R.color.black));
            bt3.setBackgroundColor(getResources().getColor(R.color.black));
            bt4.setBackgroundColor(getResources().getColor(R.color.white));
            bt1.setTextColor(getResources().getColor(R.color.white));
            bt2.setTextColor(getResources().getColor(R.color.white));
            bt3.setTextColor(getResources().getColor(R.color.white));
            bt4.setTextColor(getResources().getColor(R.color.black));
        }
    }
}
