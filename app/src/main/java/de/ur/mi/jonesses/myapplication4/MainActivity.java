package de.ur.mi.jonesses.myapplication4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Irgendein Log
        Log.d("TESTLOG", "Jonas mag Bitbucket lieber");
    }
}
