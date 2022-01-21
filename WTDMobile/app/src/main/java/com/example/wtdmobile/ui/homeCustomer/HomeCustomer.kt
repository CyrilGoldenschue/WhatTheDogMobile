package com.example.wtdmobile.ui.homeCustomer

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wtdmobile.R

class HomeCustomer : Fragment() {

    companion object {
        fun newInstance() = HomeCustomer()
    }

    private lateinit var viewModel: HomeCustomerViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.home_customer_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HomeCustomerViewModel::class.java)
        // TODO: Use the ViewModel
    }

}