package com.yeryigit.foodyapp.onboarding.presentation.onboarding

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
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
import com.yeryigit.foodyapp.ui.theme.SkModernist
import com.yeryigit.foodyapp.ui.theme.accentColor
import com.yeryigit.foodyapp.ui.theme.gradientBrush
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
                    .padding(horizontal = 10.dp),
                fontFamily = DmSans,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
            )
            Spacer(modifier = Modifier.height(40.dp))
            HorizontalPager(
                state = pagerState
            ) { page ->
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
            Spacer(modifier = Modifier.height(20.dp))
            LazyRow(
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
            Spacer(modifier = Modifier.height(40.dp))
            Button(
                onClick = { Log.e("@@@", "create buton tıklandı") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                contentPadding = PaddingValues(),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
            ) {
                Box(
                    modifier = Modifier
                        .height(50.dp)
                        .fillMaxWidth()
                        .background(
                            brush = gradientBrush,
                            shape = RoundedCornerShape(20.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Create an account",
                        fontFamily = SkModernist,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp
                    )
                }

            }
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = { Log.e("@@@", "login buton tıklandı") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                contentPadding = PaddingValues(),
            ) {
                Text(
                    text = "login",
                    fontFamily = SkModernist,
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                    color = Color.Red
                )
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