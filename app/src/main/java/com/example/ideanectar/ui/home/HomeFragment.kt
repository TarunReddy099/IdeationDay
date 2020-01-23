package com.example.ideanectar.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.ideanectar.*

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val view: View = inflater!!.inflate(R.layout.fragment_home, container, false)
val p3b =view!!.findViewById<Button>(R.id.button4)
        val p1b =view!!.findViewById<Button>(R.id.button2)
        val p2b =view!!.findViewById<Button>(R.id.button3)
        val p4b =view!!.findViewById<Button>(R.id.button5)
        p1b.setOnClickListener {
            val iii = Intent(activity,p1info::class.java)
            activity!!.startActivity(iii)
        }
        p2b.setOnClickListener {
            val iii = Intent(activity,p2info::class.java)
            activity!!.startActivity(iii)
        }


p3b.setOnClickListener {
    val iii = Intent(activity,p3info::class.java)
    activity!!.startActivity(iii)
}

        p4b.setOnClickListener {
            val iii = Intent(activity,p4info::class.java)
            activity!!.startActivity(iii)
        }





        return view
        return root
    }
}