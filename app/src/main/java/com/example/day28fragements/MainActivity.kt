package com.example.day28fragements

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.day28fragements.ui.login.LoginFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val buttonClock = findViewById<Button>(R.id.btnTime)
        val buttonExam = findViewById<Button>(R.id.btnExam)
        val buttonValidate = findViewById<Button>(R.id.btnValidate)

        buttonClock.setOnClickListener {
            replaceFrameWithFragment(Clock_Fragement())
        }

        buttonExam.setOnClickListener {
            replaceFrameWithFragment(Exam_Fragement())
        }

        buttonValidate.setOnClickListener {
            replaceFrameWithFragment(LoginFragment())
        }
    }

    private fun replaceFrameWithFragment(frag: Fragment) {

        val fragManager = supportFragmentManager
        val fragTransaction = fragManager.beginTransaction()
        fragTransaction.replace(R.id.framLayout, frag)
        fragTransaction.commit()
    }
}