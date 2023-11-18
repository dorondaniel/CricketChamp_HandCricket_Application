package com.example.cricketchamp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {
    ImageButton start,exit;
    Integer score=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        start = findViewById(R.id.start_btn);
        start.setBackgroundColor(Color.TRANSPARENT);
        exit = findViewById(R.id.exit_btn);
        exit.setBackgroundColor(Color.TRANSPARENT);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.game_layout);

                Button b0,b1,b2,b3,b4,b5,b6;
                TextView player,oppo,card;
                ImageButton home_btn,reset_btn;
                Random rand;

                rand = new Random();

                Integer[] opponent_scores = {0,1,2,3,4,5,6};

                home_btn = findViewById(R.id.home);
                home_btn.setBackgroundColor(Color.TRANSPARENT);
                reset_btn = findViewById(R.id.reset);
                reset_btn.setBackgroundColor(Color.TRANSPARENT);

                b0 = findViewById(R.id.zero);
                b1 = findViewById(R.id.one);
                b2 = findViewById(R.id.two);
                b3 = findViewById(R.id.three);
                b4 = findViewById(R.id.four);
                b5 = findViewById(R.id.five);
                b6 = findViewById(R.id.six);

                player = findViewById(R.id.our_score);
                oppo = findViewById(R.id.opponent);
                card = findViewById(R.id.score_card_total);

                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        card.setText(Integer.toString(score));
                        player.setText(Integer.toString(0));
                        oppo.setText(Integer.toString(opponent_scores[rand.nextInt(opponent_scores.length)]));
                        if (player.getText() == oppo.getText()){
                            Toast.makeText(MainActivity.this, "OUT!! You Scored: "+score, Toast.LENGTH_LONG).show();
                            score = 00;
                            card.setText(Integer.toString(score));
                            player.setText(Integer.toString(score));
                            oppo.setText(Integer.toString(00));
                        }
                    }
                });


                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        score+=1;
                        player.setText(Integer.toString(1));
                        card.setText(Integer.toString(score));
                        oppo.setText(Integer.toString(opponent_scores[rand.nextInt(opponent_scores.length)]));
                        if (player.getText() == oppo.getText()){
                            Toast.makeText(MainActivity.this, "OUT!! You Scored: "+score, LENGTH_LONG).show();
                            score = 00;
                            card.setText(Integer.toString(score));
                            player.setText(Integer.toString(score));
                            oppo.setText(Integer.toString(00));
                        }
                    }
                });

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        score+=2;
                        player.setText(Integer.toString(2));
                        card.setText(Integer.toString(score));
                        oppo.setText(Integer.toString(opponent_scores[rand.nextInt(opponent_scores.length)]));
                        if (player.getText() == oppo.getText()){
                            Toast.makeText(MainActivity.this, "OUT!! You Scored: "+score, LENGTH_LONG).show();
                            score = 00;
                            card.setText(Integer.toString(score));
                            player.setText(Integer.toString(score));
                            oppo.setText(Integer.toString(00));
                        }
                    }
                });

                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        score+=3;
                        player.setText(Integer.toString(3));
                        card.setText(Integer.toString(score));
                        oppo.setText(Integer.toString(opponent_scores[rand.nextInt(opponent_scores.length)]));
                        if (player.getText() == oppo.getText()){
                            Toast.makeText(MainActivity.this, "OUT!! You Scored: "+score, LENGTH_LONG).show();
                            score = 00;
                            card.setText(Integer.toString(score));
                            player.setText(Integer.toString(score));
                            oppo.setText(Integer.toString(00));
                        }
                    }
                });

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        score+=4;
                        player.setText(Integer.toString(4));
                        card.setText(Integer.toString(score));
                        oppo.setText(Integer.toString(opponent_scores[rand.nextInt(opponent_scores.length)]));
                        if (player.getText() == oppo.getText()){
                            Toast.makeText(MainActivity.this, "OUT!! You Scored: "+score, LENGTH_LONG).show();
                            score = 00;
                            card.setText(Integer.toString(score));
                            player.setText(Integer.toString(score));
                            oppo.setText(Integer.toString(00));
                        }
                    }
                });

                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        score+=5;
                        player.setText(Integer.toString(5));
                        card.setText(Integer.toString(score));
                        oppo.setText(Integer.toString(opponent_scores[rand.nextInt(opponent_scores.length)]));
                        if (player.getText() == oppo.getText()){
                            Toast.makeText(MainActivity.this, "OUT!! You Scored: "+score, LENGTH_LONG).show();
                            score = 00;
                            card.setText(Integer.toString(score));
                            player.setText(Integer.toString(score));
                            oppo.setText(Integer.toString(00));
                        }
                    }
                });

                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        score+=6;
                        player.setText(Integer.toString(6));
                        card.setText(Integer.toString(score));
                        oppo.setText(Integer.toString(opponent_scores[rand.nextInt(opponent_scores.length)]));
                        if (player.getText() == oppo.getText()){
                            Toast.makeText(MainActivity.this, "OUT!! You Scored: "+score, LENGTH_LONG).show();
                            score = 00;
                            card.setText(Integer.toString(score));
                            player.setText(Integer.toString(score));
                            oppo.setText(Integer.toString(00));
                        }
                    }
                });

                home_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        finish();
                    }
                });

                reset_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        score = 00;
                        card.setText(Integer.toString(score));
                        player.setText(Integer.toString(score));
                        oppo.setText(Integer.toString(00));
                    }
                });

            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });
    }
}