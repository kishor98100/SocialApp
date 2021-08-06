/*
 * Copyright (c) 2021
 * @author: Kishor Mainali
 */

package np.com.mkishor.socialapp.presentation.util

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.SplashScreen.route
    ) {

        composable(Screen.SplashScreen.route) {
        }

        composable(Screen.LoginScreen.route) {
        }
        composable(Screen.RegisterScreen.route) {
        }
        composable(Screen.MainFeedScreen.route) {
        }


    }
}