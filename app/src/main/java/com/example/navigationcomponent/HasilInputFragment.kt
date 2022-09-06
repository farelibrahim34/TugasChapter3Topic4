package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_dua.*
import kotlinx.android.synthetic.main.fragment_hasil_input.*


class HasilInputFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hasil_input, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        mengambildata dari fragment2
        var getUmur = arguments?.getString("dataumur")
//        set data umur ke dalam text view
        txtGetUmur.text = getUmur

        val userUmur = arguments?.getString("userUmur")
        txtUserUmur.text = "Halo, "+userUmur


//        membuat toast
        Toast.makeText(context, getUmur, Toast.LENGTH_LONG).show()


    }

}