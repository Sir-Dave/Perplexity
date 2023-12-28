package com.sirdave.perplexity.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.sirdave.perplexity.presentation.screens.onboarding.*

@Composable
fun Navigation(
    navHostController: NavHostController,
    modifier: Modifier = Modifier
){

    NavHost(
        navController = navHostController,
        startDestination = Screen.MainOnBoardingScreen.route,
        modifier = modifier
    ){
        navigation(
            route =  Screen.MainOnBoardingScreen.route,
            startDestination = Screen.OnBoardingScreen.route,
        ){
            composable(Screen.OnBoardingScreen.route) {
                OnBoardingHomeScreen(
                    onNavigateToLoginScreen = {
                        navHostController.navigate(Screen.SignInScreen.route) {
                            popUpTo(Screen.OnBoardingScreen.route) {
                                inclusive = true
                            }
                        }
                    }
                )
            }

            composable(Screen.SignInScreen.route) {
                SignInScreen(
                    onContinueClick = {
                        navHostController.navigate(Screen.CreateAccountScreen.route) {
                            popUpTo(Screen.OnBoardingScreen.route) {
                                inclusive = true
                            }
                        }
                    }
                )
            }

            composable(Screen.CheckEmailScreen.route) {
                CheckEmailScreen()
            }

            composable(Screen.CreateAccountScreen.route) {
                CreateAccountScreen(
                    onContinueClick = {
                        navHostController.navigate(Screen.SubscriptionScreen.route) {
                            popUpTo(Screen.OnBoardingScreen.route) {
                                inclusive = true
                            }
                        }
                    }
                )
            }

            composable(Screen.SubscriptionScreen.route){
                SubscriptionScreen()
            }
        }
    }
}