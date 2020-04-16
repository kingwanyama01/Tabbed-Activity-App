package com.king.myfirsttabbedapp.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast

import com.king.myfirsttabbedapp.R



/**
 * A simple [Fragment] subclass.

 */
class StatusFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var root = inflater.inflate(R.layout.fragment_status, container, false)
        var img_status:ImageView = root.findViewById(R.id.mImgStatus)
        img_status.setOnClickListener{
            Toast.makeText(activity,"Image clicked",Toast.LENGTH_LONG).show()
        }
        return root
    }


}
