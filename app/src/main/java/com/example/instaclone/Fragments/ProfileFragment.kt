package com.example.instaclone.Fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.instaclone.ProfileGrideAdapter
import com.example.instaclone.R
import kotlinx.android.synthetic.main.activity_profile_fragment.*

class ProfileFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.activity_profile_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        showProfileGlide()
    }
    fun showProfileGlide(){
        var profilePostList = ArrayList<String>()
        profilePostList.add("https://mobifree.co.ke/storage/2020/09/MyImage1599249777105Image.jpg")
        profilePostList.add("https://mobifree.co.ke/storage/2020/09/MyImage1599249778440Image.jpg")
        profilePostList.add("https://mobifree.co.ke/storage/2020/09/MyImage1599249777996Image.jpg")
        profilePostList.add("https://assets.fila.com/m/5b48e0f5f08d7cb5/FILA_COM_Large-5JM01249_956_01_e.jpg")
        profilePostList.add("https://assets.fila.com/m/73c2eea6c2628f45/FILA_COM_Large-3FM01012_775_01_e.jpg")
        profilePostList.add("https://i.pinimg.com/236x/89/10/ee/8910ee95f648aef20dd65dd8f0822851.jpg")
        profilePostList.add("https://img5.cfcdn.club/c3/b2/c311f88dc01fca3629ce91df816970b2_350x350.jpg")
        profilePostList.add("https://cdn.shopify.com/s/files/1/0123/2047/3188/products/product-image-797544227_grande.jpg?v=1579905443")
        profilePostList.add("https://cdn.shopify.com/s/files/1/0123/2047/3188/products/product-image-1180483865_800x.jpg?v=1599553155")
        profilePostList.add("https://cdn.shopify.com/s/files/1/0025/2687/1622/products/sneakers-homme-streetwear_3_2000x.jpg?v=1596297768")
        profilePostList.add("https://cdn.shopify.com/s/files/1/0099/2188/8320/products/ab734bf1-88b1-4599-a11a-94b645ba5034_1024x1024_2x_41d192f7-9a4b-4770-9a84-01817b9b26a6_1080x.jpg?v=1559928293")
        profilePostList.add("https://cdn.geekwire.com/wp-content/uploads/2019/01/Sp19_BB_Nike_Adapt_20181218_NIKE0538_Detail5_rectangle_1600.jpg")
        profilePostList.add("https://www.famousfootwear.com/productimages/shoes_ib95364.jpg?trim.threshold=105&width=630&height=480&paddingWidth=60")
        profilePostList.add("https://static.nike.com/a/images/c_limit,w_318,f_auto/t_product_v1/ced253ed-cb7c-4ea0-92ca-6172cddc60bc/air-vapormax-2020-fk-mens-shoe-kn9vwZ.jpg")
        profilePostList.add("https://i.pinimg.com/736x/5a/fa/5c/5afa5c56d8a8735de47750d513a0830f.jpg")
        profilePostList.add("https://i8.amplience.net/t/jpl/jd_product_list?plu=jd_132804_al&qlt=85&qlt=92&w=320&h=320&v=1")
        profilePostList.add("https://media.thecustommovement.com/e95de5dd-05ac-47c1-9c2b-e463a6678b84")
        profilePostList.add("https://ke.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/75/108023/1.jpg?3809")
        profilePostList.add("https://cdn.shopify.com/s/files/1/0031/6689/6198/products/Af1_white_-_cartoon_freestyle_300x300.jpg?v=1600017102")
        profilePostList.add("https://ae01.alicdn.com/kf/Hfda4120f90494022952f83dced62754aq.jpg_q50.jpg")
        profilePostList.add("https://m.media-amazon.com/images/I/71SScBzRlYL._AC_SR255,340_.jpg ")
        profilePostList.add("https://m.media-amazon.com/images/I/71SScBzRlYL._AC_SR255,340_.jpg ")



        val profileGrideAdapter = ProfileGrideAdapter(profilePostList)
        rvProfilePosts.layoutManager = GridLayoutManager(context, 3)
        rvProfilePosts.adapter=profileGrideAdapter
    }

}