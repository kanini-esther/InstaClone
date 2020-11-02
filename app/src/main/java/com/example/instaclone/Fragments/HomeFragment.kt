package com.example.instaclone.Fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.instaclone.*
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        showStories()
        showPosts()


    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_home,menu)
    }

    fun showStories(){
        var storiesList = ArrayList<Story>()
            storiesList.add(Story("https://images.vans.com/is/image/Vans/D3HY28-HERO?\$583x583\$","Berril"))
            storiesList.add(Story("https://www.efootwear.eu/media/catalog/product/cache/image/650x650/0/0/0000206954879_01_pc.jpg","Faith"))
            storiesList.add(Story("https://m.media-amazon.com/images/I/81eUg0M2QGL._AC_UY218_.jpg","Stella"))
            storiesList.add(Story("https://static.dezeen.com/uploads/2020/02/nike-space-hippie-trainer-design_dezeen_2364_sq-1.jpg","Duncan"))
            storiesList.add(Story("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTaipwGWruIZbOT6Ve2fS0RMMGMQ-LeZ90B1w&usqp=CAU","Lucy"))
            storiesList.add(Story("https://stockx-360.imgix.net//Yeezy-Slide-Bone/Images/Yeezy-Slide-Bone/Lv2/img16.jpg?auto=format,compress&w=559&q=90&dpr=2&updated_at=1603481985","Elli"))
            storiesList.add(Story("https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1558644153-adidas-rapidarun-laceless-kids-1558644120.jpg?crop=0.875xw:0.665xh;0.0410xw,0.170xh","Elssie"))

        val storiesAdapter = StoriesAdapter(storiesList)
        rvStories.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        rvStories.adapter = storiesAdapter



    }


    fun showPosts(){
        var instaPostsList = ArrayList<InstaPost>()
        instaPostsList.add(InstaPost("", "Michi","https://images.vans.com/is/image/Vans/D3HY28-HERO?\$583x583\$",50,"What a beautiful shoe"))
        instaPostsList.add(InstaPost("", "Kellie","https://m.media-amazon.com/images/I/81eUg0M2QGL._AC_UY218_.jpg",55,"Stunning"))
        instaPostsList.add(InstaPost("", "Ruth","https://m.media-amazon.com/images/I/81eUg0M2QGL._AC_UY218_.jpg",80,"What a day"))
        instaPostsList.add(InstaPost("", "Matete","https://m.media-amazon.com/images/I/81eUg0M2QGL._AC_UY218_.jpg",150,"Amaizing"))
        instaPostsList.add(InstaPost("", "joel","https://m.media-amazon.com/images/I/81eUg0M2QGL._AC_UY218_.jpg",350,"Waow, i like it"))


        val postsAdapter = InstaPostAdapter(instaPostsList)
        rvNewsFeed.layoutManager = LinearLayoutManager(context)
        rvNewsFeed.adapter = postsAdapter
    }



}