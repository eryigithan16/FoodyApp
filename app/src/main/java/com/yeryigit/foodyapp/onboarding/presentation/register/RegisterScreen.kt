package com.yeryigit.foodyapp.onboarding.presentation.register

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yeryigit.foodyapp.R
import com.yeryigit.foodyapp.ui.components.CustomTextField
import com.yeryigit.foodyapp.ui.theme.DmSans
import com.yeryigit.foodyapp.ui.theme.SkModernist
import com.yeryigit.foodyapp.ui.theme.white

@Composable
fun RegisterScreen() {
    val emailTextState = remember { mutableStateOf("") }
    val passwordTextState = remember { mutableStateOf("") }
    val confirmPasswordTextState = remember { mutableStateOf("") }
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
                modifier = Modifier, text = "Create an account", fontFamily = DmSans, fontWeight = FontWeight.Bold, fontSize = 24.sp
            )
            Spacer(modifier = Modifier.height(50.dp))
            Text(
                modifier = Modifier,
                text = "Welcome friend, enter your details so lets get started in ordering food.",
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
            Spacer(modifier = Modifier.height(20.dp))
            CustomTextField(title = "Confirm Password", placeHolder = "Confirm Password", textState = confirmPasswordTextState)
        }
    }
}

@Preview
@Composable
private fun PreviewRegisterScreen() {
    RegisterScreen()
}