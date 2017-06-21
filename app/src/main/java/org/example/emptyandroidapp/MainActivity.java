package org.example.emptyandroidapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTestMethod();
    }

    private boolean myTestMethod() {
        int myTest = 42;
        if ("ABCD".equals("AB" + "CD")) {
            myTest = 666;
            Log.v("TEST", "true");
            Log.v("TEST", String.valueOf(myTest));
            return true;
        } else {
            Log.v("TEST", "false");
            Log.v("TEST", String.valueOf(myTest));
            return false;
        }
    }
}
