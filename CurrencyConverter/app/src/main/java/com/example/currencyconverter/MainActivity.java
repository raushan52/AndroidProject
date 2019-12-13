package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.String.valueOf;

public class MainActivity extends AppCompatActivity {

    public void convert(View view)
    {
        Log.i("msg","Button Pressed!");

        EditText editText = (EditText) findViewById(R.id.editText);

        String valueInDollor = editText.getText().toString();

        Log.i("Ammount in Dollor", valueInDollor);

        double valueInDollorDouble = Double.parseDouble(valueInDollor);

        double valueInRupeeDouble = valueInDollorDouble * 71.09;

        String valueInRupeeString = String.format("%.2f",valueInRupeeDouble);

        Log.i("Ammount in Rupee",valueInRupeeString);

        Toast.makeText(this, valueInDollor +" $"+ " is = "+ valueInRupeeString, Toast.LENGTH_LONG).show();

        //Log.i("Value", valueInRupee);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
