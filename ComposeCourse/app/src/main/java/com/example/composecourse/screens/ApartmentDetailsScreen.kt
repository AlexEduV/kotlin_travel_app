package com.example.composecourse.screens

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.DateRange
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.composecourse.compose.AppBarButton
import com.example.composecourse.compose.BackButton


@Composable
fun ApartmentDetailsScreen(
    navHostController: NavHostController,
    itemId: Int?
    ) {

    Column(modifier = Modifier
        .padding(all = 16.dp)
        .fillMaxHeight()
    ) {

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
            ) {

            BackButton(
                onClick = { navHostController.popBackStack() }
            )
            
            AppBarButton(
                imageVector = Icons.Rounded.DateRange,
                contentDescription = "Date Picker",
                onClick = {}
            )

        }

        Spacer(modifier = Modifier.height(16.dp))

        Box(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.7f)
            .clip(SemicircleShape())
        ) {

            Image(
                painter = painterResource(id = itemId as Int),
                contentDescription = "Large Scale Apartment Picture",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize(),

            )

        }
        
        
        
        

    }

}

class SemicircleShape : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        return Outline.Generic(
            Path().apply {
                moveTo(0f, size.height/ 2)
                arcTo(
                    rect = Rect(0f, -size.height / 2, size.width, size.height / 2),
                    startAngleDegrees = 180f,
                    sweepAngleDegrees = 180f,
                    forceMoveTo = false
                )
                lineTo(size.width, size.height)
                lineTo(0f, size.height)
                close()
            }
        )
    }

}