package com.example.demoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    private TextView tv_name;
    private TextView tv_age;
    private String name;
    private String age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        tv_name = findViewById(R.id.tv_name);
        tv_age = findViewById(R.id.tv_age);

        //Retreive data from Shared Preferences
        name = PrefUtil.getstringPref("name",DisplayActivity.this);
        age = PrefUtil.getstringPref("age",DisplayActivity.this);

        tv_name.setText(name);
        tv_age.setText(age);
    }
}
