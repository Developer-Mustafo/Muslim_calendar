package uz.coder.muslimcalendar.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import uz.coder.muslimcalendar.model.sealed.Screen.*
import uz.coder.muslimcalendar.screen.ChooseRegionScreen
import uz.coder.muslimcalendar.screen.HomeScreen

@Composable
fun CalendarNavigation(modifier: Modifier = Modifier) {
    val controller = rememberNavController()
    NavHost(navController = controller, startDestination = Home.route, modifier = modifier.fillMaxSize()) {
        composable(Home.route){
            HomeScreen(controller = controller)
        }
        composable(ChooseRegion.route){
            ChooseRegionScreen(controller = controller)
        }
    }
}