package com.example.composecourse.composeui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun CoverFlowRow(images: Map<Int, String>) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 32.dp, vertical = 16.dp)
    ) {

        //left card
        CoverFlowItem(
            modifier = Modifier
                .align(Alignment.CenterStart)
                .offset(x = 40.dp),
            resource = images.keys.elementAt(0),
            description = images.values.elementAt(0),
        )

        //right card
        CoverFlowItem(
            modifier = Modifier
                .align(Alignment.CenterEnd)
                .offset(x = (-40).dp),
            resource = images.keys.elementAt(1),
            description = images.values.elementAt(1),
        )

        //center card on top
        CoverFlowItem(
            modifier = Modifier
                .align(Alignment.Center),
            isCenter = true,
            resource = images.keys.elementAt(2),
            description = images.values.elementAt(2),
        )

    }
}

@Composable
fun CoverFlowItem(
    modifier: Modifier,
    isCenter: Boolean = false,
    resource: Int,
    description: String,
    ) {

    Box(
        modifier = modifier
            .size(if (isCenter) 140.dp else 120.dp)
            .background(Color.Gray, RoundedCornerShape(12.dp))
            .border(1.dp, Color(0xfffafafa), RoundedCornerShape(12.dp))
            .clip(RoundedCornerShape(12.dp))
    ) {
        Image(
            painter = painterResource(id = resource),
            contentDescription = description,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
            )
    }
}