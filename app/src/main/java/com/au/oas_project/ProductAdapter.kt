package com.au.oas_project

import android.annotation.SuppressLint
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.au.oas_project.Model.Product

//class ProductAdapter(private val products: List<Any> = mutableListOf()) :
//    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_item, parent, false)
//        return ProductViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
//        val product = products[position]
//        if (holder is ProductViewHolder) {
//            holder.bind(product)
//        }
//    }
//
//    override fun getItemCount(): Int {
//        return products.size
//    }
//
//    @SuppressLint("NotifyDataSetChanged")
//    fun setProducts(newProducts: List<Product>) {
//        products.clear()
//        products.addAll(newProducts)
//        notifyDataSetChanged()
//    }
//
//    class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        @SuppressLint("SetTextI18n")
//        fun bind(product: Product) {
//            itemView.findViewById<TextView>(R.id.product_name).text = product.name
////            itemView.findViewById<TextView>(R.id.product_description).text = product.description
//            itemView.findViewById<TextView>(R.id.product_price).text = "$${product.price}"
//        }
//    }
//}

class ProductAdapter(var products: List<Product>) :
    RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Define the UI elements for each item in the RecyclerView
        val imageView: ImageView = itemView.findViewById(R.id.form_img_view)
        val nameTextView: TextView = itemView.findViewById(R.id.product_name)
        val priceTextView: TextView = itemView.findViewById(R.id.product_price)
        val dateTextView: TextView = itemView.findViewById(R.id.dateEditText)
        val timeSTextView: TextView = itemView.findViewById(R.id.spanTimeSEditText)
        val timeETextView: TextView = itemView.findViewById(R.id.spanTimeEEditText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        // Inflate the layout for each item in the RecyclerView
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.product_item, parent, false)
        return ProductViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        // Set the UI elements for each item in the RecyclerView
        val product = products[position]
        holder.imageView.setImageURI(Uri.parse(product.imageUrl))
        holder.nameTextView.text = product.name
        holder.priceTextView.text = product.price.toString()
        holder.dateTextView.text = product.date
        holder.timeSTextView.text = product.time
        holder.timeETextView.text = product.time
    }

    override fun getItemCount(): Int {
        return products.size
    }
}

