package com.dygmail.yan.darryl.wordsforfriends;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
<<<<<<< HEAD
import android.widget.Button;

import com.firebase.client.Firebase;
import com.firebase.client.DataSnapshot;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import java.util.ArrayList;

public class Page1WordsForFriends extends AppCompatActivity implements View.OnClickListener{

    //construct firebase url to access data
    private Firebase myRef = new Firebase("https://sizzling-torch6802.firebaseio.com/");
=======
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Page1WordsForFriends extends AppCompatActivity { ListView
>>>>>>> 469f61515a05ee04909ac3a237d330074b2f73d7

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1_words_for_friends);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Button initalize
        Button redirect = (Button)findViewByID(R.id.go);
        redirect.OnClickListener(this);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
    @Override
        public void onClick(View view) {
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        String[] posts={"Today's Posts"};
        ArrayAdapter<String> adapter = ArrayAdapter<String>[getListView]
            }
        });

    public boolean OnTouchEvent(MotionEvent event) {
    

    }

}
