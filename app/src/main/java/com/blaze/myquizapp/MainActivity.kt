package com.blaze.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnstart: Button = findViewById(R.id.btn_start)
        val etname: EditText = findViewById(R.id.et_name)

        btnstart.setOnClickListener {
            if(etname.text.isEmpty())
            {
                Toast.makeText(this,"Name cannot be Empty",Toast.LENGTH_LONG).show()
            }
            else{
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME, etname.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}