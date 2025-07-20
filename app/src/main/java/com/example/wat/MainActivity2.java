package com.example.wat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ViewFlipper;


public class MainActivity2 extends AppCompatActivity {

    int j = 15,c = 15;
    private static int score = 0;
    EditText sentence;
    String time, value, string = "hello", Word;
    boolean loop = true;
    boolean stop = true;// wasRunning;
    InputMethodManager im;
    private void runTimer(TextView timer,ViewFlipper vf) {
        final Handler handler = new Handler();
        handler . post(new Runnable() {
            @Override
            public void run() {
                if((j == 15) && (c == 0)){
                    im.hideSoftInputFromWindow(sentence.getWindowToken(), 0);
                    sentence.setText("");
                    vf.showNext();
                    c = 15;
                }
                time = ("Time Left : " + j);
                timer.setText(time);
                j--;
                c--;
                if(j == 0) j = 15;
                if(stop){
                handler.postDelayed(this,1000);
                }
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final TextView timer = findViewById(R.id.timer);
        ViewFlipper vf = findViewById(R.id.viewflipper);
        sentence = findViewById(R.id.sentence);
        Button restart = findViewById(R.id.restart);
        //ImageButton tick = findViewById(R.id.tick);
        TextView scoreboard = findViewById(R.id.scoreTxt);
        im = (InputMethodManager) this.getSystemService(Activity.INPUT_METHOD_SERVICE);
        Typeface tf = ResourcesCompat.getFont(this,R.font.open_sans_bold);
        Intent intent = getIntent();
        Word = "";
        score = 0;
        sentence.setVisibility(View.VISIBLE);
        //tick.setVisibility(View.VISIBLE);
        scoreboard.setVisibility(View.INVISIBLE);


        int ik = 1;

        while(loop) {
            TextView t1 = new TextView(this);
            //QUEUE DEQUEUE OPERATION
            value = Queue.dequeue();
            if(value.equalsIgnoreCase("stop")){
               // Word = String.valueOf(score);
                Word = "Test Completed";
                loop = false;
            }
            else{
                Word = ik +". " +value;
            }
            t1.setTextSize(30);
            t1.setText(Word);
            t1.setTextSize(32);
            t1.setTextColor(Color.parseColor("#FFFFFF"));
            t1.setBackgroundResource(R.drawable.back5);
            t1.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            t1.setTypeface(tf);
            t1.setPadding(15,5,15,5);

            vf.addView(t1,new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            ik++;
        }


        Animation in = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
        Animation out = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);

        vf.setInAnimation(in);
        vf.setOutAnimation(out);
        runTimer(timer,vf);

        vf.getInAnimation().setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {}
            @Override
            public void onAnimationEnd(Animation animation) {

                int total = vf.getChildCount();
                int t = vf.getDisplayedChild();
                if(total-1 == t){
                    stop = false;
                    sentence.setVisibility(View.INVISIBLE);
                    timer.setVisibility(View.INVISIBLE);
                    restart.setVisibility(View.VISIBLE);
//                        sentence.setEnabled(false);
//                        tick.setEnabled(false);
//                        tick.setVisibility(View.INVISIBLE);
//                        scoreboard.setVisibility(View.VISIBLE);
                   // sentence.setText("");
                    vf.stopFlipping();
                }
            }
            @Override
            public void onAnimationRepeat(Animation animation) {}
        });

        restart.setOnClickListener(v -> {
            Intent iq = new Intent(MainActivity2.this, MainActivity.class);
            startActivity(iq);
            finish();
        });

//        tick.setOnClickListener(view -> {
//            if(sentence.getText().toString().equals("")) {
//                sentence.setError("Write a sentence");
//            }else {
//                boolean string = sentence.getText().toString().equals("Hello");
//                if (string) {
//                    scoreboard.setText("Score : " + score);
//                } else {
//                    scoreboard.setText("Not scored well");
//                }
//            }
//        });
    }

//    @Override
//    protected void onResume() {
//        stop = true;
//        igh = j;
//        text23.setText(String.format(Locale.getDefault(),"%d",j));
//        super.onResume();
//
//    }
//    @Override
//    protected void onPause() {
//        super.onPause();
//        stop = true;
//        igh = 1;
//    }
//
    //    @Override
//    protected void onStart() {
//        super.onStart();
//        if(wasRunning) stop = true;
//    }
//
//    @Override
//    protected void onStop() {
//        if(wasRunning) stop = true;
//        super.onStop();
//    }
//
//    @Override
//    protected void onRestart() {
//        if(wasRunning) stop = true;
//        super.onRestart();
//    }
//
//    @Override
//    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
//        super.onSaveInstanceState(outState, outPersistentState);
//        outState.putInt("j",j);
//        outState.putBoolean("stop",stop);
//        outState.putBoolean("wasRunning",wasRunning);
//        outState.putInt("igh",igh);
//       }

}