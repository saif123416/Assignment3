package com.sagosh.userdata

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sagosh.userdata.model.usresItem

class adapter(val context: Context, val userlist: List<usresItem>) :
    RecyclerView.Adapter<adapter.userHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): userHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_layout,parent, false)
        return userHolder(view)
    }

    override fun onBindViewHolder(holder: userHolder, position: Int) {
        val user = userlist[position]
        holder.userName.text = user.login
        holder.userDesc.text = user.url

    }

    override fun getItemCount(): Int {
        return userList.size
    }

    class userHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var userImage = itemView.findViewById<ImageView>(R.id.userImage)
        var userName = itemView.findViewById<TextView>(R.id.userName)
        var userDesc = itemView.findViewById<TextView>(R.id.userDesc)

    }
}