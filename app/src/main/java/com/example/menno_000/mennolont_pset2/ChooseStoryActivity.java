package com.example.menno_000.mennolont_pset2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.IOException;
import java.io.InputStream;

public class ChooseStoryActivity extends AppCompatActivity {

    Story story;
    String storyName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chooseStory);

    }

    public void inputStory(){
        Context context = getApplicationContext();
        storyName = "madlib0_simple.txt";

        try {
            InputStream stream = getAssets().open(storyName);
            story = new Story(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        goToThird();
    }

    public void goToThird() {
        Intent intent = new Intent(this, InputWordsActivity.class);
        intent.putExtra("pickedStory",story);

        startActivity(intent);
        finish();
    }

}
