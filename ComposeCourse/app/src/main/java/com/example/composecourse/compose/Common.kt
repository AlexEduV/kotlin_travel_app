package com.example.composecourse.compose

import android.content.ClipDescription
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.max
import androidx.compose.ui.unit.sp
import com.example.composecourse.R
import org.w3c.dom.Text

@Composable
fun AppBarButton(imageVector: ImageVector, contentDescription: String, onClick: () -> Unit) {

    Box(
        modifier = Modifier
            .clip(CircleShape)
            .clickable { onClick() }
            .background(Color.White.copy(alpha = 0.9f))
            .padding(all = 8.dp)
    ) {

        Icon(
            imageVector = imageVector,
            contentDescription = contentDescription,
        )
    }

}

@Composable
fun BackButton(onClick: () -> Unit) {

    AppBarButton(
        imageVector = Icons.AutoMirrored.Filled.KeyboardArrowLeft,
        contentDescription = "Back",
        onClick = onClick
    )
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

@Composable
fun ContentText(
    text: String,
    fontSize: TextUnit = 15.sp,
    lineHeight: TextUnit = 22.sp,
    maxLines: Int = Int.MAX_VALUE,
    textOverflow: TextOverflow = TextOverflow.Ellipsis
) {
    Text(
        text,
        fontSize = fontSize,
        fontWeight = FontWeight.W500,
        lineHeight = lineHeight,
        color = Color.Gray.copy(alpha = 0.9f),
        maxLines = maxLines,
        overflow = textOverflow
    )
}

@Composable
fun SubTitleText(text: String, color: Color = Color.Gray) {

    Text(
        text,
        fontWeight = FontWeight.W600,
        fontSize = 15.sp,
        color = color,
    )
}