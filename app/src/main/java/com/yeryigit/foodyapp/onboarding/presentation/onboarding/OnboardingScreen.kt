package com.yeryigit.foodyapp.onboarding.presentation.onboarding

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yeryigit.foodyapp.R
import com.yeryigit.foodyapp.ui.theme.DmSans
import com.yeryigit.foodyapp.ui.theme.FoodyAppTheme
import com.yeryigit.foodyapp.ui.theme.accentColor
import com.yeryigit.foodyapp.ui.theme.white

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnboardingScreen(modifier: Modifier = Modifier) {
    val onboardingIconList = remember {
        listOf(R.drawable.onboarding_first, R.drawable.onboarding_second, R.drawable.onboarding_three)
    }
    val onboardingTitleList = remember {
        listOf(R.string.onboarding_first_title, R.string.onboarding_second_title, R.string.onboarding_third_title)
    }
    val pagerState = rememberPagerState(pageCount = { 3 })
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(white),
        contentAlignment = Alignment.TopCenter
    ) {
        Column {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    imageVector = ImageVector.vectorResource(R.drawable.ic_foody),
                    contentDescription = "App Icon",
                    modifier = Modifier.size(30.dp)
                )
            }
            Spacer(modifier = Modifier.height(40.dp))
            Text(
                text = stringResource(onboardingTitleList[pagerState.currentPage]),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 40.dp),
                fontFamily = DmSans,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
            )
            Log.i("@@@1","${pagerState.currentPage}")
            Spacer(modifier = Modifier.height(40.dp))
            HorizontalPager(
                state = pagerState
            ) { page ->
                //currentIndex = page
                Log.i("@@@2","$page")
                Box(
                    modifier = Modifier
                        .fillMaxWidth(),
                    contentAlignment = Alignment.Center,
                ) {
                    Image(
                        painter = painterResource(id = onboardingIconList[page]),
                        contentDescription = "Onboarding images",
                        modifier = Modifier.size(335.dp, 255.dp),
                    )
                }
            }
            LazyRow (
                Modifier
                    .wrapContentHeight()
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                items(pagerState.pageCount) { iteration ->
                    val color = if (pagerState.currentPage == iteration) accentColor else Color.LightGray
                    Box(
                        modifier = Modifier
                            .padding(8.dp)
                            .clip(CircleShape)
                            .background(color)
                            .size(6.dp)
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun OnBoardingScreenPreview() {
    FoodyAppTheme {
        OnboardingScreen()
    }
}