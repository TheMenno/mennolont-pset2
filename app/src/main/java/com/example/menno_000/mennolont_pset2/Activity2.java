package com.example.menno_000.mennolont_pset2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Activity2 extends AppCompatActivity {

    Story story;

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


    public void storytell() {

        Context context = getApplicationContext();

        try { InputStream stream = context.getAssets().open("madlib0_simple.txt");
            story = new Story(stream);
        }
        catch (IOException e) {
            e.printStackTrace();
        }


        // First make clear that everything is set to standard values
        story.clear();

        // Then check if there are more words to fill in, and else return the story
        while (story.isFilledIn() == false) {
            String next = story.getNextPlaceholder();
            story.fillInPlaceholder(next);
        }

        // Story
        story.toString();

    }
}