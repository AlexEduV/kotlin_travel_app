package com.example.composecourse.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composecourse.ui.theme.secondaryGreen

@Composable
fun StatsElement(value: String, title: String) {

    Column {

        Text(
            value,
            fontSize = 22.sp,
            fontWeight = FontWeight.ExtraBold,
            color = secondaryGreen
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            title.uppercase(),
            fontSize = 12.sp,
            color = Color.Gray,
            fontWeight = FontWeight.W500,
        )

    }
}