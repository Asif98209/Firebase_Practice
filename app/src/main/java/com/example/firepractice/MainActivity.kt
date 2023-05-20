package com.example.firepractice

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val share = findViewById<Button>(R.id.share)
        val data = findViewById<EditText>(R.id.data)
        val call = findViewById<Button>(R.id.call)
        val num = findViewById<EditText>(R.id.num)
        val contact = findViewById<Button>(R.id.contact)

        share.setOnClickListener {
            val intent = Intent(this, secondActivity::class.java)
            var data : String = data.getText().toString();
            intent.putExtra("data", data)
            startActivity(intent)
        }

        call.setOnClickListener {
            var num= num.text.toString()
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel: ${num}"))
            startActivity(intent)
        }

        contact.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/android"))
            startActivity(intent)
        }
    }
}