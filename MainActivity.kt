package com.example.uts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.uts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginFragment = LoginFragment()
        val registerFragment = RegisterFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainer, LoginFragment)
            commit()
        }

        val buttonLoginAwal = findViewById<Button>(R.id.buttonLoginAwal)

        buttonLoginAwal.setOnClickListener(
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainer, loginFragment)
                commit()
            }
        )

        val buttonRegisterAwal = findViewById<Button>(R.id.buttonRegisterAwal)

        buttonRegisterAwal.setOnClickListener(
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainer, registerFragment)
                commit()
            }
        )
    }

}
