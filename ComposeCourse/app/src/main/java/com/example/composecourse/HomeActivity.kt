package com.example.composecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composecourse.composeui.BackButton
import com.example.composecourse.composeui.CardSubtitle
import com.example.composecourse.composeui.HostCard

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

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

                    BackButton()

                    HostCard()

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
                                tint = Color.White,
                                modifier = Modifier.size(15.dp)
                            )

                            Text(
                                "Mostar, Bosnia",
                                color = Color.White,
                                fontSize = 15.sp,
                            )
                        }

                        //search selector here
                        


                    }

                }
            }

        }
    }
}
