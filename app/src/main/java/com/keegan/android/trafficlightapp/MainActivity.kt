package com.keegan.android.trafficlightapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    private lateinit var change_Button :AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        change_Button = findViewById(R.id.changeButton)

        change_Button.setOnClickListener {
            var value = change_Button.text.toString()

            if(value.equals("STOP")){
                //switch to green
                change_Button.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
                change_Button.setText(R.string.go)
            }
            else if(value.equals("GO")){
                //switch to yellow
                change_Button.setBackgroundColor(ContextCompat.getColor(this, R.color.yellow))
                change_Button.setText(R.string.wait)
            }
            else{ //switch to red
                change_Button.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
                change_Button.setText(R.string.stop)
            }
        }
    }
}