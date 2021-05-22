package com.rahman.rahman_notifications

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rahman.rahman_notifications.R
import com.rahman.rahman_notifications.ui.EggTimerFragment


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, EggTimerFragment.newInstance())
                .commitNow()
        }
    }
}