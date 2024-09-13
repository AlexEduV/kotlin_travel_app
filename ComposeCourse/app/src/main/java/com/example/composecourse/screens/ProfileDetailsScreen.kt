package com.example.composecourse.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.composecourse.R
import com.example.composecourse.compose.AppBarButton
import com.example.composecourse.compose.BackButton
import com.example.composecourse.compose.ContentText
import com.example.composecourse.compose.CustomCard
import com.example.composecourse.compose.ProfileImage
import com.example.composecourse.compose.StatsElement
import com.example.composecourse.compose.SubTitleText
import com.example.composecourse.ui.theme.coralGreen

@Composable
fun ProfileDetailsScreen(navHostController: NavHostController) {

    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .verticalScroll(scrollState)
    ) {

        Spacer(modifier = Modifier.height(16.dp))

        BackButton(
            onClick = {}
        )

        Spacer(modifier = Modifier.height(24.dp))

        Row {

            Column(modifier = Modifier.weight(1f)) {

                Text(
                    "Stay Memories",
                    fontWeight = FontWeight.W600,
                    fontSize = 22.sp,
                    color = coralGreen,
                )

                Spacer(modifier = Modifier.height(8.dp))

                ContentText(
                    text = "Explore your past adventures and relive your" +
                            " favorite moments. View details of all " +
                            "your previous stays.",
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

                SubTitleText(text = "Recent Stays  •  8")

            }

            Spacer(modifier = Modifier.width(32.dp))

            ProfileImage(
                size = 50.dp,
                resourceId = R.drawable.profile_picture,
                modifier = Modifier,
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
                    " of nature’s beauty.",
            backgroundColor = Color.White,
            images = mapOf(
                R.drawable.canada_1 to "Canada 1",
                R.drawable.canada_3 to "Canada 2",
                R.drawable.canada_2 to "Canada 3",
            )
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
                    " making it a perfect mix of relaxation and exploration.",
            backgroundColor = Color(0xffecfafc),
            images = mapOf(
                R.drawable.norway_1 to "Norway 1",
                R.drawable.norway_2 to "Norway 2",
                R.drawable.norway_3 to "Norway 3",
            )

        )

        Spacer(modifier = Modifier.height(32.dp))
    }
}