package com.selly.mylibrary

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BooksAdapter(private val context: Context, private val books: List<Books>, val listener: (Books) -> Unit)
    : RecyclerView.Adapter<BooksAdapter.BooksViewholder>(){
    class BooksViewholder(view: View): RecyclerView.ViewHolder(view) {

        val imgBooks = view.findViewById<ImageView>(R.id.img_item_photo)
        val titleBooks = view.findViewById<TextView>(R.id.tv_item_name)
        val descBooks = view.findViewById<TextView>(R.id.tv_item_description)

        fun binView(books: Books, listener: (Books) -> Unit){
            imgBooks.setImageResource(books.imgBooks)
            titleBooks.text = books.titleBooks
            descBooks.text = books.descBooks
            itemView.setOnClickListener{
                listener(books)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewholder {
        return BooksViewholder(
            LayoutInflater.from(context).inflate(R.layout.item_books, parent, false)
        )
    }

    override fun onBindViewHolder(holder: BooksViewholder, position: Int) {
        holder.binView(books[position], listener)
    }

    override fun getItemCount(): Int = books.size

}