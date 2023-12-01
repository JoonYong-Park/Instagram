package com.example.instagram

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.instagram.ui.theme.InstagramTheme
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.selects.select

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstagramTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainView()
                }
            }
        }
    }
}

// 전환할 화면을 정의
// 1
@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Home screen")
    }
}

// 2
@Composable
fun SearchScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Search screen")
    }
}

// 3
@Composable
fun MoreScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "More screen")
    }
}

// 4
@Composable
fun LikeScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Like  screen")
    }
}

// 5
@Composable
fun ProfileScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Profile screen")
    }
}

// 네비게이션 컨트롤러 정의
@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            Instagram()
        }
        composable("search") {
            SearchScreen()
        }
        composable("more") {
            MoreScreen()
        }
        composable("like") {
            LikeScreen()
        }
        composable("profile") {
            ProfileScreen()
        }
    }
}

//
sealed class BottomNavItem(
    //val name: String,
    val route: String,
    val icon: @Composable () -> Unit
) {
    object Home : BottomNavItem(
        //name = "",
        route = HOME_ROUTE,
        icon = { Image(painter = painterResource(id = R.drawable.home), contentDescription = " " )}
    )

    object Search : BottomNavItem(
        //name = "",
        route = SEARCH_ROUTE,
        icon = { Image(painter = painterResource(id = R.drawable.search), contentDescription = " " )}
    )

    object More : BottomNavItem(
        //name = "",
        route = MORE_ROUTE,
        icon = { Image(painter = painterResource(id = R.drawable.more), contentDescription = " " )}
    )

    object Like : BottomNavItem(
        //name = "",
        route = LIKE_ROUTE,
        icon = { Image(painter = painterResource(id = R.drawable.like), contentDescription = " " )}
    )

    object Profile : BottomNavItem(
        //name = "",
        route = PROFILE_ROUTE,
        icon = { Image(painter = painterResource(id = R.drawable.profile), contentDescription = " " )}
    )
}

@Composable
fun BottomNavigationBar(
    navController: NavHostController,
) {
    var items = listOf<BottomNavItem>(
        BottomNavItem.Home,
        BottomNavItem.Search,
        BottomNavItem.More,
        BottomNavItem.Like,
        BottomNavItem.Profile,
    )
    NavigationBar(
        modifier = Modifier
            .height(54.dp), // 네비 높이
        containerColor = Color.White,
        contentColor = Color.Black,
    ) {
        items.forEach { item ->
            NavigationBarItem(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically),
                selected = item.route == navController.currentDestination?.route,
                icon = { item.icon() },
                onClick = {

                }
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainView() {
    val navController = rememberNavController()

    Scaffold(
        containerColor = Color.White,
        bottomBar = {
            BottomNavigationBar(navController = navController)
        }
    ) {
        Box(modifier = Modifier.padding(it)) {
            Navigation(navController = navController)
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    InstagramTheme {
        MainView()
    }
}