package com.jummania

import com.jummania.utils.SymbolStyle
import jummaniachessgamecompose.shared.generated.resources.Res
import jummaniachessgamecompose.shared.generated.resources.chess_alpha
import jummaniachessgamecompose.shared.generated.resources.chess_merida_unicode
import jummaniachessgamecompose.shared.generated.resources.symbola
import org.jetbrains.compose.resources.Font

@androidx.compose.runtime.Composable
actual fun getFont(symbolStyle: SymbolStyle): androidx.compose.ui.text.font.Font {
    return when (symbolStyle) {
        SymbolStyle.CLASSIC -> Font(Res.font.chess_alpha)
        SymbolStyle.MERIDA -> Font(Res.font.chess_merida_unicode)
        else -> Font(Res.font.symbola)
    }
}