package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void userDetails(View view)
    {
        EditText userNameEditText = (EditText) findViewById(R.id.userNameEditText);

        EditText passwordEditText = (EditText) findViewById(R.id.passwordEditText);

        Log.i("msg", "Button Pressed!");

        Log.i("UserName",userNameEditText.getText().toString());

        Log.i("Password", passwordEditText.getText().toString());

        Toast.makeText(this, "Hi there!", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
