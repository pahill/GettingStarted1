package com.example.gettingstarted1

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform