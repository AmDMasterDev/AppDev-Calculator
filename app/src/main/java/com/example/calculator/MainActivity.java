package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText display;
    float res1, res2;
    boolean add, sub, mul, div, point = true;


    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, decimal, equal, plus, minus,
    multi, divide, clear_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display_text);
        display.setShowSoftInputOnFocus(false);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multi = findViewById(R.id.multi);
        divide = findViewById(R.id.divide);
        equal = findViewById(R.id.equal);
        decimal = findViewById(R.id.decimal);
        clear_btn = findViewById(R.id.clear_btn);


        btn0.setOnClickListener(view -> display.setText(display.getText() + "0"));

        btn1.setOnClickListener(view -> display.setText(display.getText() + "1"));

        btn2.setOnClickListener(view -> display.setText(display.getText() + "2"));

        btn3.setOnClickListener(view -> display.setText(display.getText() + "3"));

        btn4.setOnClickListener(view -> display.setText(display.getText() + "4"));

        btn5.setOnClickListener(view -> display.setText(display.getText() + "5"));

        btn6.setOnClickListener(view -> display.setText(display.getText() + "6"));

        btn7.setOnClickListener(view -> display.setText(display.getText() + "7"));

        btn8.setOnClickListener(view -> display.setText(display.getText() + "8"));

        btn9.setOnClickListener(view -> display.setText(display.getText() + "9"));

        decimal.setOnClickListener(view -> {
            if (!point) {return;}
            display.setText(display.getText() + ".");
            point = false;
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (display == null) {
                    display.setText(" ");
                } else {
                    res1 = Float.parseFloat(display.getText().toString());
                    add = true;
                    display.setText(null);
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (display == null) {
                    display.setText(" ");
                } else {
                    res1 = Float.parseFloat(display.getText().toString());
                    sub = true;
                    display.setText(null);
                }
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (display == null) {
                    display.setText(" ");
                } else {
                    res1 = Float.parseFloat(display.getText().toString());
                    mul = true;
                    display.setText(null);
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (display == null) {
                    display.setText(" ");
                } else {
                    res1 = Float.parseFloat(display.getText().toString());
                    div = true;
                    display.setText(null);
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res2 = Float.parseFloat(display.getText().toString());

                if (add) {
                    res1 += res2;
                    display.setText(res1+"");
                    add = false;
                } else if (sub) {
                    res1 -= res2;
                    display.setText(res1+"");
                    sub = false;
                } else if (mul) {
                    res1 *= res2;
                    display.setText(res1+"");
                    mul = false;
                } else if (div) {
                    res1 /= res2;
                    display.setText(res1+"");
                    div = false;
                }

                point = true;
            }
        });

        clear_btn.setOnClickListener(view -> display.setText(" "));
    }

}