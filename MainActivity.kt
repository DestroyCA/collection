package com.practicum.a2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
fun main() {
    var arr : Array<Char> = arrayOf()
    for (i in CharRange('a', 'z'))
        arr += i
    for (i in arr)
        print(i + " ")
}