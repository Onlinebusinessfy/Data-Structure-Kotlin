package com.samuel.datastructure

import android.R
import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.samuel.datastructure.ui.theme.DataStructureTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BakeryRevenueScreen()
        }
    }
}


//Challenge 3
@Composable
fun BakeryRevenueScreen(){
    val currencySymbol = "$"
    var cookieSold by remember { mutableStateOf("") }
    var cookiePrice by remember { mutableStateOf("") }
    //Challenge 6
    var muffinsSold by remember { mutableStateOf("") }
    var muffinPrice by remember { mutableStateOf("") }
    var cakesSold by remember { mutableStateOf("") }
    var cakePrice by remember { mutableStateOf("") }

    //Data Structure
    val bakeryItems = remember { mutableStateListOf<BakeryItem>() }
    val totalRevenue by remember { mutableDoubleStateOf(0.0) }
    val errorMessage by remember { mutableStateOf("")}

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Bakery Revenue Calculator",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(top = 16.dp)
        )

        Text(
            text = "Enter the sales information for each product",
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        //Challenge 7
        OutlinedTextField(
            value = cookieSold,
            onValueChange = { cookieSold = it },
            label = {Text("Cookies Sold")},
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = cookiePrice,
            onValueChange = { cookiePrice = it },
            label = {Text("Price per cookie")},
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        //Challenge 8
        OutlinedTextField(
            value = muffinsSold,
            onValueChange = { muffinsSold = it },
            label = {Text("Muffins Sold")},
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = muffinPrice,
            onValueChange = { muffinPrice = it },
            label = {Text("Price per muffin")},
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        //Challenge 9
        OutlinedTextField(
            value = cakePrice,
            onValueChange = { cakePrice = it },
            label = {Text("Price per cake")},
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = cakesSold,
            onValueChange = { cakesSold = it },
            label = {Text("Cakes Sold")},
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun BakeryRevenueScreenPreview(){
    BakeryRevenueScreen()
}
