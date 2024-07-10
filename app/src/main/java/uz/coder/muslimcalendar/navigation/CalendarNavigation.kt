package uz.coder.muslimcalendar.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import uz.coder.muslimcalendar.model.sealed.Screen.*
import uz.coder.muslimcalendar.screen.AboutScreen
import uz.coder.muslimcalendar.screen.AllahNameMeaningScreen
import uz.coder.muslimcalendar.screen.AllahNameScreen
import uz.coder.muslimcalendar.screen.ChooseRegionScreen
import uz.coder.muslimcalendar.screen.HomeScreen
import uz.coder.muslimcalendar.todo.ALLAH_NAME_INDEX

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
        composable(About.route){
            AboutScreen()
        }
        composable(AllahName.route){
            AllahNameScreen(controller = controller)
        }
        composable(AllahNameMeaning.route+"/{$ALLAH_NAME_INDEX}", arguments = arrayListOf(navArgument(
            ALLAH_NAME_INDEX){ type = NavType.IntType })){
            AllahNameMeaningScreen(controller = controller, navBackStackEntry =  it)
        }
    }
}