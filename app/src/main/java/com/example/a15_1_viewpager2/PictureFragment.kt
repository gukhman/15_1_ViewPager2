package com.example.a15_1_viewpager2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions

class PictureFragment : Fragment() {
    private lateinit var picture: Picture

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_picture, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        picture = arguments?.getSerializable("picture") as Picture

        val titleTextView: TextView = view.findViewById(R.id.titleTextView)
        val authorTextView: TextView = view.findViewById(R.id.authorTextView)
        val imageView: ImageView = view.findViewById(R.id.imageView)

        titleTextView.text = picture.title
        authorTextView.text = picture.author
        Glide.with(this)
            .load(picture.imageUrl)
            .apply(
                RequestOptions()
                    .placeholder(R.drawable.placeholder) // Плейсхолдер до загрузки
                    .error(R.drawable.error_image) // Изображение на случай ошибки
                    .diskCacheStrategy(DiskCacheStrategy.ALL) // Кэширование для быстрой загрузки
            )
            .into(imageView)
    }
}