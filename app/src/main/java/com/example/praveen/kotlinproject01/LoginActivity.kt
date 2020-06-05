package com.example.praveen.kotlinproject01

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login.setOnClickListener(){
            if(username?.text.toString() == "John" && password?.text.toString() == "john123" ||
                username?.text.toString() == "Alice" && password?.text.toString() == "alice123" ) {

                intent = Intent(this, MainActivity::class.java)
                intent.putExtra("name",username.text.toString())
                startActivity(intent)

            }
            else{
                Toast.makeText(this,"Login Failed",Toast.LENGTH_LONG).show()
            }
        }


    }
}
