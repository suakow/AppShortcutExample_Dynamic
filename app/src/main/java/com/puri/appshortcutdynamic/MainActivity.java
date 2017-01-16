package com.puri.appshortcutdynamic;

import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] Contacts = new String[]{"Contact 1","Contact 2"};

        ShortcutManager shortcutManager = getSystemService(ShortcutManager.class);

        ShortcutInfo shortcut = new ShortcutInfo.Builder(this, "id1")
                .setShortLabel("Web site")
                .setIcon(Icon.createWithResource(getApplicationContext(), R.drawable.ic_cloud_black_48dp))
                .setIntents(
                        new Intent[]{
                                new Intent(MenuActivity.ACTION).putExtra("value","Hello")
                        })
                .build();

        shortcutManager.setDynamicShortcuts(Arrays.asList(shortcut));

    }
}
