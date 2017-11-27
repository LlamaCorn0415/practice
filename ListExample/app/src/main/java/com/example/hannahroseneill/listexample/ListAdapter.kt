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
	val arrayList = listOf("cat", "guinea pig", "iguana", "dog", "bunny")

	override fun onBindViewHolder(holder: ViewHolder, position: Int) {
		holder.bind(position)
	}

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
		return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false))
	}

	override fun getItemCount(): Int {
		return arrayList.size

	}

	inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder (itemView) {
		val button = itemView.button

		fun bind(position: Int){
			button.text = arrayList[position]
		}

	}
}

