package com.example.instaclone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.row_post_item.view.*

class InstaPostAdapter(var instaPostList: List<InstaPost>): RecyclerView.Adapter<InstaPostAdapter.InstaPostViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InstaPostViewHolder {
        var rowView = LayoutInflater.from(parent.context).inflate(R.layout.row_post_item,parent,false)
        return InstaPostViewHolder(rowView)
    }

    override fun onBindViewHolder(holder: InstaPostViewHolder, position: Int) {
        var instaPost = instaPostList.get(position)
        Glide.with(holder.rowView.context)
            .load(instaPost.avatarUrl)
            .circleCrop()
            .placeholder(R.drawable.ic_profile_pic)
            .into(holder.rowView.imgAvatar)

        holder.rowView.tvUserName.text = instaPost.username

        Glide.with(holder.rowView.context)
            .load(instaPost.imageUrl)
            .placeholder(R.drawable.ic_profile_pic)
            .into(holder.rowView.imageView)

        holder.rowView.tvLikes.text = "${instaPost.LikesCount} Likes"
        holder.rowView.tvCaption.text = instaPost.username
        holder.rowView.tvAddComment.text = instaPost.caption

    }
    override fun getItemCount(): Int {
        return instaPostList.size
    }



    class InstaPostViewHolder(var rowView: View): RecyclerView.ViewHolder(rowView)
}