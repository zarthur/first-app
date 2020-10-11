package com.arthurneuman.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView output = (TextView) findViewById((R.id.output));
        StringBuilder builder = new StringBuilder();

        int numberOfAnimals = 3;
        String[] animals = new String[numberOfAnimals];
        animals[0] = "cat";
        animals[1] = "dog";
        animals[2] = "chicken";

        builder.append(animals[1]);

        output.setText(builder);
    }
}