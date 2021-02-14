package com.example.unitconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2,btn3, btn4, btn5, btn6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btnfm);
        btn2 = findViewById(R.id.btnmf);
        btn3 = findViewById(R.id.btnmc);
        btn4 = findViewById(R.id.btncm);
        btn5 = findViewById(R.id.btnkm);
        btn6 = findViewById(R.id.btnmk);

    }

    public void feetToMeter(View view) {
        Intent intent = new Intent(MainActivity.this, conversion.class);
        String btn = "btn1";
        intent.putExtra("btnCheck",btn);
        startActivity(intent);
    }

    public void MetertoFeet(View view) {
        Intent intent = new Intent(MainActivity.this, conversion.class);
        String btn = "btn2";
        intent.putExtra("btnCheck",btn);
        startActivity(intent);
    }

    public void MetertoCM(View view) {
        Intent intent = new Intent(MainActivity.this, conversion.class);
        String btn = "btn3";
        intent.putExtra("btnCheck",btn);
        startActivity(intent);
    }

    public void CMtoMeter(View view) {
        Intent intent = new Intent(MainActivity.this, conversion.class);
        String btn = "btn4";
        intent.putExtra("btnCheck",btn);
        startActivity(intent);
    }

    public void KMtoMeter(View view) {
        Intent intent = new Intent(MainActivity.this, conversion.class);
        String btn = "btn5";
        intent.putExtra("btnCheck",btn);
        startActivity(intent);
    }

    public void MetertoKM(View view) {
        Intent intent = new Intent(MainActivity.this, conversion.class);
        String btn = "btn6";
        intent.putExtra("btnCheck",btn);
        startActivity(intent);
    }
}