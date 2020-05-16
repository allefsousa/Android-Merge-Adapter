package com.developer.allef.boilerplateapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.developer.allef.boilerplateapp.R
import com.developer.allef.boilerplateapp.data.feiraLivre
import kotlinx.android.synthetic.main.item_card.view.*

/**
 * @author allef.santos on 15/05/20
 */class ListAdapter(val feiraList: MutableList<feiraLivre> = mutableListOf()) :RecyclerView.Adapter<ListAdapter.CardAdapterViewHolder>(){
     lateinit var context: Context
     override fun onCreateViewHolder(
         parent: ViewGroup,
         viewType: Int
     ): CardAdapterViewHolder {
          context = parent.context
         return CardAdapterViewHolder(
             LayoutInflater.from(parent.context).inflate(
                 R.layout.item_list,
                 parent,
                 false
             )
         )
     }

     override fun getItemCount(): Int  = feiraList.size

    fun addItems(list:List<feiraLivre>){
        feiraList.clear()
        feiraList.addAll(list)
        notifyDataSetChanged()
    }

     override fun onBindViewHolder(holder: CardAdapterViewHolder, position: Int) {
        val item = feiraList[position]
         Glide.with(context).load(item.image).into(holder.itemView.feira_image )
         holder.itemView.feira_name.text = item.name
         holder.itemView.feira_value.text = item.valor.toString()

     }
     inner class CardAdapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)


 }