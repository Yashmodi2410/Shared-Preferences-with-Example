package com.example.demoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et_name;
    private EditText et_age;
    private String name;
    private String age;
    private Button btn_display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_name = findViewById(R.id.et_name);
        et_age = findViewById(R.id.et_age);
        btn_display = findViewById(R.id.btn_display);

        btn_display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = et_name.getText().toString();
                age = et_age.getText().toString();

                //Storing Data in Shared Preferences
                PrefUtil.putstringPref("name",name,MainActivity.this);
                PrefUtil.putstringPref("age",age,MainActivity.this);

                Intent intent  = new Intent(MainActivity.this,DisplayActivity.class);
                startActivity(intent);
            }
        });




    }
}
