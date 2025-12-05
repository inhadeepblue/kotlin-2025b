package com.appweek13b

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.rememberSaveableStateHolder
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.appweek13b.ui.theme.AppWeek13bTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            LazyColumn (
                modifier = Modifier
                    .background(color = Color.Cyan)
                    .fillMaxWidth()
            ){
                items(90){
                    index -> Text(text="코틀린 ${index + 1}")
                }
            }
        }

//        setContent {
//            val scrollState = rememberScrollState()
//            Column(
//                modifier = Modifier
//                    .background(color = Color.Blue)
//                    .fillMaxWidth()
//                    .verticalScroll(scrollState)
//            ){
//                for(i in 1..90){
//                    Text("코틀린 $i")
//                }
//            }
//        }
    }
}
