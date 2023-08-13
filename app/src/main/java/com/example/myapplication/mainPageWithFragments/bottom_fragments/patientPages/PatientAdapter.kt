package com.example.myapplication.mainPageWithFragments.bottom_fragments.patientPages

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R


class PatientAdapter(list1: PatientFragment, var list: ArrayList<PatientModel>): RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.patient_bottom_item,parent,false)
        return PatientViewHolder(view)
    }


    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var model: PatientModel = list[position]
        if(holder is PatientViewHolder){
            holder.patientImage.setImageResource(model.image)
            holder.patientName.text = model.name
            holder.patientLastName.text = model.lastName
        }
    }

    class PatientViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var patientImage: ImageView = view.findViewById(R.id.patient_image)
        var patientName: TextView = view.findViewById(R.id.patient_name)
        var patientLastName: TextView = view.findViewById(R.id.patient_last_name)
    }


}