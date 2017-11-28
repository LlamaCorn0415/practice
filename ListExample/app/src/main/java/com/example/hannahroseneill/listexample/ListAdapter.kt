package com.example.hannahroseneill.listexample

import android.support.v7.view.menu.ActionMenuItemView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.list_item.view.*

/**
 * Created by hannahroseneill on 11/15/17.
 */
class ListAdapter : RecyclerView.Adapter<ListAdapter.ViewHolder>() {
	val animals = ArrayList<Animal>()

	fun add(animal: Animal){
		animals.add(animal)
	}

	fun clear(){
		animals.clear()
	}

	override fun onBindViewHolder(holder: ViewHolder, position: Int) {
		holder.bind(position)
	}

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
		return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false))
	}

	override fun getItemCount(): Int {
		return animals.size

	}

	inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder (itemView) {
		val txtName = itemView.txtName
		val txtWeight = itemView.txtWeight

		fun bind(position: Int){
			val animal = animals[position]
			txtName.text = animal.name
			txtWeight.text = animal.weight.toString()
		}

	}
}


