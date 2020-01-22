package myfirstapkas.com.stopwatch;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;
import java.util.concurrent.TimeoutException;

public class MainActivity extends AppCompatActivity {

    private boolean TimerRunning;
    private long  TimeLeft=60000;
    private CountDownTimer mCountDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView TIME = findViewById(R.id.time);
        final Button START_BTN = findViewById(R.id.btn);
        final  Button RESET_BTN = findViewById(R.id.btn2);


       START_BTN.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if(TimerRunning){
                   START_BTN.setText("START");
                   mCountDownTimer.cancel();
                   RESET_BTN.setVisibility(View.VISIBLE);
                   TimerRunning=false;



               }
               else{
                  mCountDownTimer =new CountDownTimer(TimeLeft,1000) {
                      @Override
                      public void onTick(long Time) {
                          TimeLeft=Time;
                          int minute = (int) (TimeLeft/1000)/60;
                          int second = (int) (TimeLeft/1000)%60;


                          String Timeformat = String.format("%02d:%02d",minute,second);
                          TIME.setText(Timeformat);

                      }

                      @Override
                      public void onFinish() {
                          RESET_BTN.setVisibility(View.INVISIBLE);
                          TimerRunning=false;
                          TIME.setText("START");

                      }
                  }.start();
                   START_BTN.setText("STOP");
                   RESET_BTN.setVisibility(View.INVISIBLE);
                   TimerRunning =true;


               }



           }
       });


       RESET_BTN.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               TIME.setText("00:00");
               TimeLeft =60000;
           }
       });






    }
}
