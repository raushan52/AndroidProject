package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void generateRandomNumber()
    {
        Random random = new Random();

        randomNumber = random.nextInt(20)+1;
    }

    public void guess(View view)
    {
        EditText editText = (EditText) findViewById(R.id.editText);

        String editTextInString = editText.getText().toString();

        Log.i("Entered Value", editTextInString);

        Log.i("Random Number", Integer.toString(randomNumber));

        int guessValue = Integer.parseInt(editTextInString);

        String message;

       if(guessValue > randomNumber)
        {
            message = "Lower!";
        }else if (guessValue < randomNumber)
       {
           message = "Higner!";
       }
       else {
           message = "You got It. Try again";
           Random random = new Random();

           generateRandomNumber();
       }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       generateRandomNumber();
    }
}
