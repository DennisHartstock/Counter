package com.example.counter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

public class MainActivity extends AppCompatActivity {
    private TextView countTextView;
    private MainActivityViewModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        model = new ViewModelProvider(this).get(MainActivityViewModel.class);
        countTextView = findViewById(R.id.countTextView);
        countTextView.setText(String.valueOf(model.getCurrentCount()));
    }

    public void decreaseCount(View view) {
        countTextView.setText(String.valueOf(model.getDecreasedCount()));
    }

    public void increaseCount(View view) {
        countTextView.setText(String.valueOf(model.getIncreasedCount()));
    }
}