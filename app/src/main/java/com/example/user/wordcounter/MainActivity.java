package com.example.user.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText questionEditText;
    Button countText;
    TextView answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionEditText = (EditText)findViewById(R.id.question);
        countText = (Button)findViewById(R.id.count);
        answerText = (TextView)findViewById(R.id.answer_word_count);
    }

    public void onClick(View button){
        String question = questionEditText.getText().toString();
        Log.d("Wordcount", question);

        Wordcount wordcount = new Wordcount();
        answerText.setText(wordcount.countWord(question));


    }
}
