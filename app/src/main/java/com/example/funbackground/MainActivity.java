package com.example.funbackground;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout myLayout;
    private ImageButton myButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myLayout = findViewById(R.id.layout);
        myButton = findViewById(R.id.imageButton);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random myRandomNumber = new Random();

                int color = Color.argb(255, myRandomNumber.nextInt(256),myRandomNumber.nextInt(256),
                        myRandomNumber.nextInt(256));
                myLayout.setBackgroundColor(color);
            }
        });


    }
}