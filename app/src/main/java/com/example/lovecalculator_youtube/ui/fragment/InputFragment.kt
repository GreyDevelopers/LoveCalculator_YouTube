package com.example.lovecalculator_youtube.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.lovecalculator_youtube.R
import com.example.lovecalculator_youtube.databinding.FragmentInputBinding

class InputFragment :Fragment(R.layout.fragment_input){

    private lateinit var binding: FragmentInputBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentInputBinding.bind(view)

        binding.submit.setOnClickListener {
            findNavController().navigate(R.id.action_inputFragment_to_resultFragment)
        }
    }
}