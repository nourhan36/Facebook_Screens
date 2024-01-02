package com.example.facebook_screens

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class postsAdapter(val posts: List<post>) : RecyclerView.Adapter<postsAdapter.ViewHolder>() {

    override fun getItemCount(): Int = posts.size
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.activity_post, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val post = posts[position]
        if (post != null) {
            holder.userName.text = post?.username
            holder.profileImage.setImageResource(post?.postImageId ?: R.drawable.profile)
            holder.time.text = post?.time
            holder.postText.text = post?.postText
            holder.postImage.setImageResource(post?.postImageId ?: R.drawable.post)
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val userName: TextView = itemView.findViewById(R.id.username)
        val profileImage: ImageView = itemView.findViewById(R.id.circle)
        val time: TextView = itemView.findViewById(R.id.time)
        val postText: TextView = itemView.findViewById(R.id.tv_post)
        val postImage: ImageView = itemView.findViewById(R.id.img_post)
    }
}