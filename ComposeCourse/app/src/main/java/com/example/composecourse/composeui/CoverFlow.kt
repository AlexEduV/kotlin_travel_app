package com.example.composecourse.composeui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CoverFlowRow() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 32.dp, vertical = 16.dp)
    ) {

        //left card
        CoverFlowItem(modifier = Modifier.align(Alignment.CenterStart))

        //right card
        CoverFlowItem(modifier = Modifier.align(Alignment.CenterEnd))

        //center card on top
        CoverFlowItem(modifier = Modifier.align(Alignment.Center))


    }
}

@Composable
fun CoverFlowItem(modifier: Modifier) {

    Box(
        modifier = modifier
            .height(120.dp)
            .width(120.dp)
            .offset(x = (0).dp)
            .background(Color.Gray, RoundedCornerShape(12.dp))
            .border(1.dp, Color(0xfffafafa), RoundedCornerShape(12.dp))
    )
}