package com.example.assessment2_calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        breast.setOnClickListener{
            leg.visibility = View.GONE
            flour.visibility = View.VISIBLE
            stick.visibility = View.VISIBLE

        }
        leg.setOnClickListener{
            breast.visibility = View.GONE
            flour.visibility = View.VISIBLE
            stick.visibility = View.VISIBLE

        }
        flour.setOnClickListener{
            flour_2.isChecked = true
        }
        stick.setOnClickListener{
            stick_2.isChecked = true
        }
        button.setOnClickListener{
            if (flour_2.isChecked == true)
            {
                fried_chick.visibility = View.VISIBLE
                chicken_nug.visibility = View.GONE
            }
            if (flour_2.isChecked == true)
            {
                chicken_nug.visibility = View.VISIBLE
                fried_chick.visibility = View.GONE
            }
            if (stick_2.isChecked == true)
            {

            }

            }

        }


    }
