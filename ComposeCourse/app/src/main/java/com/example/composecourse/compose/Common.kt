package com.example.composecourse.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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
fun ProfileImage(
    size: Dp,
    resourceId: Int,
    modifier: Modifier,
    isVerified: Boolean = false,
) {

    Box(
        modifier = modifier
            .size(size),
        contentAlignment = Alignment.BottomEnd,

    ) {
        Image(
            painter = painterResource(id = resourceId),
            contentDescription = "profile picture",
            modifier = Modifier
                .fillMaxSize()
                .clip(CircleShape),
            contentScale = ContentScale.Crop,
        )

        if (isVerified) {
            Image(
                painter = painterResource(id = R.drawable.verified_100),
                contentDescription = "Verified Badge",
                modifier = Modifier
                    .size(24.dp)
            )
        }
    }
}

val coralGreen: Color = Color(0xff1d404c)