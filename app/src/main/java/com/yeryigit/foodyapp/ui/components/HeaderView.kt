package com.yeryigit.foodyapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.twotone.Face
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.yeryigit.foodyapp.R
import com.yeryigit.foodyapp.ui.theme.black
import com.yeryigit.foodyapp.ui.theme.foodyOrange

@Composable
fun HeaderView(
    firstIcon: ImageVector = ImageVector.vectorResource(R.drawable.ic_menu),
    isHaveAddressArea: Boolean = true,
    secondIcon: ImageVector = Icons.TwoTone.Face,
    paddingHorizontal: Dp = 20.dp,
    paddingTop: Dp = 0.dp
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = paddingHorizontal, end = paddingHorizontal, top = paddingTop),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = firstIcon,
            contentDescription = "menu",
            modifier = Modifier
                .size(40.dp)
                .background(Color.White, shape = RoundedCornerShape(15.dp))
                .padding(10.dp)
        )
        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.weight(1f)) {
            if (isHaveAddressArea) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("Delivery to", textDecoration = TextDecoration.Underline, color = black)
                    Icon(
                        modifier = Modifier.padding(start = 8.dp),
                        imageVector = ImageVector.vectorResource(R.drawable.ic_arrow_down),
                        contentDescription = "down arrow"
                    )
                }
                Text("8.dilek sokak, Ortabağlar", maxLines = 1, overflow = TextOverflow.Ellipsis, color = foodyOrange)
            }
        }
        Icon(
            imageVector = secondIcon,
            contentDescription = "menu",
            modifier = Modifier
                .size(40.dp)
                .background(Color.White, shape = RoundedCornerShape(15.dp))
                .padding(10.dp)
        )
    }
}

@Preview
@Composable
private fun HeaderViewPreview() {
    HeaderView()
}