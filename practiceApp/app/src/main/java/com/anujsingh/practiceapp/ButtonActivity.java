package com.anujsingh.practiceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;

public class ButtonActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        Button btn  = findViewById(R.id.button);
        Button btn2  = findViewById(R.id.button2);
        Button btn3  = findViewById(R.id.button3);

        btn.setOnClickListener(this);    //
        btn2.setOnClickListener(this);   //     this use for
        btn3.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.button) {

            TextView txt1 = findViewById(R.id.textView); //btn 1 works here
            txt1.setText("Btn 1");
        }

        else if(view.getId()==R.id.button2) {
            TextView txt1 = findViewById(R.id.textView2); //btn 2 works here
            txt1.setText("Btn 2");
    }else if(view.getId()==R.id.button3){
            TextView txt1 = findViewById(R.id.textView3); //btn 3 works here
            txt1.setText("Btn 3");
        }
    }
}
