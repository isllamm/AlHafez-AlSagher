package com.isllam.alhafez_alsagher.main.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.isllam.alhafez_alsagher.main.MainActivity
import com.isllam.alhafez_alsagher.R
import com.isllam.alhafez_alsagher.adapters.SurahAdapter
import com.isllam.alhafez_alsagher.databinding.FragmentHomeBinding
import com.isllam.alhafez_alsagher.pojo.Surah

class HomeFragment : Fragment(R.layout.fragment_home), SurahAdapter.OnItemClick {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var parent: MainActivity
    private val surahAdapter by lazy { SurahAdapter(this) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(requireView())
        parent = requireActivity() as MainActivity



        initSurahList()

    }

    private fun initSurahList() {
        val surah = mutableListOf(
            Surah(3, "سورة الإخلاص", ),
        )

        surahAdapter.submitList(surah)
        binding.rv.adapter = surahAdapter
    }

    override fun onItemClickListener(surah: Surah) {

    }

}