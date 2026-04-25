package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = Color(0xFFD2E8D4)
            ) {
                BusinessCardApp()
            }
        }
    }
}

@Composable
fun BusinessCardApp() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val logo = painterResource(id = R.drawable.android_logo)
            Box(
                modifier = Modifier
                    .height(120.dp)
                    .width(120.dp)
                    .background(Color(0xFF073042))
            ) {
                Image(
                    painter = logo,
                    contentDescription = null,
                    modifier = Modifier.padding(8.dp)
                )
            }
            Text(
                text = "Đinh Đức Hải",
                fontSize = 45.sp,
                fontWeight = FontWeight.Light,
                modifier = Modifier.padding(top = 8.dp, bottom = 8.dp)
            )
            Text(
                text = "Android Developer Extraordinaire",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF006D3B)
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 50.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ContactRow(
                icon = painterResource(id = R.drawable.goi),
                text = "+0353692259"
            )
            ContactRow(
                icon = painterResource(id = R.drawable.share),
                text = "@AndroidRealme"
            )
            ContactRow(
                icon = painterResource(id = R.drawable.gmails),
                text = "dinhduchai0001@gmail.com"
            )
        }
    }
}

@Composable
fun ContactRow(icon: Painter, text: String) {
    Column(modifier = Modifier.fillMaxWidth()) {
        HorizontalDivider(
            modifier = Modifier.fillMaxWidth(),
            thickness = 1.dp,
            color = Color(0xFF526066)
        )
        Row(
            modifier = Modifier
                .padding(start = 50.dp, top = 10.dp, bottom = 10.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = icon,
                contentDescription = null,
                modifier = Modifier.size(24.dp)
            )
            Text(
                text = text,
                fontSize = 16.sp,
                color = Color(0xFF000000),
                modifier = Modifier.padding(start = 20.dp)
            )
        }
    }
}