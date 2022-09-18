package com.example.mycontactapp.presentation.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.example.mycontactapp.R
import com.example.mycontactapp.data.model.ApiResponse
import com.example.mycontactapp.data.utils.VariableConstants
import com.example.mycontactapp.databinding.FragmentNewsDetailsBinding
import com.example.mycontactapp.presentation.viewmodel.NewsViewModel
import com.google.android.material.snackbar.Snackbar

class NewsDetailsFragment : Fragment() {
    private lateinit var binding: FragmentNewsDetailsBinding
    private lateinit var viewModel: NewsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_news_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentNewsDetailsBinding.bind(view)
        viewModel = (activity as MainActivity).viewModel
        val article = arguments?.getSerializable(VariableConstants.SELECTED_ARTICLE) as ApiResponse.Article
        binding.webView.apply {
            webViewClient = WebViewClient()
            if (article.url != "") {
                article.url?.let { loadUrl(it) }
            }
        }
        binding.btnSave.setOnClickListener {
            viewModel.saveArticle(article)
            Snackbar.make(view, "Saved", Snackbar.LENGTH_LONG).show()
        }
    }
}