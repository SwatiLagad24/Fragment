package com.example.fragmentdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class CounterFragment:Fragment() {
    private lateinit var  txtCount:TextView
    private lateinit var btnMinus:Button
    private lateinit var btnPlus:Button
    var count=0
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //using view binding
        //this will use counterLayout.xml to inflate view
       var view =LayoutInflater.from(context).inflate(R.layout.counter_layout,null)


        txtCount=view.findViewById(R.id.txtCount)
        btnMinus=view.findViewById(R.id.btnMinus)
        btnPlus=view.findViewById(R.id.btnPlus)
        txtCount.setText("$count")
        btnMinus.setOnClickListener{
            --count
            txtCount.setText("$count")

        }
        btnPlus.setOnClickListener{
            ++count
            txtCount.setText("$count")

        }

        return view

       /* var txtInfo= TextView(context)
        txtInfo.setTextSize(30F)
        txtInfo.setText("Welcome ")
        return super.onCreateView(inflater, container, savedInstanceState)
        return txtInfo*/
    }


}