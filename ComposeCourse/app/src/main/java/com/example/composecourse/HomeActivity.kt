package com.example.composecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
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
import com.example.composecourse.composeui.ProfileImage

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

                        ProfileImage(size = 60.dp, resourceId = R.drawable.profile_picture)

                        Column {

                            Text(
                                "Haruka Takahashi",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.W600,
                                lineHeight = 22.sp,
                            )

                            Spacer(Modifier.height(2.dp))

                            Text(
                                "4 Apartments  •  Verified Host",
                                fontWeight = FontWeight.W400,
                                lineHeight = 22.sp,
                            )

                        }

                    }

                }
            }

        }
    }
}
