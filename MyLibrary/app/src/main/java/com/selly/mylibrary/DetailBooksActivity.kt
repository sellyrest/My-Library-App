package com.selly.mylibrary

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailBooksActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_books)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val books = intent.getParcelableExtra<Books>(MainActivity.INTENT_PARCELABLE)

        val imgBooks = findViewById<ImageView>(R.id.img_item_photo)
        val titleBooks = findViewById<TextView>(R.id.tv_item_name)
        val descBooks = findViewById<TextView>(R.id.tv_item_description)

        imgBooks.setImageResource(books?.imgBooks!!)
        titleBooks.text = books.titleBooks
        descBooks.text = books.descBooks
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}