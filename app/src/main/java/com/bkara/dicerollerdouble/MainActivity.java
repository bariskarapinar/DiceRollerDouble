package com.bkara.dicerollerdouble;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView imageview,imageView2;
    private ImageButton imageButton;
    private Random random=new Random();
    Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageview=findViewById(R.id.iv1);
        imageView2=findViewById(R.id.iv2);
        imageButton=findViewById(R.id.imageButton2);
    }


    public void btnclick(View view){
        int a= rollDice();
        int b= rollDice2();
        String c=String.valueOf(a+b);
        rotatedice();
    }
    private void rotatedice(){
        animation= AnimationUtils.loadAnimation(this,R.anim.animation);
        imageview.startAnimation(animation);
        imageView2.startAnimation(animation);
    }

    private int rollDice(){
        int randomNumber=random.nextInt(6)+1;

        switch (randomNumber){
            case 1:
                imageView2.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageView2.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageView2.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageView2.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageView2.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageView2.setImageResource(R.drawable.dice6);
                break;
        }
        return randomNumber;
    }

    private int  rollDice2(){
        int randomNumber2=random.nextInt(6)+1;

        switch (randomNumber2){
            case 1:
                imageview.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageview.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageview.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageview.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageview.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageview.setImageResource(R.drawable.dice6);
                break;
        }
        return randomNumber2;
    }
}

