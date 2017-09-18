package com.example.menno_000.mennolont_pset2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OutputScreenActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.outputscreen);

        Intent intent = getIntent();
        String receivedStory = (String) intent.getSerializableExtra("outputStory");

        TextView textView = (TextView) findViewById(R.id.output);
        textView.setText(receivedStory);
    }

    public void goToFirst(View view) {
        Intent intent = new Intent(this, StartScreenActivity.class);
        startActivity(intent);
        finish();
    }
}
