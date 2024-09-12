package com.example.composecourse.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.composecourse.screens.ApartmentDetailsScreen
import com.example.composecourse.screens.HomeScreen
import com.example.composecourse.screens.ProfileDetailsScreen

@Composable
fun NavGraph(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = Destinations.Home.route
    ) {
        composable(Destinations.Home.route) { HomeScreen() }
        composable(Destinations.ProfileDetails.route) { ProfileDetailsScreen() }
        composable(Destinations.ApartmentDetails.route) { ApartmentDetailsScreen() }
    }
}
