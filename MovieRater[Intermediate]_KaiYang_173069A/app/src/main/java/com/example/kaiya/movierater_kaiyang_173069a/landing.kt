package com.example.kaiya.movierater_kaiyang_173069a

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_landing.*
import android.content.Intent
import android.view.*
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class landing : AppCompatActivity() {

    companion object {
        var allMovies = arrayListOf<Movie>()
        var selectedMovie: Int = 0
    }

    class Movie(name: String, desc: String, reviewStars: Double, reviewText: String, lang: String, date: String, ageRating: Boolean, violence: Boolean, langUsed: Boolean)
    {
        var name: String
        var desc: String
        var reviewStars: Double
        var reviewText: String
        var lang: String
        var date: String
        var ageRating: Boolean
        var violence: Boolean
        var langUsed: Boolean

        init {
            this.name = name
            this.desc = desc
            this.reviewStars = reviewStars
            this.reviewText = reviewText
            this.lang = lang
            this.date = date
            this.ageRating = ageRating
            this.violence = violence
            this.langUsed = langUsed
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)

        registerForContextMenu(landing_msg)
    }

//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.add_movie_landing, menu)
//        return super.onCreateOptionsMenu(menu)
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
//        if(item?.itemId == R.id.addMovie)
//        {
//            val intent = Intent(this@landing, movie_add::class.java)
//            startActivity(intent)
//        }
//        return super.onOptionsItemSelected(item)
//    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        menuInflater.inflate(R.menu.add_movie_landing, menu)
        super.onCreateContextMenu(menu, v, menuInfo)
    }

    override fun onContextItemSelected(item: MenuItem?): Boolean {
        if(item?.itemId == R.id.addMovie)
        {
            val intentAdd = Intent(this@landing, movie_add::class.java)
            startActivity(intentAdd)
        }
        return super.onContextItemSelected(item)
    }
}
