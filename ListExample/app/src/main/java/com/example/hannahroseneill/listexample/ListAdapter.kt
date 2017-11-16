package com.example.hannahroseneill.listexample

import android.support.v7.view.menu.ActionMenuItemView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by hannahroseneill on 11/15/17.
 */
class ListAdapter : RecyclerView.Adapter<ListAdapter.ViewHolder>() {
	override fun onBindViewHolder(holder: ViewHolder, position: Int) {

	}

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
		return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false))
	}

	override fun getItemCount(): Int {
		return 20
	}

	class ViewHolder(itemView: View) : RecyclerView.ViewHolder (itemView) {

	}
} 