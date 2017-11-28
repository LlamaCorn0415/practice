package com.example.hannahroseneill.listexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
	var adapter = ListAdapter()

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		prepareList()

		adapter.add(Animal("Cat", 5.0))
		adapter.add(Animal("Tiger", 200.0))
		adapter.add(Animal("Lion", 300.0))
		adapter.add(Animal("Cheetah", 222.0))
		adapter.add(Animal("Sphynx", 128.0))

		clear.setOnClickListener {
			adapter.clear()
			adapter.notifyDataSetChanged()
		}

	}

	fun prepareList(){
		list.layoutManager = LinearLayoutManager(this)
		list.adapter = adapter

	}
}
