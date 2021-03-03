package com.mishamoovex.tesring.myapplication.presentation.features

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mishamoovex.tesring.myapplication.R
import com.mishamoovex.tesring.myapplication.databinding.LayoutActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding : LayoutActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = LayoutActivityMainBinding.inflate(layoutInflater)
            .also { setContentView(it.root) }

    }
}