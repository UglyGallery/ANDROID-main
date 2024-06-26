package com.example.ugly_galleryalpha.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.ugly_galleryalpha.R
import com.example.ugly_galleryalpha.navigation.NavGraphScreen

import com.example.ugly_galleryalpha.ui.theme.Ugly_galleryALPHATheme


@Composable
fun HomeScreen(){

    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ){
        Spacer(modifier = Modifier.padding(8.dp))

        Text(
            text = "UG",
            fontSize = 34.sp,
            fontWeight = FontWeight.Bold
        )

        Lenta(
            R.drawable.photo1,
            "Geralt",
            "like",
            R.drawable.photo2,
            "Over_Lord",
            "My Favorite ANIME"
        )

        Lenta(
            R.drawable.photo3,
            "Mr_Wagner",
           "GUUUNS!!!",
            R.drawable.photo4,
            "Машка Рофляшка",
            "Моя кошка"
        )


    }
}


// Элемент ленты (пост)
@Composable
fun PostLenta(img: Int, nameUser: String, nameWork: String){
    Column {
        Card(
            modifier = Modifier
                .size(width = 160.dp, height = 180.dp),
            elevation = 8.dp,
            shape = RoundedCornerShape(8)

        ){
            Image(
                painter = painterResource(id = img),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
        }
        Spacer(modifier = Modifier.padding(4.dp))
        Text(
            modifier = Modifier.padding(start = 16.dp),
            text = nameUser
        )
        Text(
            modifier = Modifier.padding(start = 16.dp),
            text = nameWork,
            color = Color.Gray
        )
        Spacer(modifier = Modifier.padding(bottom = 8.dp))
    }
}

// Лента
@Composable
fun Lenta(
    img: Int,
    nameUser: String,
    nameWork: String,
    img1: Int,
    nameUser1: String,
    nameWork1: String){
    Column {
        Row(
            horizontalArrangement = Arrangement.Start,
        ){
            PostLenta(img, nameUser, nameWork)
            Spacer(modifier = Modifier.padding(8.dp))
            PostLenta(img1, nameUser1, nameWork1)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    Ugly_galleryALPHATheme {
        HomeScreen()
    }
}