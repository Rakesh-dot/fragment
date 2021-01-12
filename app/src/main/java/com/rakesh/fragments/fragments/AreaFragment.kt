package com.rakesh.fragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.rakesh.fragments.R




class AreaFragment : Fragment() {

    private lateinit var btnCalculate1: Button
    private lateinit var etFirstt: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_area, container, false)
        etFirstt=view.findViewById(R.id.etFirstt)
        btnCalculate1=view.findViewById(R.id.btnCalculate1)

        btnCalculate1.setOnClickListener {
            area()
        }
        return view

    }

    private fun area() {
        val radius=etFirstt.text.toString().toInt()

        val result=(3.14*radius*radius).toFloat()

        Toast.makeText(context,"Area of circle is $result",Toast.LENGTH_SHORT).show()

    }

}