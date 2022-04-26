package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView statusTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //statusTV = findViewById(R.id.statusTV);
    }

    public void submit(View view) {
        statusTV.setText("submitted");
    }

    public void formActivity(View view) {
        Intent intent = new Intent(MainActivity.this, EditTextButtonTextViewActivity.class);
        startActivity(intent);
    }

    public void openAdapter(View view) {
        Intent intent = new Intent(MainActivity.this, AdapterViewActivity.class);
        startActivity(intent);
    }

}