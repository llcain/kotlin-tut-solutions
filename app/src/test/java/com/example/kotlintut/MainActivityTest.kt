@file:Suppress("DEPRECATION")

package com.example.kotlintut

import android.os.Parcel
import android.os.Parcelable
import org.junit.Assert.*
import org.junit.rules.ExpectedException
import com.example.kotlintut.MainActivity as ComExampleKotlintutMainActivity
import com.example.kotlintut.MainActivityTest as MainActivityTest1
import org.junit.Test as JunitTest
import kotlin.CharSequence as CharSequence1

@Suppress("DEPRECATION")
 class MainActivityTest<Int1>() {


    @JunitTest
    @Throws(Exception::class)
    fun priceIsZeroWhenNoGoods() {
        val noItems = ""
        val price = price(noItems)
        assertEquals(0, price(noItems))

    }


    private fun price(goods: CharSequence1): kotlin.Int {
        val mainActivityTest = ComExampleKotlintutMainActivity()
        for (i in 0 until goods.length) {
            val good = goods.get(i)
            mainActivityTest.scan(good)

        }

        return mainActivityTest.total()
    }

    @JunitTest
    @Throws(Exception::class)
    fun priceIsFiftyWhenGoodIsA() {
        val items = "A"
        val price = price(items)
        assertEquals(50, price)
    }

    @JunitTest
    @Throws(Exception::class)
    fun priceIsEightyWhenGoodIsA() {
        val items = "AB"
        val price = price(items)
        assertEquals(80, price)
    }

    @JunitTest
    @Throws(Exception::class)
    fun priceIsOneHundredFifteenWhenGoodAreCDBA() {
        val items = "CDBA"
        val price = price(items)
        assertEquals(115, price)
    }

//    //Section 1 ends
//    //Section 2 starts
//
    @JunitTest
    @Throws(Exception::class)
    fun priceIsOneHundredWhenGoodAreAA() {
        val items = "AA"
        val price = price(items)
        assertEquals(100, price)
    }

    @JunitTest
    @Throws(Exception::class)
    fun priceIsOneHundredThirtyWhenGoodAreAAA() {
        val items = "AAA"
        val price = price(items)
        assertEquals(130, price)
    }

//    @JunitTest
//    @Throws(Exception::class)
//    fun priceIsOneHundredEightyWhenGoodAreAAAA() {
//        val items = "AAAA"
//        val price = price(items)
//        assertEquals(180, price)
//    }
//
//    @JunitTest
//    @Throws(Exception::class)
//    fun priceIsTwoHundredThirtyWhenGoodAreAAAAA() {
//        val items = "AAAAA"
//        val price = price(items)
//        assertEquals(230, price)
//    }
//
//    @JunitTest
//    @Throws(Exception::class)
//    fun priceIsTwoHundredSixtyWhenGoodAreAAAAAA() {
//        val items = "AAAAAA"
//        val price = price(items)
//        assertEquals(260, price)
//    }

//    //Section 2 ends
//    //Section 3 begins
//
//    @JunitTest
//    @Throws(Exception::class)
//    fun priceIsOneHundredSixtyWhenGoodAreAAAB() {
//        val items = "AAAB"
//        val price = price(items)
//        assertEquals(160, price)
//    }
//
//    @JunitTest
//    @Throws(Exception::class)
//    fun priceIsOneHundredNinetyWhenGoodAreAAABBD() {
//        val items = "AAABBD"
//        val price = price(items)
//        assertEquals(190, price)
//    }
//
//    @JunitTest
//    @Throws(Exception::class)
//    fun priceIsOneHundredNinetyWhenGoodAreDABABA() {
//        val items = "DABABA"
//        val price = price(items)
//        assertEquals(190, price)
//    }

//    //Section 3 ends
//    //Section 4 starts

//    @JunitTest
//    fun `getTotalSoFar$app`() {
//
//    }
//
//    @JunitTest
//    fun `setTotalSoFar$app`() {
//
//    }
//
//    @JunitTest
//    fun total() {
//
//    }
//
//    @JunitTest
//    fun scan() {
//
//    }

}














