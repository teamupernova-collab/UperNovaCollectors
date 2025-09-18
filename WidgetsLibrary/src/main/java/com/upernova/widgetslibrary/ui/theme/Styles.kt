package com.upernova.widgetslibrary.ui.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.upernova.widgetslibrary.R


val robotoFontFamily = FontFamily(
    Font(R.font.roboto_regular, FontWeight.Companion.Normal),
    Font(R.font.roboto_bold, FontWeight.Companion.Bold),
    Font(R.font.roboto_light, FontWeight.Companion.Light),
    Font(R.font.roboto_medium, FontWeight.Companion.Medium)
)


object Styles {
    val textStyleRobotoMediumSp20 = TextStyle(
        fontSize = 20.sp,
        lineHeight = 24.sp,
        fontFamily = robotoFontFamily,
        fontWeight = FontWeight.Medium
    )
}