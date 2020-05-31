package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = "dong";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(this);

        findViewById(R.id.checkBox).setOnClickListener(this);

        findViewById(R.id.radioButton).setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.button:
                Log.d(TAG,"click Button\n");
                break;
            case R.id.checkBox:
                Log.d(TAG,"click Checkbox\n");
                break;
            case R.id.radioButton:
                Log.d(TAG,"click RadioButton\n");
                break;
        }
    }
}
