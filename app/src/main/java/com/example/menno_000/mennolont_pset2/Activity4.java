package com.example.menno_000.mennolont_pset2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
    }

    public void goToThird(View view) {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
        finish();
    }
}
