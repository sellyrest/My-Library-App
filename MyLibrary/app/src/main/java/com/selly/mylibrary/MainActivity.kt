package com.selly.mylibrary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val booksList = listOf<Books>(
            Books(
                R.drawable.book1,
                titleBooks = "Everything Is F*cked: A Book About Hope",
                descBooks = "From the author of the international mega-bestseller The Subtle Art of Not Giving A F*ck comes a counterintuitive guide to the problems of hope."
            ),
            Books(
                R.drawable.subtleartbook,
                titleBooks = "The Subtle Art of Not Giving a F*ck: A Counterintuitive Approach to Living a Good Life",
                descBooks = "The Subtle Art of Not Giving a F*ck argues that individuals should seek to find meaning through what they find to be important and only engage in values that they can control. Values (such as popularity) that are not under a person's control, are, according to the book, 'bad values'."
            ),

            Books(
                R.drawable.thinkingfast,
                titleBooks = "Thinking Fast & Slow",
                descBooks = " Thinking Fast & Slow shows you how two systems in your brain are constantly fighting over control of your behavior and actions, and teaches you the many ways in which this leads to errors in memory, judgment and decisions, and what you can do about it."
            ),

            Books(
                R.drawable.atomich,
                titleBooks = "Atomic Habit",
                descBooks = "A supremely practical and useful book. James Clear distills the most fundamental information about habit formation, so you can accomplish more by focusing on less."
            ),
        )


        val recyclerView = findViewById<RecyclerView>(R.id.ry_book)
        recyclerView.layoutManager = LinearLayoutManager (this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = BooksAdapter(this, booksList){

            val intent = Intent (this, DetailBooksActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }

    }
}