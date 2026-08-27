package com.jummania

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform

//@Composable
//expect fun getFont(symbolStyle: SymbolStyle): Font