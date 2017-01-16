package com.puri.appshortcutdynamic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    public static String ACTION = "HelloWorld";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Intent i = getIntent();
        String val = i.getStringExtra("value");

        Toast.makeText(getApplicationContext(),val,Toast.LENGTH_LONG).show();
    }
}
