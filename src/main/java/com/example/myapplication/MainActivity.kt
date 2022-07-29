package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
package com.example.animation
import android.animation.Animator
import android.os.Handler
import android.view.View
import android.widget.Button
import android.util.Log
import android.widget.Toast
import android.view.animation.Animation
import android.view.animation.AnimationUtils


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
Toast.makeText(this, "Hello, I'm Pokemon",Toast.LENGTH_SHORT).show()
        }
        //bounce.setOnClickListener {
           // val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            //textView.startAnimation(animation)
        }
    }

}