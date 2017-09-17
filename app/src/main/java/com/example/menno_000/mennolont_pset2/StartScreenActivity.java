package com.example.menno_000.mennolont_pset2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startScreen);
    }

    public void goToSecond(View view) {
        Intent intent = new Intent(this, ChooseStoryActivity.class);
        startActivity(intent);
    }
}

