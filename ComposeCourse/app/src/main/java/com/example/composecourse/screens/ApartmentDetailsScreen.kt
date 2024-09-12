package com.example.composecourse.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.DateRange
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.composecourse.compose.AppBarButton
import com.example.composecourse.compose.BackButton


@Composable
fun ApartmentDetailsScreen(
    navHostController: NavHostController,
    itemId: Int?
    ) {

    Column(modifier = Modifier.padding(all = 16.dp)) {

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
            ) {

            BackButton()
            
            AppBarButton(imageVector = Icons.Rounded.DateRange, contentDescription = "Date Picker")

        }

        Box {
            
        }
        
        
        
        

    }

}