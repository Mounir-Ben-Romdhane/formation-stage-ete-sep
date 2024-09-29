package com.example.formationstage2024;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // declaration des variables
    private EditText firstNumber, secondNumber;
    private Button btnSomme;
    private TextView result;
    private String number1, number2;
    private int n1, n2, res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber = findViewById(R.id.firstNumber);
        secondNumber = findViewById(R.id.secondNumber);
        btnSomme = findViewById(R.id.btnSomme);
        result = findViewById(R.id.result);

        btnSomme.setOnClickListener(v -> {
            number1 = firstNumber.getText().toString();
            number2 = secondNumber.getText().toString();
            n1 = Integer.parseInt(number1);
            n2 = Integer.parseInt(number2);
            res = n1 + n2 ;
            result.setText(Integer.toString(res));
        });

    }
}