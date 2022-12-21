package com.rizmaulana.movieapp.screens

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.rizmaulana.movieapp.MainViewModel

@Composable
fun DetailScreen(navController: NavController, viewModel: MainViewModel, itemId: String ) {

    Text("ID {$itemId}")

}