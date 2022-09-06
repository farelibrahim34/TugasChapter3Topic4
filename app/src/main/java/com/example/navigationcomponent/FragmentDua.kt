package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_dua.*


class FragmentDua : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dua, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val getUsername = arguments?.getString("getusername")
        txtGetUsername.text = "Halo, "+getUsername

        backHome.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentDua2_to_fragmentSatu2)
        }

        btnSimpan.setOnClickListener {
            var dataUmur = inputUmur.text.toString().toInt()
            var bund = Bundle()
            var hitung = (2022-dataUmur)
            val usernameumur = getUsername.toString()

            bund.putString("dataumur", hitung.toString())
            bund.putString("userUmur",usernameumur)

            Navigation.findNavController(view).navigate(R.id.action_fragmentDua2_to_hasilInputFragment, bund)
        }

        iconProfile.setOnClickListener {
            val bund = Bundle()
            val usernameumur = getUsername.toString()
            bund.putString("userUmurProfile",usernameumur)
            Navigation.findNavController(view).navigate(R.id.action_fragmentDua2_to_profileFragment,bund)
        }
    }
}