package com.yeryigit.foodyapp.home.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HomeFoodItem() {
    Box(
        modifier = Modifier.background(
            color = Color.White,
            shape = RoundedCornerShape(30.dp)
        )
    ) {
        Row {

        }
    }
}

@Preview
@Composable
private fun HomeFoodItemPreview() {
    HomeFoodItem()
}