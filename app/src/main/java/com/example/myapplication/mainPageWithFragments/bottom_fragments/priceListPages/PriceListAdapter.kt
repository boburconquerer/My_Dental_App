package com.example.myapplication.mainPageWithFragments.bottom_fragments.priceListPages

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import java.util.zip.Inflater

class PriceListAdapter(list2: PriceListFragment, var list: ArrayList<PriceListModel>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.price_list_bottom_item,parent,false)
        return PriceListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var model: PriceListModel = list[position]
        if(holder is PriceListViewHolder){
            holder.priceListName.text = model.name
            holder.priceListPrice.text = model.price
            holder.priceListCurrency.setImageResource(model.image)
        }
    }


}

class PriceListViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    var priceListName: TextView = view.findViewById(R.id.name_price_list)
    var priceListPrice: TextView = view.findViewById(R.id.price_price_list)
    var priceListCurrency: ImageView = view.findViewById(R.id.currency_price_list)
}
