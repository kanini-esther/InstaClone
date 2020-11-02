package com.example.instaclone
//
//import android.content.Context
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.ImageView
//import androidx.recyclerview.widget.RecyclerView
//import com.bumptech.glide.Glide
//import kotlinx.android.synthetic.main.grid_profile_pictures.view.*
//import kotlinx.android.synthetic.main.row_stories_item.view.*
//
//class GridProfilePicturesAdapter (private val c: Context, private val images: ArrayList<String>) :
//    RecyclerView.Adapter<GridProfilePicturesAdapter.ColorViewHolder>() {
//
//
//    override fun getItemCount(): Int {
//        return images.size
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ColorViewHolder {
//        return ColorViewHolder(LayoutInflater.from(c).inflate(R.layout.grid_profile_pictures, parent, false))
//    }
//
//    override fun onBindViewHolder(holder: ColorViewHolder, position: Int) {
//        val path = images[position]
//
//        Picasso.get()
//            .load(url)
//            .placeholder(R.drawable.user_placeholder)
//            .error(R.drawable.user_placeholder_error)
//            .into(imageView);
//
//        holder.iv.setOnClickListener {
//            //handle click event on image
//        }
//    }
//
//    class ColorViewHolder(view: View) : RecyclerView.ViewHolder(view) {
//        val iv = view.pictures as ImageView
//    }
//}