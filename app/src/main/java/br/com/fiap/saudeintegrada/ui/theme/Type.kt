package br.com.fiap.saudeintegrada.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import br.com.fiap.saudeintegrada.R


val InterBlack = FontFamily(Font(R.font.inter_black))
val InterBold = FontFamily(Font(R.font.inter_bold))
val InterExtraBold = FontFamily(Font(R.font.inter_extra_bold))
val InterExtraLight = FontFamily(Font(R.font.inter_extra_light))
val InterLight = FontFamily(Font(R.font.inter_light))
val InterMedium = FontFamily(Font(R.font.inter_medium))
val InterRegular = FontFamily(Font(R.font.inter_regular))
val InterSemiBold= FontFamily(Font(R.font.inter_semi_bold))
val InterThin = FontFamily(Font(R.font.inter_thin))

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)