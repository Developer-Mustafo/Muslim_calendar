package uz.coder.muslimcalendar.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import uz.coder.muslimcalendar.viewModel.CalendarViewModel

@Composable
fun HomeScreen(modifier: Modifier = Modifier, controller: NavHostController) {
    Home(modifier = modifier)
}

@OptIn(ExperimentalFoundationApi::class)
@Preview(showBackground = true)
@Composable
fun Home(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    val name = remember {
        mutableStateOf("")
    }
    val viewModel = viewModel<CalendarViewModel>()
    val calendar by viewModel.calendar.collectAsState()
    val list by viewModel.timeList().collectAsState(emptyList())
    val pagerState = rememberPagerState {
        list.size
    }
    Column(modifier = modifier.fillMaxSize()) {
        HorizontalPager(state = pagerState) {
            Column(
                modifier
                    .fillMaxWidth()
                    .height(220.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                        Text(text = list[it].name, color = Color.Black, fontSize = 25.sp)
                        Text(text = list[it].time, color = Color.Black, fontSize = 25.sp)
            }
        }
    }
}
