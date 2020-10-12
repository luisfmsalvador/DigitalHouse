package com.digitalhouse.fakeloginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.UserHandle
import android.widget.Button
import android.widget.Toast
import com.digitalhouse.fakeloginapp.users.UserService
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnLogin_Login).setOnClickListener{
            try {
                consisteCamposTela()

                val usuario = UserService.logIn(etEmail_Login.text.toString(),etPassword_Login.text.toString())

                if (usuario == null) {
                    Toast.makeText(this,"E-mail ou senha inválidos",Toast.LENGTH_LONG).show()
                } else {
                    val intent = Intent(this, Welcome::class.java)
                    intent.putExtra("NOMEUSUARIO",usuario.name)
                    startActivity(intent)
                }
            } catch (e:Exception){
                Toast.makeText(this, e.message,Toast.LENGTH_LONG).show()
            }
        }

        findViewById<Button>(R.id.btnSign_Login).setOnClickListener {
            val intent = Intent(this, CreateAccount::class.java)
            startActivity(intent)
        }
    }

    fun consisteCamposTela(){
        if (etEmail_Login.text.toString() == ""){
            throw Exception("Informe o e-mail")
        } else if (etPassword_Login.text.toString() == ""){
            throw Exception("Informe a senha")
        }
    }
}