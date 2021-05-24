package edu.ib.rdemo1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NameAdapter(private val names: List<String>) :
RecyclerView.Adapter<NameAdapter.NameViewHolder>()  {

    class NameViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val  txtName=itemView.findViewById(R.id.txName) as TextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.name_item,parent,false)
        return NameViewHolder(view)
    }

    override fun onBindViewHolder(holder: NameViewHolder, position: Int) {
        val element=names[position]
        holder.txtName.text=element
    }

    override fun getItemCount(): Int {
        return names.size
    }


}