package com.mhl.taxi.ui.story

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment
import com.mhl.taxi.R

class StoryFragment : Fragment() {
    private lateinit var listView: ListView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root: View = inflater.inflate(R.layout.activity_story_fragment, container, false)
        listView = root.findViewById(R.id.listView)
        val array : ArrayList<String> = ArrayList()

        for (i in 1..30){
            array.add("Откуда:\nКуда:")
        }
        val arrayAdapter : ArrayAdapter<String> = ArrayAdapter(requireActivity(), android.R.layout.simple_list_item_1,
            array
        )
        listView.adapter = arrayAdapter
        return root
    }
}