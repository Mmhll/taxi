package com.mhl.taxi.ui.map

import android.opengl.Visibility
import androidx.fragment.app.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.mhl.taxi.MainActivity
import com.mhl.taxi.R

class MapsFragment : Fragment() {
    private lateinit var taxiButton: Button
    private lateinit var taxi2Button: Button
    private lateinit var taxi3Button: Button
    private lateinit var textView: TextView
    private lateinit var textviewCost : TextView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_maps, container, false)
        taxiButton = root.findViewById(R.id.button_taxi1)
        taxi2Button = root.findViewById(R.id.button_taxi2)
        taxi3Button = root.findViewById(R.id.button_taxi3)
        textView = root.findViewById(R.id.textViewHeader)
        textviewCost = root.findViewById(R.id.textview_cost)
        taxi2Button.setOnClickListener {
            taxi2Button.visibility = View.INVISIBLE
            taxiButton.visibility = View.VISIBLE
            taxi3Button.visibility = View.VISIBLE
            textviewCost.visibility = View.INVISIBLE
            textView.text = "Время ожидания\n5 минут"
        }
        taxiButton.setOnClickListener { view
            val dialog : AlertDialog.Builder = AlertDialog.Builder(requireActivity())
                .setView(R.layout.dialog)
            dialog.show()
        }
        taxi3Button.setOnClickListener {
            textView.text = "Стоимость поездки"
            taxi2Button.visibility = View.VISIBLE
            taxiButton.visibility = View.INVISIBLE
            taxi3Button.visibility = View.INVISIBLE
            textviewCost.visibility = View.VISIBLE
        }
        return root
    }
}