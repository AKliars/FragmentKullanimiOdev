package com.akliars.fragmentkullanimiodev

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.akliars.fragmentkullanimiodev.databinding.FragmentSayfaABinding
import com.akliars.fragmentkullanimiodev.databinding.FragmentSayfaYBinding


class SayfaYFragment : Fragment() {
    private lateinit var binding : FragmentSayfaYBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding  = FragmentSayfaYBinding.inflate(inflater, container, false)

        val geriTusu = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                Log.e("Detay Sayfa", "Geri tuşu tıklandı.")
                isEnabled = false // Geri tuşu işlevselliğini devre dışı bırak
                isEnabled = true
                val gecis = SayfaYFragmentDirections.yGecisAnasayfa()

                Navigation.findNavController(requireView()).navigate(gecis)

            }
        }



        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, geriTusu)




        return binding.root
    }

}

