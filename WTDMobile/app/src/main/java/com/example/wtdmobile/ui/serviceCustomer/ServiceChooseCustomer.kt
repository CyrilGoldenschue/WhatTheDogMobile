package com.example.wtdmobile.ui.serviceCustomer

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wtdmobile.R

class ServiceChooseCustomer : Fragment() {

    companion object {
        fun newInstance() = ServiceChooseCustomer()
    }

    private lateinit var viewModel: ServiceChooseCustomerViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.service_choose_customer_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ServiceChooseCustomerViewModel::class.java)
        // TODO: Use the ViewModel
    }

}