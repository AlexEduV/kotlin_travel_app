package com.example.composecourse.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.composecourse.R
import com.example.composecourse.navigation.navigateToApartmentDetails

@Composable
fun HostCard(navHostController: NavHostController) {

    val photoScrollState = rememberScrollState()

    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier
            .background(
                Color.White.copy(alpha = 0.9f),
                RoundedCornerShape(12.dp)
            )
            .padding(vertical = 24.dp, horizontal = 16.dp)
            .fillMaxWidth(),
    ) {

        //host info row
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            ProfileImage(
                size = 60.dp,
                resourceId = R.drawable.owner_profile_1,
                modifier = Modifier,
                isVerified = true
            )

            HostInfoColumn("Amanda Vespucci", 4)

        }

        //apartments scroll view
        Row(
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            modifier = Modifier
                .horizontalScroll(photoScrollState)
        ) {

            ApartmentPhotoItem(R.drawable.apartment_1) {
                navHostController.navigateToApartmentDetails(R.drawable.apartment_1)
            }

            ApartmentPhotoItem(R.drawable.apartment_2) {
                navHostController.navigateToApartmentDetails(R.drawable.apartment_2)
            }

            ApartmentPhotoItem(R.drawable.apartment_3) {
                navHostController.navigateToApartmentDetails(R.drawable.apartment_3)
            }

            ApartmentPhotoItem(R.drawable.apartment_4) {
                navHostController.navigateToApartmentDetails(R.drawable.apartment_4)
            }

        }


    }
}

@Composable
fun HostInfoColumn(
    name: String,
    apartments: Int,
    ) {

    Column {

        HostName(
            name = name
        )

        Spacer(Modifier.height(2.dp))

        Text(
            "$apartments Apartments",
            fontWeight = FontWeight.W400,
            lineHeight = 22.sp,
        )

    }
}

@Composable
fun HostName(name: String) {

    Text(
        name,
        fontSize = 16.sp,
        fontWeight = FontWeight.W600,
        lineHeight = 22.sp,
        color = coralGreen
    )
}

@Composable
fun HostRanking(
    ranking: String,
    color: Color = secondaryGreen
) {

    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(
            imageVector = Icons.Filled.Star,
            "Star Icon",
            tint = color,
            modifier = Modifier.size(18.dp)
        )

        Text(ranking,
            color = color,
            fontWeight = FontWeight.W600,
            fontSize = 16.sp
        )
    }
}

@Composable
fun ApartmentPhotoItem(resourceId: Int, onClick: () -> Unit) {

    Box(modifier = Modifier
        .height(60.dp)
        .width(100.dp)
        .clip(RoundedCornerShape(4.dp))
        .clickable(onClick = { onClick() })
        .background(Color.Gray.copy(alpha = 0.9f)),

    ) {
        Image(
            painter = painterResource(id = resourceId),
            contentDescription = "Apartment Image",
            modifier = Modifier
                .clip(RoundedCornerShape(4.dp))
                .fillMaxSize(),
            contentScale = ContentScale.Crop,
        )
    }
}