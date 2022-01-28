package com.example.wtdmobile.ui.serviceAdmin

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wtdmobile.R

class ServiceChooseAdmin : Fragment() {

    companion object {
        fun newInstance() = ServiceChooseAdmin()
    }
    private lateinit var viewModel: ServiceChooseAdminViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.service_choose_admin_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ServiceChooseAdminViewModel::class.java)
        // TODO: Use the ViewModel
    }

}