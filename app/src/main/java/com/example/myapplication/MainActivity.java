package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView imageView;
Button blink,fade,move,rotate,slide,zoom,stopanimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
imageView=findViewById(R.id.imageView);
blink=findViewById(R.id.blink);
fade=findViewById(R.id.fade);
move=findViewById(R.id.move);
rotate=findViewById(R.id.rotate);
slide=findViewById(R.id.slide);
zoom=findViewById(R.id.Zoom);
stopanimation=findViewById(R.id.stopanimation);

blink.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink_animation);
        imageView.startAnimation(animation);
    }
});
        fade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_animation);
                imageView.startAnimation(animation);
            }
        });
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move_animation);
                imageView.startAnimation(animation);
            }
        });
        rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
                imageView.startAnimation(animation);
            }
        });
        slide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide);
                imageView.startAnimation(animation);
            }
        });
        zoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
                imageView.startAnimation(animation);
            }
        });
        stopanimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             imageView.clearAnimation();
            }
        });

    }
}