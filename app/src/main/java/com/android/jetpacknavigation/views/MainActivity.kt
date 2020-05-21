package com.android.jetpacknavigation.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.android.jetpacknavigation.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({

            startActivity(
                Intent(
                    this@MainActivity,
                    HomeActivity::class.java
                )
            )

            finish()

        },1000)

    }

}
