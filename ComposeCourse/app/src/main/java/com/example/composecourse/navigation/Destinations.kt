package com.example.composecourse.navigation

sealed class Destinations(val route: String) {
    object Home : Destinations("home")
    object ProfileDetails : Destinations("profileDetails")
    object ApartmentDetails : Destinations("apartmentDetails")
}