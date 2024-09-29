package com.example.formationstage2024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {

    // declaration des variables
    private TextView goToSignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        goToSignIn = findViewById(R.id.go_to_sign_in);

        goToSignIn.setOnClickListener(v -> {
            startActivity(new Intent(SignUpActivity.this, SecondActivity.class));
        });

    }
}