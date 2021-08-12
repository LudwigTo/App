package com.example.app;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import com.example.app.db.AppUser;

import java.io.Console;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;

import io.realm.Realm;
import io.realm.mongodb.*;
import io.realm.mongodb.sync.SyncConfiguration;

public class MainActivity extends AppCompatActivity {

    private static final String APP_ID = BuildConfig.AppId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDB();

    }

    public void initDB(){
        System.out.println("APP_ID:" + APP_ID);
    }

    public void testClick(View view){
        AppUser testUser = new AppUser("a@a.com", "aabbcc");
    }
}