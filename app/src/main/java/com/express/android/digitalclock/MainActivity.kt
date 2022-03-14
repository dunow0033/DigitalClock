package com.express.android.digitalclock

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.express.android.digitalclock.databinding.ActivityMainBinding
import java.time.LocalDateTime

class MainActivity : AppCompatActivity() {

    //private var binding: ActivityMainBinding? = null
    //private lateinit var binding: ActivityMainBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var date = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//            LocalDateTime.now()
//        } else {
//            TODO("VERSION.SDK_INT < O")
//        }
//
//        binding.datetime.setText(date.toString())

    }
}