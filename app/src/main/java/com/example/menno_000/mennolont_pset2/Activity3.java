package com.example.menno_000.mennolont_pset2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        Intent intent = getIntent();
        String receivedText1 = intent.getStringExtra("text1");

        TextView textView = (TextView) findViewById(R.id.editText1);
        textView.setText(receivedText1);
    }

    public void goToFirst(View view) {
        Intent intent = new Intent(this, Activity1.class);
        startActivity(intent);
        finish();
    }
}
