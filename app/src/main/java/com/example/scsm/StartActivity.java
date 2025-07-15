package com.example.scsm;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent; // Import Intent class
import android.os.Bundle;
import android.view.View; // Import View class
import android.widget.Button; // Import Button class

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        // Find the button by its ID
        Button normalButton = findViewById(R.id.btn_normal);
        Button urgentButton = findViewById(R.id.btn_urgent);

        urgentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this, ReciverDetailActivity.class);
                startActivity(intent);
            }
        });

        // Set an OnClickListener for the button
        normalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start SenderDetailActivity
                Intent intent = new Intent(StartActivity.this, ReciverDetailActivity.class);
                // Start the new activity
                startActivity(intent);
            }
        });
    }
}
