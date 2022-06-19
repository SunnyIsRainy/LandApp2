package com.example.landapp2.Data

import java.io.Serializable
import java.text.NumberFormat
import java.util.*

class Room(
    val price: Int,
    val address: String,
    val floor: Int,
    val description: String) : Serializable {

    fun changePriceToBeauty(): String {
        if (this.price >= 10000) {
            val uk = this.price/10000
            val chun = this.price%10000
            return "${uk}억 ${NumberFormat.getNumberInstance(Locale.KOREA).format(chun)}만원"
            }

        else {
            val chun = this.price%10000
            return "${NumberFormat.getNumberInstance(Locale.KOREA).format(chun)}만원"
        }
    }

    fun changeFloorToBeauty(): String {
        if (this.floor >= 1) {
            return "${this.floor}층"
        }

        else if (this.floor == 0) {
            return "반지하"
        }

        else {
            return "지하 ${-this.floor}층"
        }
    }

}