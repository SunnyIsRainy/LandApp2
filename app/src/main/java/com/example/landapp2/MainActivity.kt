package com.example.landapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.landapp2.Adpater.RoomAdapter
import com.example.landapp2.Data.Room
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<Room>()

    lateinit var mRoomAdapter: RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add( Room( 7500, "서울시 동대문구", 8, "서울시 동대문구의 8층 7500만원 방 입니다." ) )
        mRoomList.add( Room( 12500, "서울시 동작구", 0, "서울시 동작구의 반지하 1억 2500만원 방 입니다." ) )

        mRoomAdapter = RoomAdapter(this, R.layout.room_list_item, mRoomList)
        roomListView.adapter = mRoomAdapter

        roomListView.setOnItemClickListener { parent, view, position, id ->
            val roomData = mRoomList[position]
            val myIntent = Intent(this, )
        }

    }

}