package com.kprights.library.mylibrary


/**
 * Copyright (c) 2021 for KPrights
 *
 * User : Kiran Pande
 * Date : 10/10/21
 * Time : 6:54 PM
 */

fun String?.isAvailable(function: (String) -> Unit): String? {
    this?.takeIf { it.isNotEmpty() }?.let { function(this) }
    return this
}

fun String?.isNotAvailable(function: (String?) -> Unit): String? {
    if(this == null || this.isEmpty()) function(this)
    return this
}