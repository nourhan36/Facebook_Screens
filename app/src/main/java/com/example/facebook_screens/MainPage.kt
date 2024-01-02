package com.example.facebook_screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.facebook_screens.databinding.ActivityMainPageBinding
import com.example.facebook_screens.databinding.ActivityPostBinding
import androidx.recyclerview.widget.LinearLayoutManager
class MainPage : AppCompatActivity() {
    lateinit var binding: ActivityMainPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    lateinit var adapter: postsAdapter
    lateinit var postList: MutableList<post>
    private fun initRecyclerView() {
        createPostList()
        adapter = postsAdapter(postList)
        binding.rvPost.adapter = adapter
    }

    private fun createPostList() {
        postList = mutableListOf()
        for (i in 1..1000) {
            postList.add(
                post(
                    username = "post $i",
                    profileImageId = R.drawable.profile,
                    postImageId = R.drawable.post,
                    postText = "post number $i",
                    time = "12:00"
                )
            )
        }
    }
}