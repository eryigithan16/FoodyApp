package com.yeryigit.foodyapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.yeryigit.foodyapp.R

// Set of Material typography styles to start with
val DmSans = FontFamily(
    Font(
        resId = R.font.dm_sans_bold,
        weight = FontWeight.Bold
    )
)
val SkModernist = FontFamily(
    Font(
        resId = R.font.sk_modernist_regular,
        weight = FontWeight.Normal
    ),
    Font(
        resId = R.font.sk_modernist_bold,
        weight = FontWeight.Bold
    )
)

val Typography = Typography(
    bodySmall = TextStyle(
        fontFamily = SkModernist,
        fontWeight = FontWeight.Light,
        fontSize = 12.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily = SkModernist,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = SkModernist,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    labelMedium = TextStyle(
        fontFamily = SkModernist,
        fontWeight = FontWeight.Normal,
    ),
    headlineMedium = TextStyle(
        fontFamily = SkModernist,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp
    )
)