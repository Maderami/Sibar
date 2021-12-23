package com.navigete.sibarr;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class SearchPage extends AppCompatActivity {
    private Toolbar mainToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        setSupportActionBar(mainToolbar);
        ImageView back =  findViewById(R.id.back);
        back.setOnClickListener(v->{
            onBackPressed();
        });
    }
}
