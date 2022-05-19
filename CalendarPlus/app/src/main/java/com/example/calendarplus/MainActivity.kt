package com.example.calendarplus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;

 public class MainActivity : AppCompatActivity() {
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         var open_calendar: Button = findViewById(R.id.button)
         open_calendar.setOnClickListener {
             val intent1 = Intent(this, MainActivity2::class.java)
             startActivity(intent1);
         }
         var open_events: Button = findViewById(R.id.button2)
         open_events.setOnClickListener {
             val intent2 = Intent(this, MainActivity3::class.java)
             startActivity(intent2);
         }
         var open_friends: Button = findViewById(R.id.button3)
         open_friends.setOnClickListener {
             val intent3 = Intent(this, MainActivity4::class.java)
             startActivity(intent3);
         }
         var open_settings: Button = findViewById(R.id.button4)
         open_settings.setOnClickListener {
             val intent4 = Intent(this, MainActivity5::class.java)
             startActivity(intent4);
         }
       //var thebutton = (Button(button)) FindViewById(R.id.button)
    }
}