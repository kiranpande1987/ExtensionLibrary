package com.kprights.library.extensionlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kprights.library.extensions.isAvailable
import com.kprights.library.extensions.isNotAvailable

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        testStringExtensionFunction()
    }

    private fun testStringExtensionFunction(){
        var source: String? = null

        // NULL check.
        source.isAvailable {
            println(it)
        }.isNotAvailable {
            println("String is NULL or Empty")
        }

        source = "This is First Statement"

        source.isAvailable {
            println(it)
        }.isNotAvailable {
            println("String is NULL or Empty")
        }
    }
}