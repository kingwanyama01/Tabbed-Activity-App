package com.king.myfirsttabbedapp.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

import com.king.myfirsttabbedapp.R


/**
 * A simple [Fragment] subclass.
 */
class CallsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var root = inflater.inflate(R.layout.fragment_calls, container, false)
        var call_btn:Button = root.findViewById(R.id.mBtnCall)
        call_btn.setOnClickListener {
            Toast.makeText(activity,"Button clicked",Toast.LENGTH_LONG).show()
        }
        return root
    }

}
