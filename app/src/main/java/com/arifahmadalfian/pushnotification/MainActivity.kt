package com.arifahmadalfian.pushnotification

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import com.arifahmadalfian.pushnotification.ui.theme.PushNotificationTheme

//192.168.221.145

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PushNotificationTheme {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 16.dp),
                    verticalArrangement = Arrangement.Center,
                ) {
                    var title by remember {
                        mutableStateOf("")
                    }
                    var description by remember {
                        mutableStateOf("")
                    }
                    TextField(
                        value = title,
                        onValueChange = { title = it },
                        placeholder = {
                            Text("Title")
                        },
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    TextField(
                        value = description,
                        onValueChange = { description = it },
                        placeholder = {
                            Text("Description")
                        },
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Button(
                        onClick = {

                        },
                        modifier = Modifier.align(Alignment.End)
                    ) {
                        Text(text = "Send")
                    }
                }
            }
        }
    }
}

