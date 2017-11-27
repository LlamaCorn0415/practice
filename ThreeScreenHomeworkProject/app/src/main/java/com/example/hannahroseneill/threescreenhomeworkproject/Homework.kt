package com.example.hannahroseneill.threescreenhomeworkproject

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.hannahroseneill.CheeseburgerScreen.CheeseburgerScreen
import com.example.hannahroseneill.FryScreen.FryScreen
import com.example.hannahroseneill.PizzaScreen.PizzaScreen
import kotlinx.android.synthetic.main.activity_homework.*


class Homework : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_homework)
		curlyFryButton.setOnClickListener {
			var intent = Intent(this, FryScreen::class.java)
			startActivity(intent)

		}
		cheeseBurgerButton.setOnClickListener {
			var intent = Intent(this, CheeseburgerScreen::class.java)
			startActivity(intent)

		}
		pizzaButton.setOnClickListener {
			var intent = Intent(this, PizzaScreen::class.java)
			startActivity(intent)

		}

	}
}
