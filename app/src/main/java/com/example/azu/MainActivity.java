package com.example.azu;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View view){

        setContentView(R.layout.game);
    }

    public void stop(View view){
        finish();
    }

    int temp=0;
    Drawable back=null;
    ImageButton bt=null;
    public void onclick(View view){
        TextView text = (TextView)findViewById(R.id.textView);
        if(temp%2==0){
            bt = (ImageButton)findViewById(view.getId());
            temp++;
        }
        else{
            ImageButton btt = (ImageButton)findViewById(view.getId());
            int a=Integer.parseInt(String.valueOf(btt.getId()));
            int b=Integer.parseInt(String.valueOf(bt.getId()));
            if(a+1==b||a-1==b){
                btt.setVisibility(View.INVISIBLE);
                bt.setVisibility(View.INVISIBLE);
                text.setText(String.valueOf(Integer.parseInt(text.getText().toString())+1));
            }
            bt=null;
            back=null;
            temp--;
        }
        if(Integer.parseInt(text.getText().toString())==8){
            findViewById(R.id.constraint).setBackgroundResource(R.drawable.victory);
        }

    }
}
