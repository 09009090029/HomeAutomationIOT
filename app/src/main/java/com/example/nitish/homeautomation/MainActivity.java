package com.example.nitish.homeautomation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    String RELAY_ON="1";
    String RELAY_OFF="0";
    FirebaseDatabase database ;
    String LOGGING_TEG="MainActivity";


    String [] keys={"S1","S2","S3","S4","S5","S6","S7","S8","S9","S10","S11","S12"};

    HashMap<String,String> keyMap=new HashMap<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inti();

        // Hello
        Log.d("Hello","jfjd");
    }
    public void  inti(){
       database = FirebaseDatabase.getInstance();
    }





    public void buttonClick(View view){
        Log.d(LOGGING_TEG,"buttonClick");
        String tagValue=view.getTag().toString();
        Log.d(LOGGING_TEG,"tagValue = "+tagValue);
        int keyIndex= Integer.parseInt(tagValue);
        Log.d(LOGGING_TEG,"keyIndex = "+keyIndex);
        keyIndex=keyIndex-1;
        String keyValue=  keys[keyIndex];
        Log.d(LOGGING_TEG,"keyValue = "+keyValue);
        DatabaseReference myRef = database.getReference(keyValue);
        if(view.isActivated()){
            view.setActivated(false);
            myRef.setValue(RELAY_OFF);
         }
        else {
            myRef.setValue(RELAY_ON);
            view.setActivated(true);
        }


    }
}
