package com.navigete.sibarr;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Authorithing extends AppCompatActivity {
    private Toolbar mainToolbar;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        Button findid = findViewById(R.id.button3);
        findid.setOnClickListener(v -> {
            Intent intent = new Intent(Authorithing.this, MapActivity.class);
            startActivity(intent);
            finish();
        });

        setSupportActionBar(mainToolbar);
        ImageView back =  findViewById(R.id.back);
        back.setOnClickListener(v->{
            onBackPressed();
            finish();
        });
//      mainToolbar.setOnClickListener(v->{getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//          getSupportActionBar().setDisplayShowHomeEnabled(true);});
//
//
//         toolbar.setOnClickListener(v -> {
//
//         });
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//Ocultar ActivityBar anterior
//

    }
}
