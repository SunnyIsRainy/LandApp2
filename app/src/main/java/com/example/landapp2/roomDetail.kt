package com.example.landapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.landapp2.Data.Room
import kotlinx.android.synthetic.main.activity_room_detail.*

class roomDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_detail)

        val roomData = intent.getSerializableExtra("room") as Room

        priceView.text = roomData.changePriceToBeauty()
        descriptionView.text = roomData.description
        addressView.text = roomData.address
        floorView.text = roomData.changeFloorToBeauty()
    }
}