package com.example.androidcourse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        Intent intent = getIntent();
        Log.d("TAG", intent.getStringExtra("name"));

        TextView name = (TextView)findViewById(R.id.name);
        name.setText("Hi " + intent.getStringExtra("name"));
    }
}
