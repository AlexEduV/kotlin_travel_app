package com.example.composecourse.composeui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.composecourse.R

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

@Composable
fun ProfileImage(size: Dp, resourceId: Int) {

    Box(
        modifier = Modifier
            .size(size)
            .clip(CircleShape)
            .background(Color.Gray.copy(alpha = 0.3f))
    ) {
        Image(
            painter = painterResource(id = resourceId),
            contentDescription = "profile picture",
        )
    }
}