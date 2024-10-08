package com.example.composecourse.navigation

import androidx.navigation.NavController

fun NavController.navigateToProfileDetails() {
    navigate(Destinations.ProfileDetails.route)
}

fun NavController.navigateToApartmentDetails(resourceId: Int) {
    navigate("${Destinations.ApartmentDetails.route}/$resourceId")
}