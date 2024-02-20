package com.akliars.fragmentkullanimiodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.akliars.fragmentkullanimiodev.databinding.FragmentSayfaABinding
import com.akliars.fragmentkullanimiodev.databinding.FragmentSayfaBBinding


class SayfaBFragment : Fragment() {
    private lateinit var binding : FragmentSayfaBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding  = FragmentSayfaBBinding.inflate(inflater, container, false)

        binding.buttonGitBY.setOnClickListener {
            val gecis = SayfaBFragmentDirections.bGecisY()

            Navigation.findNavController(it).navigate(gecis)
        }

        return binding.root
    }

}