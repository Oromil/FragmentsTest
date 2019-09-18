package com.example.fragmentstest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity(), Router {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.container, Fragment1.getInstance(this))
            .addToBackStack(null)
            .commit()
    }

    override fun goToFrag3() {
        supportFragmentManager.popBackStack()
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, Fragment3.getInstance(this))
            .addToBackStack(null)
            .commit()
    }

    override fun goToFrag2() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, Fragment2.getInstance(this))
            .addToBackStack(null)
            .commit()
    }
}
