package com.example.menno_000.mennolont_pset2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void goToFourth(View view) {

        EditText editText = (EditText) findViewById(R.id.editText1);
        String text1 = editText.getText().toString();

        Intent intent = new Intent(this, Activity3.class);
        intent.putExtra("text1",text1);

        startActivity(intent);
        finish();
    }
}