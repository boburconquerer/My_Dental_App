package com.example.myapplication.mainPageWithFragments.bottom_fragments.priceListPages

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.mainPageWithFragments.bottom_fragments.patientPages.PatientAdapter
import com.example.myapplication.mainPageWithFragments.bottom_fragments.patientPages.PatientModel

class PriceListFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_price_list, container, false)
        initViews(view)
        return view
    }

    private fun initViews(view: View) {
        recyclerView = view.findViewById(R.id.price_list_recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        refreshData(data())
    }

    private fun data(): ArrayList<PriceListModel> {
        val list = ArrayList<PriceListModel>()
        list.add(PriceListModel("olish","120,000",R.drawable.round_currency_ruble_24))
        list.add(PriceListModel("O'zgartirish", "200,000",R.drawable.baseline_currency_yen_24))
        list.add(PriceListModel("olish","120,000",R.drawable.round_currency_ruble_24))
        list.add(PriceListModel("O'zgartirish", "200,000",R.drawable.baseline_currency_yen_24))
        list.add(PriceListModel("olish","120,000",R.drawable.round_currency_ruble_24))
        list.add(PriceListModel("O'zgartirish", "200,000",R.drawable.round_currency_ruble_24))
        list.add(PriceListModel("olish","120,000",R.drawable.round_currency_ruble_24))
        list.add(PriceListModel("O'zgartirish", "200,000",R.drawable.baseline_currency_yen_24))
        list.add(PriceListModel("olish","120,000",R.drawable.round_currency_ruble_24))
        list.add(PriceListModel("O'zgartirish", "200,000",R.drawable.round_currency_ruble_24))
        list.add(PriceListModel("olish","120,000",R.drawable.baseline_currency_yen_24))
        list.add(PriceListModel("O'zgartirish", "200,000",R.drawable.baseline_currency_yen_24))
        return list
    }

    private fun refreshData(data: ArrayList<PriceListModel>) {
        val adapter =PriceListAdapter(this, data)
        recyclerView.adapter = adapter
    }

}