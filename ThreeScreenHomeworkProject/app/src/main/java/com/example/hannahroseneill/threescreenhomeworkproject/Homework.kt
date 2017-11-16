package com.example.hannahroseneill.threescreenhomeworkproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_homework.*

class Homework : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_homework)
		mainBackground.setBackgroundColor(#007db7)
		curlyFryButton.setOnClickListener {

		}
		cheeseBurgerButton.setOnClickListener {

		}
		pizzaButton.setOnClickListener {

		}

	}
}
