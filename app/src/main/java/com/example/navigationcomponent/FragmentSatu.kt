package com.example.navigationcomponent

import android.app.ProgressDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_satu.*
import kotlinx.android.synthetic.main.fragment_satu.view.*
import kotlinx.android.synthetic.main.fragment_tiga.*


class FragmentSatu : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_satu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)




        btn1.setOnClickListener {
            val username = inputUsername.text.toString()
            val password = inputPw.text.toString()
            if(username.isEmpty()|| password.isEmpty()){
                Toast.makeText(context, "SILAHKAN ISI USERNAME DAN PASSWORD ANDA", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }else if (username=="farrel123"&&password=="123"){
                val progressDialog = ProgressDialog(context, com.google.android.material.R.style.Theme_MaterialComponents_Light_Dialog,)
                progressDialog.isIndeterminate = true
                progressDialog.setMessage("Loading...")
                progressDialog.show()

                val bund = Bundle()
                bund.putString("getusername",username)

                Navigation.findNavController(view).navigate(R.id.action_fragmentSatu2_to_fragmentDua22,bund)
            }else{
                Toast.makeText(context, "USERNAME DAN PASSWORD ANDA SALAH", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }






        }
        txtRegist.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_fragmentSatu2_to_fragmentTiga2)
        }
        txtLupapw.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentSatu2_to_lupaPaswordFragment)
        }
        iconChats.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_fragmentSatu2_to_chatCsFragment)
        }
        iconHelp.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_fragmentSatu2_to_helpFragment)
        }

    }
    fun login(username : String = "farrel123", password : String = "123"){

    }

}