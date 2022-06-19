package com.example.landapp2.Adpater

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.landapp2.Data.Room
import com.example.landapp2.R

class RoomAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<Room>) : ArrayAdapter<Room>(mContext, resId, mList) {

        val inflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if (tempRow == null) {
            tempRow = inflater.inflate(R.layout.room_list_item, null)
        }

        val Row = tempRow!!


        val roomData = mList[position]

        val priceView = Row.findViewById<TextView>(R.id.priceView)
        val addressAndFloorView = Row.findViewById<TextView>(R.id.addressAndFloorView)
        val descriptionView = Row.findViewById<TextView>(R.id.descriptionView)

        priceView.text = roomData.changePriceToBeauty()
        addressAndFloorView.text = "${roomData.address}, ${roomData.changeFloorToBeauty()}"
        descriptionView.text = roomData.description

        return Row

    }

}