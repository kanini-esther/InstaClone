package com.example.instaclone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.row_profile_grid_item.view.*

class ProfileGrideAdapter( var profilePostList: List<String>):RecyclerView.Adapter<ProfileGrideAdapter.ProfileGrideHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileGrideHolder {
        var rowView = LayoutInflater.from(parent.context).inflate(R.layout.row_profile_grid_item,parent, false)
        return ProfileGrideHolder(rowView)
    }


    override fun onBindViewHolder(holder: ProfileGrideHolder, position: Int) {
        Glide.with(holder.rowView.context)
            .load(profilePostList.get(position))
            .into(holder.rowView.ivProfilePost)
    }
    override fun getItemCount(): Int {
        return profilePostList.size
    }
    class ProfileGrideHolder(val rowView: View): RecyclerView.ViewHolder(rowView)
}

