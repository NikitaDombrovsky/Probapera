package com.example.probapera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button bt1, bt2, bt3, bt4;
    int i, otv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int min = 1;
        int max = 4 ;
        int diff = max - min;
        Random random = new Random();
        i = random.nextInt(diff + 1);
        i += min;
        String s = "" + i;
        textView = findViewById(R.id.textView);
        textView.setText(s);
    }
    public void Button1 (View v){
        if (i == 1)
        {
            Toast toast = Toast.makeText(getApplicationContext(), "Успех!", Toast.LENGTH_SHORT);
            toast.show();
        }
        else {
            Toast toast = Toast.makeText(getApplicationContext(), "Ошибка", Toast.LENGTH_SHORT);
            toast.show();
        }

    }
    public void Button2 (View v){
        if (i == 2)
        {
            Toast toast = Toast.makeText(getApplicationContext(), "Успех!", Toast.LENGTH_SHORT);
            toast.show();
        }
        else {
            Toast toast = Toast.makeText(getApplicationContext(), "Ошибка", Toast.LENGTH_SHORT);
            toast.show();
        }

    }
    public void Button3 (View v){
        if (i == 3)
        {
            Toast toast = Toast.makeText(getApplicationContext(), "Успех!", Toast.LENGTH_SHORT);
            toast.show();
        }
        else {
            Toast toast = Toast.makeText(getApplicationContext(), "Ошибка", Toast.LENGTH_SHORT);
            toast.show();
        }

    }
    public void Button4 (View v){
        if (i == 4)
        {
            Toast toast = Toast.makeText(getApplicationContext(), "Успех!", Toast.LENGTH_SHORT);
            toast.show();
        }
        else {
            Toast toast = Toast.makeText(getApplicationContext(), "Ошибка", Toast.LENGTH_SHORT);
            toast.show();
        }

    }
    public void Two (View v){
        Intent intent = new Intent(this, TwoActivity.class);
        startActivity(intent);
    }
    public void Three (View v){
        Intent intent = new Intent(this, ThreeActivity.class);
        startActivity(intent);
    }
    public void Four (View v){
        Intent intent = new Intent(this, FourActivity.class);
        startActivity(intent);
    }



}