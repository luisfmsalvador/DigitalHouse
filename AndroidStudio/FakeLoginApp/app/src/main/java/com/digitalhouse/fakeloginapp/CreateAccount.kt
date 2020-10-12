package com.digitalhouse.fakeloginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.digitalhouse.fakeloginapp.R
import com.digitalhouse.fakeloginapp.users.UserService
import kotlinx.android.synthetic.main.activity_create_account.*

class CreateAccount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        findViewById<Button>(R.id.btnLogin_Create).setOnClickListener {
            finish()
        }

        findViewById<Button>(R.id.btnSign_Create).setOnClickListener {
            try{
                consisteCamposTela()

                UserService.register(etNome_Create.text.toString(),etEmail_Create.text.toString(),etPassword_Create.text.toString())

                Toast.makeText(this, "Usuário registrado com sucesso", Toast.LENGTH_LONG).show()

                finish()

            } catch (e:java.lang.Exception){
                Toast.makeText(this, e.message, Toast.LENGTH_LONG).show()
            }
        }

        cbAgree_Create.setOnCheckedChangeListener { _, isChecked ->
            btnSign_Create.isEnabled = isChecked
        }
    }

    fun consisteCamposTela(){
        if (etNome_Create.text.toString() == ""){
            throw Exception("Informe o nome")
        } else if (etEmail_Create.text.toString() == ""){
            throw Exception("Informe o e-mail")
        } else if (!isEmailValid(etEmail_Create.text.toString())){
            throw Exception("Infome um e-mail válido")
        } else if (etPassword_Create.text.toString() == ""){
            throw Exception("Informe a senha")
        }
    }

    fun isEmailValid(email: String): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
}