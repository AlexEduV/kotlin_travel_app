package com.example.composecourse.composeui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composecourse.R

@Composable
fun HostCard() {

    Column {

        //host info row
        Row(
            modifier = Modifier
                .background(
                    Color.White.copy(alpha = 0.9f),
                    RoundedCornerShape(12.dp)
                )
                .padding(all = 16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            ProfileImage(size = 60.dp, resourceId = R.drawable.owner_profile_1)

            HostInfoColumn("Amanda Vespucci", 4)

        }

        //apartments scroll view
        Row {
            
        }


    }
}

@Composable
fun HostInfoColumn(
    name: String,
    apartments: Int,
    ) {

    Column {

        Text(
            name,
            fontSize = 16.sp,
            fontWeight = FontWeight.W600,
            lineHeight = 22.sp,
            color = coralGreen
        )

        Spacer(Modifier.height(2.dp))

        Text(
            "$apartments Apartments  • Verified Host",
            fontWeight = FontWeight.W400,
            lineHeight = 22.sp,
        )

    }
}