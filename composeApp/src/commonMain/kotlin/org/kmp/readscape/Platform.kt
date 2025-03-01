package org.kmp.readscape

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform