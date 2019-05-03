package com.diegoveega.evlab2_pdm_00118717.Fragments

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.diegoveega.evlab2_pdm_00118717.R
import kotlinx.android.synthetic.main.fragment_button.*


class Button : Fragment() {

    private var listener: ButtonListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_button, container, false)
    }

    private fun setNavigationListeners(view: View){
        left.setOnClickListener{
            listener?.onClick("LEFT")
        }
        right.setOnClickListener{
            listener?.onClick("RIGHT")
        }
    }

    fun onButtonPressed(nav_direction: String) {
        listener?.onClick(nav_direction)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is ButtonListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }


    interface ButtonListener {
        fun onClick(nav_direction : String)
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Button().apply {

            }
    }
}
