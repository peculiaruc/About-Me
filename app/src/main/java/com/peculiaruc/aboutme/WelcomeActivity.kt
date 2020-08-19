package com.peculiaruc.aboutme

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

//        findViewById<Button>(R.id.btn_check).setOnClickListener {
//           addNickname(it)
//        }
        btn_check.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

//    private fun addNickname(view: View) {
//        val editText = findViewById<EditText>(R.id.nickname_editText)
//        val textView = findViewById<TextView>(R.id.nickname_textview)
//
//        textView.text = editText.text
//        editText.visibility = View.GONE
//        view.visibility = View.GONE
//        textView.visibility = View.VISIBLE
//
//        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
//        imm.hideSoftInputFromWindow(view.windowToken, 0)
//
//    }

}