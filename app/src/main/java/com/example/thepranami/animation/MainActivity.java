package com.example.thepranami.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView fan1, fan2;
    Button zoonm_button, repeat_button, move_button, rotate, rotate_a, rotate_b, changeFan, stopFan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fan1=(ImageView)findViewById(R.id.image_id);
        fan2=(ImageView)findViewById(R.id.image2_id);
//        zoonm_button=(Button)findViewById(R.id.button_id);
//        repeat_button=(Button)findViewById(R.id.repeat_id) ;
//        move_button=(Button)findViewById(R.id.move_id);
        rotate=(Button)findViewById(R.id.rotate);
        rotate_a=(Button)findViewById(R.id.rotate_a);
        rotate_b=(Button)findViewById(R.id.rotate_b);
        changeFan=(Button)findViewById(R.id.changeFan);
        stopFan=(Button)findViewById(R.id.stopFan);
        stopFan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.stop);
                fan1.startAnimation(animation);
                fan2.startAnimation(animation);
            }
        });
        changeFan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fan1.getVisibility()==View.VISIBLE){
                    fan1.setVisibility(View.GONE);
                    fan2.setVisibility(View.VISIBLE);
                }else if (fan2.getVisibility()==View.VISIBLE){
                    fan2.setVisibility(View.GONE);
                    fan1.setVisibility(View.VISIBLE);
                }
            }
        });

//        zoonm_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoom);
//                imageView.startAnimation(animation);
//            }
//        });
//        repeat_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.repeat);
//                imageView.startAnimation(animation);
//            }
//        });
//        move_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.move);
//                imageView.startAnimation(animation);
//            }
//        });
        rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
                if (fan1.getVisibility()==View.VISIBLE){
                    fan1.startAnimation(animation);
                }else {
                    fan2.startAnimation(animation);
                }
            }
        });
        rotate_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate_a);
                if (fan1.getVisibility()==View.VISIBLE){
                    fan1.startAnimation(animation);
                }else {
                    fan2.startAnimation(animation);
                }
            }
        });
        rotate_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate_b);
                if (fan1.getVisibility()==View.VISIBLE){
                    fan1.startAnimation(animation);
                }else {
                    fan2.startAnimation(animation);
                }
            }
        });
    }
}
