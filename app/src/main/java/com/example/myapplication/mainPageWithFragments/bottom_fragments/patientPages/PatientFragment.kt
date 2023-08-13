package com.example.myapplication.mainPageWithFragments.bottom_fragments.patientPages

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class PatientFragment : Fragment() {

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
        val view =  inflater.inflate(R.layout.fragment_patient, container, false)
        initViews(view)
        return view
    }

    private fun initViews(view: View) {
        recyclerView = view.findViewById(R.id.patient_recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        
        refreshData(data())
    }

    private fun data(): ArrayList<PatientModel> {
        val list = ArrayList<PatientModel>()
        list.add(PatientModel(R.drawable.dental_image,"Boburbek", "Abdug'afforov"))
        list.add(PatientModel(R.drawable.dentistjpg,"Elon","Musk"))
        list.add(PatientModel(R.drawable.dental_image,"Boburbek", "Abdug'afforov"))
        list.add(PatientModel(R.drawable.dentistjpg,"Elon","Musk"))
        list.add(PatientModel(R.drawable.dental_image,"Boburbek", "Abdug'afforov"))
        list.add(PatientModel(R.drawable.dentistjpg,"Elon","Musk"))
        list.add(PatientModel(R.drawable.dental_image,"Boburbek", "Abdug'afforov"))
        list.add(PatientModel(R.drawable.dentistjpg,"Elon","Musk"))
        list.add(PatientModel(R.drawable.dental_image,"Boburbek", "Abdug'afforov"))
        list.add(PatientModel(R.drawable.dentistjpg,"Elon","Musk"))
        list.add(PatientModel(R.drawable.dental_image,"Boburbek", "Abdug'afforov"))
        list.add(PatientModel(R.drawable.dentistjpg,"Elon","Musk"))
        list.add(PatientModel(R.drawable.dental_image,"Boburbek", "Abdug'afforov"))
        list.add(PatientModel(R.drawable.dentistjpg,"Elon","Musk"))
        return list
    }

    private fun refreshData(data: ArrayList<PatientModel>) {
        val adapter = PatientAdapter(this,data)
        recyclerView.adapter = adapter
    }


}