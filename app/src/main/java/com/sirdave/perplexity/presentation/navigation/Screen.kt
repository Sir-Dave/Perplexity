package com.sirdave.perplexity.presentation.navigation

sealed class Screen(val route: String){
    object MainOnBoardingScreen: Screen("onboarding_main")
    object OnBoardingScreen: Screen("onboarding")
    object CreateAccountScreen: Screen("create_account")
    object CheckEmailScreen: Screen("check_email")
    object SignInScreen: Screen("sign_in")
    object SubscriptionScreen: Screen("subscription")
}
