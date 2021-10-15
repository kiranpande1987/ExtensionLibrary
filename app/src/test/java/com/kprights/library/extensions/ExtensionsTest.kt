package com.kprights.library.extensions

import org.junit.Assert.*
import org.junit.Test
import java.util.ArrayList

/**
 * Copyright (c) 2021 for KPrights
 *
 *
 * User : Kiran Pande
 * Date : 11/10/21
 * Time : 10:31 PM
 */

class ExtensionsTest{
    @Test
    fun runForLoop(){
        val list = ArrayList<String>()

        list.add("One")
        list.add("Two")
        list.add("Three")
        list.add("Four")

        list.run2DForLoop { first, second -> println("$first, $second") }
        list.run2DForLoopSkipSelf { first, second -> println("$first, $second") }
        list.run2DForLoopFromSelf { first, second -> println("$first, $second") }
        list.run2DForLoopAheadOfSelf { first, second -> println("$first, $second") }
        list.run2DForLoopTillSelf { first, second -> println("$first, $second") }
    }
}