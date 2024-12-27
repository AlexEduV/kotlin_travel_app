package com.example.composecourse.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.DateRange
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.composecourse.R
import com.example.composecourse.compose.ApartmentLargePhotoItem
import com.example.composecourse.compose.AppBarButton
import com.example.composecourse.compose.BackButton
import com.example.composecourse.compose.ContentText
import com.example.composecourse.compose.HostName
import com.example.composecourse.compose.HostRanking
import com.example.composecourse.compose.SemiCircleShape
import com.example.composecourse.compose.SubTitleText
import com.example.composecourse.ui.theme.actionBlue


@Composable
fun ApartmentDetailsScreen(
    navHostController: NavHostController,
    itemId: Int?
    ) {

    val scrollState = rememberScrollState()

    Column(modifier = Modifier
        .padding(start = 16.dp, end = 16.dp)
        .verticalScroll(scrollState),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(16.dp))

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
            .height(400.dp)
            .padding(horizontal = 16.dp)
        ) {

            Image(
                painter = painterResource(id = itemId as Int),
                contentDescription = "Large Scale Apartment Picture",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()
                    .clip(SemiCircleShape())
            )

            Image(
                painter = painterResource(id = R.drawable.owner_profile_1),
                contentDescription = "Host Picture Centered",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(100.dp)
                    .offset(y = 40.dp)
                    .align(Alignment.BottomCenter)
                    .border(width = 8.dp, Color.White, CircleShape)
                    .padding(5.dp)
                    .clip(CircleShape)
            )

        }

        Spacer(modifier = Modifier.height(44.dp))

        Column(
            verticalArrangement = Arrangement.spacedBy(4.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            ) {

            HostName(name = "Amanda Vespucci")

            HostRanking(ranking = "4.6")
        }

        Spacer(modifier = Modifier.height(10.dp))

        SubTitleText(text = "Welcome to your next stay!")

        Spacer(modifier = Modifier.height(8.dp))

        ContentText(text = "I'm thrilled to have you here and hope you have a wonderful" +
                " experience. If you need anything or have any questions during" +
                " your time with me, please don't hesitate to reach out."
        )

        Spacer(modifier = Modifier.height(32.dp))

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth(),
        ) {
            SubTitleText("Self Check-in Guide")

            SubTitleText("Get Passcode", color = actionBlue)
        }

        Spacer(modifier = Modifier.height(24.dp))

        Column(
            modifier = Modifier.padding(bottom = 16.dp),
            verticalArrangement = Arrangement.spacedBy(24.dp),
            ) {

            ApartmentLargePhotoItem(
                resourceId = R.drawable.apartment_2,
                contentDescription = "Apartment Photo 2"
            )

            ApartmentLargePhotoItem(
                resourceId = R.drawable.apartment_3,
                contentDescription = "Apartment Photo 3"
            )


            ApartmentLargePhotoItem(
                resourceId = R.drawable.apartment_4,
                contentDescription = "Apartment Photo 4"
            )
        }

        //todo: 'Book Now' button

    }

}
