package com.feilong.myjnitest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("helloworld");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private native String getHelloWorldString();

    private native String getHelloCoderString();


    public void helloWorld(View view) {
        Toast.makeText(this, getHelloWorldString(), Toast.LENGTH_SHORT).show();
        Log.e("ffl", getHelloCoderString());
    }
}
