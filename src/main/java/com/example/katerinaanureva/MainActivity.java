package com.example.katerinaanureva;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView katya;
    Button pushMe;

    int clickCount = 0;

    View.OnClickListener obrobka = new View.OnClickListener() {
        public void onClick(View v) {
            clickCount++;
            if (clickCount == 1) {
                katya.setText("Button was pressed");
            } else if (clickCount == 2) {
                katya.setText("You've already pressed me");
            } else if (clickCount >= 3) {
                katya.setText("That's enough for me");
                pushMe.setEnabled(false);
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        katya = findViewById(R.id.textView);
        pushMe = findViewById(R.id.button2);

        pushMe.setOnClickListener(obrobka);
    }
}
