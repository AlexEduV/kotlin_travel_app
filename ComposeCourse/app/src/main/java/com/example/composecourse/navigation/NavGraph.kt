package com.example.composecourse.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHost
import com.example.composecourse.screens.ApartmentDetailsScreen
import com.example.composecourse.screens.HomeScreen
import com.example.composecourse.screens.ProfileDetailsScreen

@Composable
fun NavGraph(navController: NavController) {
    NavHost(navController = navController, startDestination = Destinations.Home.route) {
        composable(Destinations.Home.route) { HomeScreen(navController) }
        composable(Destinations.ProfileDetails.route) { ProfileDetailsScreen() }
        composable(Destinations.ApartmentDetails.route) { ApartmentDetailsScreen() }
    }
}
