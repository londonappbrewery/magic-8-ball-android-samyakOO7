package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button ask=(Button)findViewById(R.id.askbutton);
        final int[] ballarray={R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};
        final TextView text=(TextView)findViewById(R.id.textView);
        final ImageView img=(ImageView)findViewById(R.id.imageView);
        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomvariable = new Random();
                int num=randomvariable.nextInt(5);
                img.setImageResource(ballarray[num]);

            }
        });
    }
}
