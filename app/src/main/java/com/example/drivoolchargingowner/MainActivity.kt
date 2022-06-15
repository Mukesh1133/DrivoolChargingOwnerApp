package com.example.drivoolchargingowner

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.drivoolchargingowner.ui.theme.DrivoolChargingOwnerTheme

class MainActivity : ComponentActivity() {
    companion object{
        var CHARGER = "Charger"
        var METER = "Meter"
        var QUICK_SHARE = "Quick Share"
        var HISTORY = "History"
        var ANALYTICS = "Analytics"
        var ALERT = "Alert"
        var MANAGE_USERS = "Manage Users"
        var DRIVOOL_SHOP = "Drivool Shop"
    }
    @OptIn(ExperimentalFoundationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DrivoolChargingOwnerTheme {
                // A surface container using the 'background' color from the theme

                LazyVerticalGrid(
                    cells = GridCells.Fixed(2),
                    content ={
                        items(getMenuList()){ item ->
                            Box(
                                modifier = Modifier
                                    .padding(0.3.dp)
                                    .aspectRatio(1f)
                                    .clip(RoundedCornerShape(6.dp))
                                    .background(colorResource(id = R.color.dark_green ))
                                    .clickable(onClick = {
                                        when (item.title) {
                                            CHARGER -> {
                                                startActivity(
                                                    Intent(
                                                        this@MainActivity,
                                                        ChargerActivity::class.java
                                                    )
                                                )
                                            }
                                            METER -> {
                                                startActivity(
                                                    Intent(
                                                        this@MainActivity,
                                                        MeterActivity::class.java
                                                    )
                                                )
                                            }
                                            QUICK_SHARE -> {
                                                startActivity(
                                                    Intent(
                                                        this@MainActivity,
                                                        QuickShareActivity::class.java
                                                    )
                                                )
                                            }
                                            HISTORY -> {
                                                startActivity(
                                                    Intent(
                                                        this@MainActivity,
                                                        HistoryActivity::class.java
                                                    )
                                                )
                                            }
                                            ANALYTICS -> {
                                                startActivity(
                                                    Intent(
                                                        this@MainActivity,
                                                        AnalyticsActivity::class.java
                                                    )
                                                )
                                            }
                                            ALERT -> {
                                                startActivity(
                                                    Intent(
                                                        this@MainActivity,
                                                        AlertActivity::class.java
                                                    )
                                                )
                                            }
                                            MANAGE_USERS -> {
                                                startActivity(
                                                    Intent(
                                                        this@MainActivity,
                                                        ManageUsersActivity::class.java
                                                    )
                                                )
                                            }
                                            DRIVOOL_SHOP -> {
                                                startActivity(
                                                    Intent(
                                                        this@MainActivity,
                                                        DrivoolShopActivity::class.java
                                                    )
                                                )
                                            }
                                        }
                                    }),
                                contentAlignment = Alignment.Center
                            ){
                                Text(text = item.title, color = Color.White)
                            }
                        }
                    }
                )
            }
        }
    }
    private fun getMenuList(): List<HomeMenuModel> = listOf(
        HomeMenuModel(CHARGER),
        HomeMenuModel(METER),
        HomeMenuModel(QUICK_SHARE),
        HomeMenuModel(HISTORY),
        HomeMenuModel(ANALYTICS),
        HomeMenuModel(ALERT),
        HomeMenuModel(MANAGE_USERS),
        HomeMenuModel(DRIVOOL_SHOP)
    )
}




@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DrivoolChargingOwnerTheme {
        Greeting("Android")
    }

}