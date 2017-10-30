package com.example.framgianguyenvulan.rxjavabeginning.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.framgianguyenvulan.rxjavabeginning.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startSimpleActivity(View view) {
        startActivity(new Intent(MainActivity.this, SimpleExampleActivity.class));
    }

    public void startMapActivity(View view) {
        startActivity(new Intent(MainActivity.this, MapActivity.class));
    }

    public void startZipActivity(View view) {
        startActivity(new Intent(MainActivity.this, ZIpActivity.class));
    }

    public void startTakeActivity(View view) {
        startActivity(new Intent(MainActivity.this, TakeActivity.class));
    }
}
