package com.example.wordsapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.wordsapp.databinding.FragmentLetterListBinding

class LetterListFragment : Fragment() {
    private var _binding: FragmentLetterListBinding? = null

    // Only use "!!" after a val when you know for certain it won't be null.
    // Also, "get()" means "get-only," so once used that val can't be
    // assigned something new.
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLetterListBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }
}