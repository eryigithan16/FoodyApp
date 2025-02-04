package com.yeryigit.foodyapp.onboarding.presentation.forgotpassword

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yeryigit.foodyapp.R
import com.yeryigit.foodyapp.ui.components.CustomTextField
import com.yeryigit.foodyapp.ui.theme.DmSans
import com.yeryigit.foodyapp.ui.theme.SkModernist
import com.yeryigit.foodyapp.ui.theme.gradientBrush
import com.yeryigit.foodyapp.ui.theme.white

@Composable
fun ForgetPasswordScreen(){
    val emailTextState = remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(white), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(15.dp))
        Image(
            imageVector = ImageVector.vectorResource(R.drawable.ic_foody), contentDescription = "App Icon", modifier = Modifier.size(30.dp)
        )
        Spacer(modifier = Modifier.height(60.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 50.dp, end = 35.dp)
        ) {
            Text(
                modifier = Modifier, text = "Forgot password", fontFamily = DmSans, fontWeight = FontWeight.Bold, fontSize = 24.sp
            )
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = "Enter your email address to request a password reset.",
                fontFamily = SkModernist,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp
            )
            Spacer(modifier = Modifier.height(50.dp))
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        ) {
            CustomTextField(title = "Email Address", placeHolder = "Enter email", textState = emailTextState)
        }
        Spacer(modifier = Modifier.height(50.dp))
        Button(
            onClick = { Log.e("@@@", "create buton tıklandı") },
            modifier = Modifier.padding(horizontal = 20.dp),
            contentPadding = PaddingValues(),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
        ) {
            Box(
                modifier = Modifier
                    .height(50.dp)
                    .fillMaxWidth()
                    .background(
                        brush = gradientBrush, shape = RoundedCornerShape(20.dp)
                    ), contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Send Reset Code To Email", fontFamily = SkModernist, fontWeight = FontWeight.Bold, fontSize = 14.sp
                )
            }

        }
    }
}

@Preview
@Composable
private fun ForgotPasswordScreenPreview() {
    ForgetPasswordScreen()
}