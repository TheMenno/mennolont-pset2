package com.example.menno_000.mennolont_pset2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.IOException;
import java.io.InputStream;

public class InputWordsActivity extends AppCompatActivity {

    Story story;
    String storyText;
    View views;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inputWords);

        Intent intent = getIntent();
        story = (Story) intent.getSerializableExtra("pickedStory");
    }

    public void createStory() {
        EditText editText = (EditText) findViewById(R.id.storyWords);
        String inputText = editText.getText().toString();

        editText.setText("");
        story.fillInPlaceholder(inputText);
        if (story.isFilledIn()){
            storyText = story.toString();
            goToFourth(views);
        }
    }

    public void goToFourth(View view) {
        Intent intent = new Intent(this, OutputScreenActivity.class);
        intent.putExtra("outputStory", storyText);

        startActivity(intent);
        finish();
    }
}