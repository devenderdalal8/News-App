package com.example.mycontactapp.presentation.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.mycontactapp.R
import com.example.mycontactapp.databinding.ActivityMainBinding
import com.example.mycontactapp.presentation.adapter.NewsHeadLineAdapter
import com.example.mycontactapp.presentation.viewmodel.NewsViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    val viewModel: NewsViewModel by viewModels()

    @Inject
    lateinit var newsAdapter: NewsHeadLineAdapter
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this , R.layout.activity_main)
        setContentView(binding.root)
        setUpNavHost()
    }

    private fun setUpNavHost() {
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHostFragment.navController
        binding.bnvNews.setupWithNavController(navController)
    }
}