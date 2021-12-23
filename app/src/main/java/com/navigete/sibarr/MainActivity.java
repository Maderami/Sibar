package com.navigete.sibarr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView findId = findViewById(R.id.auth_user);

        findId.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Authorithing.class);
            startActivity(intent);

        });
    }
}