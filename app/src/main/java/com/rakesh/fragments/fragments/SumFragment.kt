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

class SumFragment : Fragment() {


    private lateinit var btnCalculate: Button
    private lateinit var etSecond: EditText
    private lateinit var etFirst: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment_sum,container,false)
        etFirst=view.findViewById(R.id.etFirst)
        etSecond=view.findViewById(R.id.etSecond)
        btnCalculate=view.findViewById(R.id.btnCalculate)

        btnCalculate.setOnClickListener {
            addTwoNumber()
        }
        return view
    }

    private fun addTwoNumber() {
        val first=etFirst.text.toString().toInt()
        val second=etSecond.text.toString().toInt()

        val result=first+second
        Toast.makeText(context,"Sum is $result",Toast.LENGTH_SHORT).show()

    }


}