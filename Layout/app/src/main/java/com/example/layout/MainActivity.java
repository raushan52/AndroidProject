package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {



    public void fade(View view) {


        Log.i("info", "Image Tapped!");

        ImageView bartaImageView = (ImageView) findViewById(R.id.bartaImageView);

        ImageView homerImageView = (ImageView) findViewById(R.id.homerImageView);

        bartaImageView.animate().scaleX(0.5f).scaleY(0.5f).setDuration(1000);





    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bartaImageView = (ImageView) findViewById(R.id.bartaImageView);

        bartaImageView.setX(-1200);

        bartaImageView.animate().translationXBy(1200).rotation(3600).setDuration(2000);
    }
}
