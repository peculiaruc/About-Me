package com.peculiaruc.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        findViewById<Button>(R.id.done_button).setOnClickListener {
            addNickname(it)
        }
        fun addNickname(view: View) {
//            val editText = findViewById<EditText>(R.id.nickname_editText)
//            val textView = findViewById<TextView>(R.id.nickname_textview)
//
//            textView.text =editText.text
//            editText.visibility = View.GONE
//            view.visibility = View.GONE
//            textView.visibility = View.VISIBLE
//
//            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
//            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }

    private fun addNickname(view: View) {
        val editText = findViewById<EditText>(R.id.nickname_editText)
        val textView = findViewById<TextView>(R.id.nickname_textview)

        textView.text = editText.text
        editText.visibility = View.GONE
        view.visibility = View.GONE
        textView.visibility = View.VISIBLE

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)

    }

}