package com.kprights.library.extensionlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kprights.library.extensions.run2DForLoop
import com.kprights.library.mylibrary.MyLibraryRemote
import com.kprights.library.mylibrary.isAvailable
import com.kprights.library.mylibrary.isNotAvailable
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        testStringExtensionFunction()

        print(MyLibraryRemote().getNumberFromRemote())
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