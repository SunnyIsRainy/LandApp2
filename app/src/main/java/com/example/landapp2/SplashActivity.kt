package com.example.landapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val myHandler = Handler(Looper.getMainLooper())

//        {} 사이에는 실행할 코드, 그 뒤에는 초(밀리세컨드라서 2.5초 뒤면 2500(1000곱하기))
        myHandler.postDelayed({

//                              2.5초 후에 실행할 내용 작성
            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)

//            다시 안 돌아올거니까
            finish()

        }, 2500)

    }
}