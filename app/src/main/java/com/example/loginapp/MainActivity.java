package com.example.loginapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    Button login_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username =findViewById(R.id.username_input);
        password =findViewById(R.id.password_input);
        login_btn =findViewById(R.id.login_btn);
        login_btn.setOnClickListener(this::onClick);
}

    private void onClick(View view) {
        if (username.getText().toString().equals("user") && password.getText().toString().equals("3434")) {
            Toast.makeText(MainActivity.this, "login Successful", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "login failed", Toast.LENGTH_SHORT).show();

        }

    }
}