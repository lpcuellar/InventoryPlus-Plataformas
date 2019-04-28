package com.example.inventory

import android.content.Context
import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView

import java.util.ArrayList

class MyAdapter(products: ArrayList<String>, quantity: ArrayList<Int>, private val context: Context) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    private var Products = ArrayList<String>()
    private var Quantity = ArrayList<Int>()

    init {
        Products = products
        Quantity = quantity
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.productos, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        Log.d(TAG, "onBindViewHolder: called.")

    }

    override fun getItemCount(): Int {
        return 0
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        internal var parentLayout: RelativeLayout
        internal var formato: CardView
        internal var producto: TextView
        internal var cantidad: TextView
        internal var add: Button
        internal var sustract: Button

        init {

            parentLayout = itemView.findViewById(R.id.parent_layout)
            formato = itemView.findViewById(R.id.formato)
            producto = itemView.findViewById(R.id.producto)
            cantidad = itemView.findViewById(R.id.cantidad)
            add = itemView.findViewById(R.id.sumar)
            sustract = itemView.findViewById(R.id.restar)

        }
    }

    companion object {

        private val TAG = "MyAdapter"
    }
}
