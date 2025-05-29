package com.yeryigit.foodyapp.home.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yeryigit.foodyapp.home.presentation.components.HomeCategoryItem
import com.yeryigit.foodyapp.ui.components.HeaderView
import com.yeryigit.foodyapp.ui.theme.DmSans
import com.yeryigit.foodyapp.ui.theme.SkModernist
import com.yeryigit.foodyapp.ui.theme.gray
import com.yeryigit.foodyapp.ui.theme.foodyOrange
import com.yeryigit.foodyapp.ui.theme.white

@Composable
fun HomeScreen() {
    val list = listOf("true", "false", "false", "false", "false", "false", "false", "false", "false")
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(white),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HeaderView()
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(white)
                .verticalScroll(state = rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Enjoy Delicious food",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, top = 40.dp),
                fontFamily = DmSans,
                fontWeight = FontWeight.Bold,
                color = gray,
                fontSize = 24.sp
            )
            LazyRow(
                modifier = Modifier
                    .padding(start = 20.dp, top = 50.dp)
                    .align(Alignment.Start),
                horizontalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                items(list) {
                    HomeCategoryItem(it == "true")
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp, top = 40.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Popular restaurants",
                    fontFamily = DmSans,
                    fontWeight = FontWeight.Bold,
                    color = gray,
                    fontSize = 16.sp
                )
                Text(
                    text = "View all(29)",
                    fontFamily = SkModernist,
                    fontWeight = FontWeight.Normal,
                    color = foodyOrange,
                    fontSize = 14.sp,
                    textDecoration = TextDecoration.Underline
                )
            }
        }
    }
}

@Preview
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}