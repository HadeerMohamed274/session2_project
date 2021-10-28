package com.hadeer.session2project

import android.content.Intent
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import kotlin.math.log
import android.widget.Toast
class MainActivity : AppCompatActivity() {
    lateinit var editText: EditText
    private lateinit var editPassword:EditText
    lateinit var button :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("main" , "onCreate started")
        editText = findViewById(R.id.edit_mail)
        button = findViewById(R.id.btn_signup)
        editPassword = findViewById(R.id.edit_password)


        button.setOnClickListener{
            val mail = editText.text.toString()
            val password = editPassword.text.toString()
            if(mail.equals("") && password.equals("")){
                Toast.makeText(this , "The Fields Are Empty" , Toast.LENGTH_LONG).show()
            } else{
                val intent = Intent(this , MainActivity2::class.java)
                startActivity(intent)
            }

        }

    }

    override fun onStart() {
        super.onStart()
        var userName:String
        Log.d("main" , "onStart started")
    }

    override fun onResume() {
        super.onResume()
        Log.d("main" , "onResume started")
    }

    override fun onPause() {
        super.onPause()
        Log.d("main" , "onPause started")
    }

    override fun onStop() {
        super.onStop()
        Log.d("main" , "onStop started")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("main" , "onDestroy started")
    }
}