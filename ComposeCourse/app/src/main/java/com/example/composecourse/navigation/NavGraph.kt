package com.example.composecourse.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.composecourse.screens.ApartmentDetailsScreen
import com.example.composecourse.screens.HomeScreen
import com.example.composecourse.screens.ProfileDetailsScreen
import com.example.composecourse.ui.theme.ComposeCourseTheme

@Composable
fun NavGraph(navController: NavHostController) {

    ComposeCourseTheme {

        NavHost(
            navController = navController,
            startDestination = Destinations.Home.route
        ) {
            composable(Destinations.Home.route) { HomeScreen(navController) }
            composable(Destinations.ProfileDetails.route) { ProfileDetailsScreen(navController) }
            composable(
                route = "${Destinations.ApartmentDetails.route}/{itemId}",
                arguments = listOf(navArgument("itemId") { type = NavType.IntType })
            ) { backStackEntry ->

                val itemId = backStackEntry.arguments?.getInt("itemId")
                ApartmentDetailsScreen(navController, itemId = itemId)
            }
        }
    }
}
