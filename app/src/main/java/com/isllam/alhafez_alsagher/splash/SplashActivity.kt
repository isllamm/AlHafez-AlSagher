package com.isllam.alhafez_alsagher.splash

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import coil.load
import com.isllam.alhafez_alsagher.R
import com.isllam.alhafez_alsagher.databinding.ActivitySplashBinding
import com.isllam.alhafez_alsagher.main.MainActivity
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.splash.load(R.drawable.splash)

        lifecycleScope.launch {
            delay(2000)
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
            finish()
        }
    }
}