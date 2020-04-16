package com.king.myfirsttabbedapp.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.Toast

import com.king.myfirsttabbedapp.R


/**
 * A simple [Fragment] subclass.
 */
class ChatsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var root = inflater.inflate(R.layout.fragment_chats, container, false)
        var my_list:ListView = root.findViewById(R.id.mListChats)
        my_list.setOnItemClickListener { parent, view, position, id ->
            var item = parent.getItemAtPosition(position).toString()
            Toast.makeText(activity,"$item clicked",Toast.LENGTH_LONG).show()
        }
        return root
    }

}
