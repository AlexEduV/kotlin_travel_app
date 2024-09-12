package com.example.composecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.sharp.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composecourse.composeui.CardContent
import com.example.composecourse.composeui.CardSubtitle
import com.example.composecourse.composeui.CoverFlowRow
import com.example.composecourse.composeui.CustomCard
import com.example.composecourse.composeui.StatsElement

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val scrollState = rememberScrollState()

            Column(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .verticalScroll(scrollState)
            ) {

                Spacer(modifier = Modifier.height(16.dp))
                
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.KeyboardArrowLeft,
                    contentDescription = "Back",
                )

                Spacer(modifier = Modifier.height(24.dp))
                
                Row {

                    Column(modifier = Modifier.weight(1f)) {

                        Text(
                            "Stay Memories",
                            fontWeight = FontWeight.W600,
                            fontSize = 22.sp,
                            color = Color(0xff1d404c),
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            "Explore your past adventures and relive your favorite moments. " +
                                    "View details of all your previous stays.",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.W500,
                            lineHeight = 22.sp,
                            color = Color.Gray.copy(alpha = 0.9f)
                        )

                        Spacer(modifier = Modifier.height(32.dp))

                        Row(
                            horizontalArrangement = Arrangement.SpaceBetween,
                            modifier = Modifier.fillMaxWidth(),
                        ) {

                            StatsElement(value = "32", title = "Countries")

                            StatsElement(value = "168", title = "All Stays")

                            StatsElement(value = "29.5k", title = "Credits")

                        }

                        Spacer(modifier = Modifier.height(32.dp))

                        Row {

                            Text(
                                "Recent Stays • 8",
                                fontWeight = FontWeight.W500,
                                fontSize = 16.sp,
                                color = Color.Gray,
                            )
                        }

                    }

                    Spacer(modifier = Modifier.width(32.dp))

                    Box(
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape)
                            .background(Color.Gray.copy(alpha = 0.3f))
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                CustomCard(
                    title = "Chalet Le Vallon Royal & Spa",
                    location = "Quebec, Canada",
                    datesStayed = "Aug.05-08, 2024",
                    content = "Comfort and well-being are in perfect harmony with nature. " +
                            "This new chalet, located in the most picturesque corner of the municipality of Quebec, " +
                            "offers a unique blend of rustic charm and modern luxury. Nestled amidst lush forests and serene " +
                            "lakes, it provides an idyllic retreat from the hustle and bustle of city life. With expansive" +
                            " windows that frame breathtaking views, a spacious interior designed for relaxation and entertaining," +
                            " and high-end amenities to cater to every need, this chalet is more than just a home" +
                            " — it's a sanctuary where tranquility meets elegance. Whether you seek a peaceful escape" +
                            " or a base for outdoor adventures, this chalet promises an unparalleled experience in the heart" +
                            " of nature’s beauty."
                )

                Spacer(modifier = Modifier.height(16.dp))

                CustomCard(
                    title = "Entire chalet in Chertsy",
                    location = "Oslo, Norway",
                    datesStayed = "Jan.14-16, 2024",
                    content = "Relax with family and friends at this peaceful chalet in Chertsy," +
                            " just outside the vibrant city of Oslo, Norway. Surrounded by breathtaking" +
                            " fjords, lush forests, and tranquil lakes, this idyllic retreat blends" +
                            " the serenity of nature with the charm of Scandinavian living." +
                            " Whether you’re sipping coffee on the terrace, exploring nearby " +
                            "hiking trails, or cozying up by the fireplace after a day of" +
                            " adventure, this chalet offers the perfect balance of comfort and wilderness." +
                            " With spacious rooms, modern amenities, and stunning views at every turn," +
                            " it's an ideal haven to unwind, recharge, and experience the natural" +
                            " beauty of Norway. Escape the city buzz, yet remain just a short" +
                            " drive away from Oslo's rich cultural scene and historical landmarks," +
                            " making it a perfect mix of relaxation and exploration."
                )

                Spacer(modifier = Modifier.height(32.dp))
            }
        }
    }

}
