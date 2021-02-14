package com.example.unitconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class conversion extends AppCompatActivity {
    TextView tv1,tv2;
    EditText ed;
    Button btn;
    String value;
    DecimalFormat result = new DecimalFormat("0.00");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion);
        tv1 = findViewById(R.id.textView);
        tv2 = findViewById(R.id.textView2);
        ed = findViewById(R.id.editText);
        btn = findViewById(R.id.button);
        Bundle extras = getIntent().getExtras();
        value = extras.getString("btnCheck");

//        double ans;
        if("btn1".compareTo(value) ==0)
        {
            String text = "Convert feet to meters";
            tv1.setText(text);
            ed.setHint("Enter feet value");

        }
        else if ("btn2".compareTo(value) == 0)
        {
            String text = "Convert meters to feet";
            tv1.setText(text);
            ed.setHint("Enter meters value");
        }
        else if ("btn3".compareTo(value) == 0)
        {
            String text = "Convert meters to cm";
            tv1.setText(text);
            ed.setHint("Enter meters value");
        }
        else if ("btn4".compareTo(value) == 0)
        {
            String text = "Convert cm to meters";
            tv1.setText(text);
            ed.setHint("Enter cm value");
        }
        else if ("btn5".compareTo(value) == 0)
        {
            String text = "Convert km to meters";
            tv1.setText(text);
            ed.setHint("Enter km value");
        }
        else if ("btn6".compareTo(value) == 0)
        {
            String text = "Convert meters to km";
            tv1.setText(text);
            ed.setHint("Enter meters value");
        }

    }

    public void calculate(View view) {
        double num = Double.parseDouble(ed.getText().toString());
        String ans = null;
        if("btn1".compareTo(value) ==0)
        {
            ans = result.format(num / 3.2808);
            tv2.setText("Result: " + ans +"m");
        }
        else if("btn2".compareTo(value) ==0)
        {
            ans = result.format(num * 3.2808);
            tv2.setText("Result: " + ans +"ft");
        }
        else if("btn3".compareTo(value) ==0)
        {
            ans = result.format(num / 0.0100);
            tv2.setText("Result: " + ans +"cm");
        }
        else if("btn4".compareTo(value) ==0)
        {
            ans = result.format(num * 0.0100);
            tv2.setText("Result: " + ans +"m");
        }
        else if("btn5".compareTo(value) ==0)
        {
            ans = result.format(num / 0.0010);
            tv2.setText("Result: " + ans +"m");
        }
        else if("btn6".compareTo(value) ==0)
        {
            ans = result.format(num *.0010);
            tv2.setText("Result: " + ans +"km");
        }

//        Toast.makeText(getApplicationContext(),"Answer: "+ans+"m",Toast.LENGTH_SHORT).show();
    }
}