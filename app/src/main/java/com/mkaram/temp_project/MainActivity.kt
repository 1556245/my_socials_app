package com.mkaram.temp_project

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    lateinit var facebook_cv : CardView
    lateinit var github_cv : CardView
    lateinit var linkedin_cv : CardView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        facebook_cv = findViewById(R.id.cv_face)
        github_cv = findViewById(R.id.cv_github)
        linkedin_cv = findViewById(R.id.cv_linkedin)

        facebook_cv.setOnClickListener{
            val faceIntent = Intent(Intent.ACTION_VIEW)
            faceIntent.data = Uri.parse("https://www.facebook.com/profile.php?id=100067207164558")
            startActivity(faceIntent)
        }

        github_cv.setOnClickListener {
            val githubIntent = Intent(Intent.ACTION_VIEW)
            githubIntent.data = Uri.parse("https://github.com/1556245")
            startActivity(githubIntent)
        }

        linkedin_cv.setOnClickListener{
            val linkedinIntent = Intent(Intent.ACTION_VIEW)
            linkedinIntent.data = Uri.parse("https://www.linkedin.com/in/mohammed-karam-3aa08a2a3")
            startActivity(linkedinIntent)
        }

    }
}