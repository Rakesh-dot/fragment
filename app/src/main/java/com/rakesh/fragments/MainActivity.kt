package com.rakesh.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.rakesh.fragments.fragments.AreaFragment
import com.rakesh.fragments.fragments.SumFragment

class MainActivity : AppCompatActivity() {
    private lateinit var btnAreaFragment: Button
    private lateinit var btnSumFragement: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSumFragement=findViewById(R.id.btnSum)
        btnAreaFragment=findViewById(R.id.btnArea)

        btnSumFragement.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.linearContainer,SumFragment())
                addToBackStack(null)
                commit()
            }
        }

        btnAreaFragment.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.linearContainer,AreaFragment())
                addToBackStack(null)
                commit()
            }
        }
    }
}