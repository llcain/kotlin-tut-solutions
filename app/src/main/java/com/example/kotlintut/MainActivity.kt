package com.example.kotlintut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    internal var totalSoFar = 0

     internal var myACounter = 0
    // internal var myBCounter = 0

    fun total():Int {
        return totalSoFar
    }

    fun scan (good:Char) {
        println("\nThe character is: " + good)

        when (good) {
            'A' -> {
                myACounter = myACounter + 1
                if(myACounter == 3)
                {
                    totalSoFar = totalSoFar + 30
                    myACounter = 0
                }
                else {
                    totalSoFar = totalSoFar + 50
                }
            }
            'B' -> totalSoFar = totalSoFar + 30
            'C' -> totalSoFar = totalSoFar + 20
            'D' -> totalSoFar = totalSoFar + 15
        }

    }

     // totalSoFar = totalSoFar + 50

//    if (good == 'A')
//    {
//        totalSoFar = totalSoFar + 50
//    }
//    else
//    {
//        totalSoFar = totalSoFar + 30
//    }

//    when (good) {
//        'A' -> totalSoFar = totalSoFar + 50
//        'B' -> totalSoFar = totalSoFar + 30
//        'C' -> totalSoFar = totalSoFar + 20
//        'D' -> totalSoFar = totalSoFar + 15
//    }

//    when (good) {
//        'A' -> {
//            myACounter = myACounter + 1
//            if (myACounter === 3)
//            {
//                totalSoFar = totalSoFar + 30
//                myACounter = 0
//            }
//            else
//            {
//                totalSoFar = totalSoFar + 50
//            }
//        }
//        'B' -> totalSoFar = totalSoFar + 30
//        'C' -> totalSoFar = totalSoFar + 20
//        'D' -> totalSoFar = totalSoFar + 15
//    }

//    when (good) {
//        'A' -> {
//            myACounter = myACounter + 1
//            if (myACounter === 3)
//            {
//                totalSoFar = totalSoFar + 30
//                myACounter = 0
//            }
//            else
//            {
//                totalSoFar = totalSoFar + 50
//            }
//        }
//        'B' -> totalSoFar = totalSoFar + 30
//        'C' -> totalSoFar = totalSoFar + 20
//        'D' -> totalSoFar = totalSoFar + 15
//    }

    //    when (good) {
//        'A' -> {
//            myACounter = myACounter + 1
//            if (myACounter === 3)
//            {
//                totalSoFar = totalSoFar + 30
//                myACounter = 0
//            }
//            else
//            {
//                totalSoFar = totalSoFar + 50
//            }
//        }
//        'B' -> totalSoFar = totalSoFar + 30
//        'C' -> totalSoFar = totalSoFar + 20
//        'D' -> totalSoFar = totalSoFar + 15
//    }

    //    when (good) {
//        'A' -> {
//            myACounter = myACounter + 1
//            if (myACounter === 3)
//            {
//                totalSoFar = totalSoFar + 30
//                myACounter = 0
//            }
//            else
//            {
//                totalSoFar = totalSoFar + 50
//            }
//        }
//        'B' -> totalSoFar = totalSoFar + 30
//        'C' -> totalSoFar = totalSoFar + 20
//        'D' -> totalSoFar = totalSoFar + 15
//    }

    //    when (good) {
//        'A' -> {
//            myACounter = myACounter + 1
//            if (myACounter === 3)
//            {
//                totalSoFar = totalSoFar + 30
//                myACounter = 0
//            }
//            else
//            {
//                totalSoFar = totalSoFar + 50
//            }
//        }
//        'B' -> totalSoFar = totalSoFar + 30
//        'C' -> totalSoFar = totalSoFar + 20
//        'D' -> totalSoFar = totalSoFar + 15
//    }

//    when (good) {
//        'A' -> {
//            myACounter = myACounter + 1
//            if (myACounter === 3)
//            {
//                totalSoFar = totalSoFar + 30
//                myACounter = 0
//            }
//            else
//            {
//                totalSoFar = totalSoFar + 50
//            }
//        }
//        'B' -> {
//            myBCounter = myBCounter + 1
//            if (myBCounter === 2)
//            {
//                totalSoFar = totalSoFar + 15
//            }
//            else
//            {
//                totalSoFar = totalSoFar + 30
//            }
//        }
//        'C' -> totalSoFar = totalSoFar + 20
//        'D' -> totalSoFar = totalSoFar + 15
//    }





}
