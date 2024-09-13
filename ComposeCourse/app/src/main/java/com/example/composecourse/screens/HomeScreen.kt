package com.example.composecourse.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.composecourse.R
import com.example.composecourse.compose.BackButton
import com.example.composecourse.compose.HostCard
import com.example.composecourse.compose.LocationMarker
import com.example.composecourse.compose.SearchSelector

@Composable
fun HomeScreen(navHostController: NavHostController) {

    var isCardShown by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {

        Image(
            painter = painterResource(id = R.drawable.bosnia_cover),
            contentDescription = "Bosnia Cover Photo",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Column(
            modifier = Modifier
                .padding(all = 16.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            BackButton(
                onClick = {}
            )

            if (isCardShown) {
                HostCard(navController = navHostController)
            }

            Spacer(modifier = Modifier.weight(1f))

            Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {

                Text(
                    "Searching Results".uppercase(),
                    color = Color.White,
                    fontSize = 16.sp,
                )

                Text(
                    "Hotels & Apartments",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.W600,
                )

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {

                    Icon(
                        imageVector = Icons.Filled.LocationOn,
                        contentDescription = "location marker",
                        tint = Color.White.copy(alpha = 0.85f),
                        modifier = Modifier.size(15.dp)
                    )

                    Text(
                        "Mostar, Bosnia",
                        color = Color.White.copy(alpha = 0.85f),
                        fontSize = 15.sp,
                    )
                }

                SearchSelector()

            }

        }

        LocationMarker(
            onClick = { isCardShown = true },
            isProfileImageShown = !isCardShown
        )
    }

}
