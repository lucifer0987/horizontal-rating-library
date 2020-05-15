package com.example.android.horizontalratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.example.android.horizontalratinglibrary.horizontalRatingLibrary;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        horizontalRatingLibrary horizontalratinglibrary = findViewById(R.id.horizontal_library);
        horizontalratinglibrary.setData(1, 2, 3, 4, 5, 5);
        horizontalratinglibrary.setTitle("Ratings Bar");

    }
}
