package com.mishamoovex.tesring.myapplication.presentation.features.task.display

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mishamoovex.tesring.myapplication.databinding.LayoutFragmentTaskBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DisplayTaskFragment : Fragment() {

    private lateinit var binding: LayoutFragmentTaskBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = LayoutFragmentTaskBinding.inflate(inflater, container, false).apply {
            lifecycleOwner = viewLifecycleOwner
        }
        return binding.root
    }
}