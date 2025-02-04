package com.yeryigit.foodyapp.onboarding.presentation.login

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
fun LoginScreen(
    onClickSignInWithGoogle: () -> Unit,
    onClickLogin: () -> Unit,
    onClickForgotMyPassword: () -> Unit
) {
    val emailTextState = remember { mutableStateOf("") }
    val passwordTextState = remember { mutableStateOf("") }
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
                modifier = Modifier, text = "Login to your account", fontFamily = DmSans, fontWeight = FontWeight.Bold, fontSize = 24.sp
            )
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = "Good to see you again, enter your details below to continue ordering.",
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
            Spacer(modifier = Modifier.height(20.dp))
            CustomTextField(title = "Password", placeHolder = "Enter password", textState = passwordTextState)
        }
        Column(
            verticalArrangement = Arrangement.Bottom, modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 25.dp)
        ) {
            Button(
                onClick = onClickSignInWithGoogle,
                modifier = Modifier.padding(horizontal = 80.dp),
                contentPadding = PaddingValues(),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
            ) {
                Row(
                    modifier = Modifier
                        .height(50.dp)
                        .fillMaxWidth()
                        .background(
                            color = Color.White, shape = RoundedCornerShape(20.dp)
                        ), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(R.drawable.ic_google), contentDescription = "Google Icon", modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "Sign-in with Google",
                        fontFamily = SkModernist,
                        fontWeight = FontWeight.Normal,
                        fontSize = 14.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        textDecoration = TextDecoration.Underline
                    )
                }

            }
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = onClickLogin,
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
                        text = "Log In", fontFamily = SkModernist, fontWeight = FontWeight.Bold, fontSize = 14.sp
                    )
                }

            }
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = onClickForgotMyPassword,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                contentPadding = PaddingValues(),
            ) {
                Text(
                    text = "I forgot my password", fontFamily = SkModernist, fontWeight = FontWeight.Bold, fontSize = 14.sp, color = Color.Red
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewLoginScreen(modifier: Modifier = Modifier) {
    LoginScreen(
        onClickSignInWithGoogle = {},
        onClickLogin = {},
        onClickForgotMyPassword = {}
    )
}