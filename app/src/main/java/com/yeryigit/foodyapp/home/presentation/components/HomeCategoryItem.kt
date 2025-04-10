package com.yeryigit.foodyapp.home.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HomeCategoryItem(isSelected: Boolean) { //Buraya parametre olarak "CategoryData" gibi bir şey vercez. hangi klasöre olduğuna karar veririz sonra. içinde icon, title, iç renk, dış renk olcak
    Box(
        modifier = Modifier
            .border(
                width = 1.dp,
                color = if (isSelected) Color(0xFFFF5722) else Color(0xFFF0CAC1),
                shape = RoundedCornerShape(50.dp)
            )
            .padding(5.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .clip(shape = RoundedCornerShape(50.dp))
                .background(color = if (isSelected) Color(0x33F0CAC1) else Color(0x1AF0CAC1))
                .padding(top = 15.dp, bottom = 15.dp, start = 12.dp, end = 12.dp)
        ) {
            Icon(
                modifier = Modifier.size(25.dp),
                imageVector = Icons.Default.Favorite, contentDescription = ""
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text("Pizza")
        }
    }
}

@Preview
@Composable
private fun HomeCategoryItemPreview() {
    HomeCategoryItem(true)
}