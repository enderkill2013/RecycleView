package com.example.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ProductAdapter (private val masivisMnish: List<Product>): RecyclerView.Adapter<ProductAdapter.ProductViewHolder>(){


    class ProductViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val imageView1: ImageView = itemView.findViewById(R.id.imageView1)
        val imageView2: ImageView = itemView.findViewById(R.id.imageView2)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val cv = LayoutInflater.from(parent.context).inflate(R.layout.product_item, parent, false)

        return ProductViewHolder(cv)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val gl = masivisMnish[position]
        val u1 = holder.imageView1.context
        val u2 = holder.imageView2.context
        Glide.with(u1)
                .load(gl.url1)
                .placeholder(R.drawable.ic_launcher_background)
                .into(holder.imageView1)


        Glide.with(u2)
                .load(gl.url2)
                .placeholder(R.drawable.ic_launcher_foreground)
                .into(holder.imageView2)

    }


    override fun getItemCount(): Int = masivisMnish.size

}