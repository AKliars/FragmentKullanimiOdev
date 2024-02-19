package com.akliars.fragmentkullanimiodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.akliars.fragmentkullanimiodev.databinding.FragmentSayfaABinding


class SayfaAFragment : Fragment() {

    private lateinit var binding : FragmentSayfaABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding  = FragmentSayfaABinding.inflate(inflater, container, false)


        binding.buttonGitB.setOnClickListener {
            val gecis2 = SayfaAFragmentDirections.aGecisB()

            Navigation.findNavController(it).navigate(gecis2)
        }


        return binding.root
    }



}