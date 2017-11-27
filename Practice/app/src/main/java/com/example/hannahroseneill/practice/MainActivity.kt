package com.example.hannahroseneill.practice

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.sql.ResultSet

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		switch1.setOnCheckedChangeListener { buttonView, isChecked ->
			if (isChecked) {
				textView.text = "Awesome Sauce!"
				imageView.setImageResource(R.drawable.happycat)
				//background.setBackgroundColor(Color.YELLOW)
				background.setBackgroundResource(R.color.happy)
			} else {
				textView.text = "Not awesome sauce"
				imageView.setImageResource(R.drawable.sadcat)
				//background.setBackgroundColor(Color.DKGRAY)
				background.setBackgroundResource(R.color.sad)

			}
		}
		floofybutton.setOnClickListener {
			var intent = Intent(this, FloofyActivity::class.java)
			startActivity(intent)
		} //I think this is the one from last time..Or is it the adapter one? o

	}
}