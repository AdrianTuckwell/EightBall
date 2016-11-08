package com.codeclan.example.eightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by user on 08/11/2016.
 */

public class EightBall extends AppCompatActivity{

    EditText mQuestionEditText;
    TextView mAnswerText;
    Button mShakeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        Log.d("EightBall", "onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mQuestionEditText = (EditText)findViewById(R.id.question_text);
        mAnswerText = (TextView)findViewById(R.id.answer_text);
        mShakeButton = (Button)findViewById(R.id.shake_button);

        mShakeButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Log.d("EightBall", "Shake button clicked!");
                String question = mQuestionEditText.getText().toString();
                Log.d("EightBall", "The question asked was'" + question + "'");

                Answers answers = new Answers();
                mAnswerText.setText(answers.getAnswer());

            }
        });


    }

}


