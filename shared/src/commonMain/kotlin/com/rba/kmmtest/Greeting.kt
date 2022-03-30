package com.rba.kmmtest

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}