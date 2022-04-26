package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class EditTextButtonTextViewActivity extends AppCompatActivity {
    TextView statusTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text_button_text_view);
        statusTV = findViewById(R.id.statusTV);
    }

    public void submit(View view) {
        statusTV.setText("submitted");
    }
}