package com.example.instaclone.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.instaclone.Highlight
import com.example.instaclone.R
import kotlinx.android.synthetic.main.row_post_highlights.view.*

class HighlightsAdapter(var highlights: List<Highlight>) :
    RecyclerView.Adapter<HighlightsAdapter.HighlightsHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HighlightsHolder {
        var rowView =
            LayoutInflater.from(parent.context).inflate(R.layout.row_post_highlights, parent, false)
        return HighlightsHolder(rowView)
    }

    override fun onBindViewHolder(holder: HighlightsHolder, position: Int) {
        Glide.with(holder.rowView.context)
            .load(highlights[position].imageUrl)
            .into(holder.rowView.imgHights)
        holder.rowView.tvHighlight.text = highlights[position].new
    }

    override fun getItemCount(): Int {
        return highlights.size
    }

    class HighlightsHolder(val rowView: View) : RecyclerView.ViewHolder(rowView)
}



