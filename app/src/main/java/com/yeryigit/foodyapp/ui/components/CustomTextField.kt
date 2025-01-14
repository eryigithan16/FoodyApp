package com.yeryigit.foodyapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yeryigit.foodyapp.ui.theme.SkModernist
import com.yeryigit.foodyapp.ui.theme.lightGray
import com.yeryigit.foodyapp.ui.theme.placeHolderColor
import com.yeryigit.foodyapp.ui.theme.softBlack

@Composable
fun CustomTextField(title: String, placeHolder: String, textState: MutableState<String>) {
    Text(
        modifier = Modifier.padding(start = 20.dp, bottom = 10.dp),
        text = title,
        fontFamily = SkModernist,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    TextField(
        value = textState.value,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White, shape = RoundedCornerShape(15.dp))
            .border(
                width = 1.dp,
                color = lightGray,
                shape = RoundedCornerShape(15.dp)
            ),
        colors = TextFieldDefaults.colors(
            focusedTextColor = softBlack,
            unfocusedTextColor = softBlack,
            focusedContainerColor = Color.Transparent,
            unfocusedContainerColor = Color.Transparent,
            disabledContainerColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
            cursorColor = softBlack,
            focusedPlaceholderColor = placeHolderColor,
            unfocusedPlaceholderColor = placeHolderColor

        ),
        placeholder = {
            Text(
                text = placeHolder,
                fontFamily = SkModernist,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
                modifier = Modifier.padding(start = 5.dp)
            )
        },
        onValueChange = {
            textState.value = it
        }
    )
}

@Preview
@Composable
private fun PreviewCustomTextField() {
    CustomTextField(
        "",
        "",
        textState = remember { mutableStateOf("") }
    )
}