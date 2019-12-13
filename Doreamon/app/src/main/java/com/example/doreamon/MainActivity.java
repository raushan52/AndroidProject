package com.example.doreamon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void click(View view)
    {
        Log.i("msg","button pressed!");

        ImageView imageview = (ImageView) findViewById(R.id.imageView);

        imageview.setImageResource(R.drawable.cat1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
