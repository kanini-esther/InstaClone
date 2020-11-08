package com.example.instaclone.Fragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.instaclone.Highlight
import com.example.instaclone.R
import com.example.instaclone.Story
import kotlinx.android.synthetic.main.row_post_highlights.view.*
import kotlinx.android.synthetic.main.row_stories_item.view.*

class HighlightsAdapter( var highlightList: List<String>):RecyclerView.Adapter<HighlightsAdapter.HighlightsViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HighlightsViewHolder {
        var rowView = LayoutInflater.from(parent.context).inflate(R.layout.row_post_highlights,parent, false)
        return  HighlightsViewHolder(rowView)
    }

    override fun onBindViewHolder(holder: HighlightsViewHolder, position: Int) {
        val highlight = highlightList.get(position)
//        holder.rowView.tvHighlight.text = Highlight.new
        Glide.with(holder.rowView.context)
//            .load(Highlight.imageUrl)
//            .circleCrop()
//            .placeholder(R.drawable.ic_profile_pic)
//            .into(holder.rowView.imgStory)
    }

    override fun getItemCount(): Int {
        return highlightList.size
    }

    class HighlightsViewHolder(val rowView: View):RecyclerView.ViewHolder(rowView)
}






