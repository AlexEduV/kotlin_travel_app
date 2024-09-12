package com.example.composecourse.compose

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composecourse.R

@Composable
fun CustomCard(
    title: String,
    location: String,
    datesStayed: String,
    content: String,
    backgroundColor: Color,
    images: Map<Int, String>
    ) {

    Card(
        colors = CardDefaults.cardColors()
            .copy(containerColor = backgroundColor),
        modifier = Modifier
            .graphicsLayer(
                shadowElevation = 10.0f,
                shape = RoundedCornerShape(16.dp),
                clip = true,
            )

    )
    {

        Column(
            verticalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier.padding(all = 16.dp)
        ) {

            Text(
                title,
                fontWeight = FontWeight.W600,
                fontSize = 16.sp,
                color = coralGreen
            )

            Row(verticalAlignment = Alignment.CenterVertically) {

                Icon(
                    imageVector = Icons.Filled.LocationOn,
                    contentDescription = "location marker",
                    tint = Color.Gray,
                    modifier = Modifier.size(20.dp)
                )

                CardSubtitle(value = location)

                Spacer(modifier = Modifier.weight(1f))

                CardSubtitle(value = datesStayed)

            }

            CardContent(
                value = content
            )

            //stack here
            CoverFlowRow(images = images)

            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier.height(45.dp)) {

                val buttonColor = Color(0xff576da5)

                Button(
                    onClick = {},
                    shape = CircleShape,
                    modifier = Modifier.weight(1f),
                    colors = ButtonDefaults.buttonColors().copy(containerColor = buttonColor)
                ) {
                    Text("Schedule Again")
                }

                Button(
                    onClick = {},
                    shape = CircleShape,
                    border = BorderStroke(width = 1.dp, color = buttonColor),
                    colors = ButtonDefaults.buttonColors().copy(
                        containerColor = backgroundColor,
                        contentColor = buttonColor,
                        ),
                    modifier = Modifier
                        .fillMaxHeight()
                        .aspectRatio(1f),
                    contentPadding = PaddingValues(12.dp)
                ) {
                    Image(
                        painter = painterResource(
                            id = R.drawable.forward_arrow_100),
                            contentDescription = "Forward Icon",
                            colorFilter = ColorFilter.tint(buttonColor)
                    )
                }

            }



        }
    }
}

@Composable
fun CardSubtitle(value: String, fontSize: TextUnit = 16.sp) {

    Text(
        value,
        color = Color.Gray,
        fontSize = fontSize,
    )

}

@Composable
fun CardContent(value: String, fontSize: TextUnit = 15.sp) {

    Text(
        value,
        color = Color.Gray,
        fontSize = fontSize,
        maxLines = 3,
        overflow = TextOverflow.Ellipsis,
        lineHeight = 20.sp,
        fontWeight = FontWeight.W500,
    )

}