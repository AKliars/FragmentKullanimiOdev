package com.akliars.fragmentkullanimiodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.akliars.fragmentkullanimiodev.databinding.FragmentSayfaABinding
import com.akliars.fragmentkullanimiodev.databinding.FragmentSayfaXBinding


class SayfaXFragment : Fragment() {
    private lateinit var binding : FragmentSayfaXBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding  = FragmentSayfaXBinding.inflate(inflater, container, false)

        binding.buttonGitXY.setOnClickListener {
            val gecis = SayfaXFragmentDirections.xGecisY()

            Navigation.findNavController(it).navigate(gecis)
        }

        return binding.root
    }

}