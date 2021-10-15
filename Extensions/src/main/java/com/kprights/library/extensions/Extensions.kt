package com.kprights.library.extensions


/**
 * Copyright (c) 2021 for KPrights
 *
 * User : Kiran Pande
 * Date : 9/10/21
 * Time : 4:32 PM
 */

fun String?.isAvailable(function: (String) -> Unit): String? {
    this?.takeIf { it.isNotEmpty() }?.let { function(this) }
    return this
}

fun String?.isNotAvailable(function: (String?) -> Unit): String? {
    if(this == null || this.isEmpty()) function(this)
    return this
}

fun List<Any>?.run2DForLoop(function: (Any?, Any?) -> Unit) {
    this?.takeIf { it.isNotEmpty() }?.let {

        this.forEach { first ->
            this.forEach { second ->
                function(first, second)
            }
        }
    }
}

fun List<Any>?.run2DForLoopSkipSelf(function: (Any?, Any?) -> Unit) {
    this?.takeIf { it.isNotEmpty() }?.let {

        this.forEach { first ->
            this.forEach { second ->
                if(first != second) function(first, second)
            }
        }
    }
}

fun List<Any>?.run2DForLoopFromSelf(function: (Any?, Any?) -> Unit) {
    this?.takeIf { it.isNotEmpty() }?.let {

        this.forEachIndexed { firstIndex, first ->
            this.forEachIndexed { secondIndex, second ->
                if(secondIndex >= firstIndex)  function(first, second)
            }
        }
    }
}

fun List<Any>?.run2DForLoopAheadOfSelf(function: (Any?, Any?) -> Unit) {
    this?.takeIf { it.isNotEmpty() }?.let {

        this.forEachIndexed { firstIndex, first ->
            this.forEachIndexed { secondIndex, second ->
                if(secondIndex > firstIndex)  function(first, second)
            }
        }
    }
}

fun List<Any>?.run2DForLoopTillSelf(function: (Any?, Any?) -> Unit) {
    this?.takeIf { it.isNotEmpty() }?.let {

        this.forEach { first ->
            this.forEach { second ->
                if(first == second) function(first, second)
            }
        }
    }
}

class Extensions {

}