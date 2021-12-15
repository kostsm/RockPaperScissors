package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;

import java.text.BreakIterator;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public Button button;
    public Button button2;
    public Button button3;
    public TextView textView;
    int count1, count2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int i = random.nextInt(3);
                if (i == 0) {
                    count1++;
                    textView.setText("Win!" + "\n" + "The opponent chose scissors!" + "\n" + "\n" + "You: " + count1 + "\n" + "Computer: " + count2);
                }
                if (i == 1) {
                    textView.setText("Draw!" + "\n" + "The opponent chose a rock!" + "\n" + "\n" + "You: " + count1 + "\n" + "Computer: " + count2);
                }
                if (i == 2) {
                    count2++;
                    textView.setText("Defeat!" + "\n" + "The opponent chose paper!" + "\n" + "\n" + "You: " + count1 + "\n" + "Computer: " + count2);
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int i = random.nextInt(3);
                if (i == 1) {
                    textView.setText("Draw!" + "\n" + "The opponent chose scissors!" + "\n" + "\n" + "You: " + count1 + "\n" + "Computer: " + count2);

                }
                if (i == 0) {
                    count2++;
                    textView.setText("Defeat!" + "\n" + "The opponent chose a rock!" + "\n" + "\n" + "You: " + count1 + "\n" + "Computer: " + count2);
                }
                if (i == 2) {
                    count1++;
                    textView.setText("Win!" + "\n" + "The opponent chose paper!" + "\n" + "\n" + "You: " + count1 + "\n" + "Computer: " + count2);
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int i = random.nextInt(3);
                if (i == 2) {
                    textView.setText("Draw!" + "\n" + "The opponent chose paper!" + "\n" + "\n" + "You: " + count1 + "\n" + "Computer: " + count2);
                }
                if (i == 1) {
                    count2++;
                    textView.setText("Defeat!" + "\n" + "The opponent chose scissors!" + "\n" + "\n" + "You: " + count1 + "\n" + "Computer: " + count2);
                }
                if (i == 0) {
                    count1++;
                    textView.setText("Win!" + "\n" + "The opponent chose a rock!" + "\n" + "\n" + "You: " + count1 + "\n" + "Computer: " + count2);
                }
            }
        });
    }

    public void rest(View view) {
        count1 = 0;
        count2 = 0;
        textView.setText("New game!" + "\n" +"\n"+ "You: " + count1 + "\n" + "Computer: " + count2);
    }
}