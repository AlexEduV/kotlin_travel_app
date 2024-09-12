package com.example.composecourse.composeui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BackButton() {

    Box(
        modifier = Modifier
            .background(Color.White.copy(alpha = 0.9f), shape = CircleShape)
            .padding(all = 8.dp)
    ) {

        Icon(
            imageVector = Icons.AutoMirrored.Filled.KeyboardArrowLeft,
            contentDescription = "Back",
        )
    }

}