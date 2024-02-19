package com.akliars.fragmentkullanimiodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.akliars.fragmentkullanimiodev.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        // Anasayfadan A Sayfasına Geçiş
        binding.buttonGitA.setOnClickListener {
            val gecis = AnasayfaFragmentDirections.anasayfaGecisA()

            Navigation.findNavController(it).navigate(gecis)
        }
        // Anasayfadan X Sayfasına Geçiş
        binding.buttonGitX.setOnClickListener {
            val gecis = AnasayfaFragmentDirections.anasayfaGecisX()

            Navigation.findNavController(binding.root).navigate(gecis)
        }



        return binding.root
    }

}