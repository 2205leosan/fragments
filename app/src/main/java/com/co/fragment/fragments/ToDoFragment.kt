package com.co.fragment.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class ToDoFragment: Fragment () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmento: View = inflater.inflate(R.layout.fragment_to_do, container, false)

        val detail1: Button = fragmento.findViewById(R.id.btn_detail_1)
        val detail2: Button = fragmento.findViewById(R.id.btn_detail_2)
        val detail3: Button = fragmento.findViewById(R.id.btn_detail_3)

        detail1.setOnClickListener(View.OnClickListener {
            val datos = Bundle()
            datos.putString("tarea", resources.getString(R.string.txt_tarea1))
            datos.putString("hora", "10:00")
            datos.putString("lugar", "kwikmart")
            activity?.getSupportFragmentManager()?.beginTransaction()
                ?.setReorderingAllowed(true)
                ?.replace(R.id.fragment_container_view, DetailFragment::class.java, datos, "detail")
                ?.addToBackStack("")
                ?.commit()

        })

        detail2.setOnClickListener(View.OnClickListener {
            val datos = Bundle()
            datos.putString("tarea", resources.getString(R.string.txt_tarea2))
            datos.putString("hora", "12:00")
            datos.putString("lugar", "Taller J J")
            activity?.getSupportFragmentManager()?.beginTransaction()
                ?.setReorderingAllowed(true)
                ?.replace(R.id.fragment_container_view, DetailFragment::class.java, datos, "detail")
                ?.addToBackStack("")
                ?.commit()

        })

        detail3.setOnClickListener(View.OnClickListener {
            val datos = Bundle()
            datos.putString("tarea", resources.getString(R.string.txt_tarea3))
            datos.putString("hora", "15:00")
            datos.putString("lugar", "Lava seco")
            activity?.getSupportFragmentManager()?.beginTransaction()
                ?.setReorderingAllowed(true)
                ?.replace(R.id.fragment_container_view, DetailFragment::class.java, datos, "detail")
                ?.addToBackStack("")
                ?.commit()

        })

        return fragmento
    }

}