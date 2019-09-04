package com.bwie.jnindkdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bwie.jnindkdemo2.R;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("hi");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("jjjjjjjj==="+getString());
    }


    public native String getString();


}
