package com.revature.retrofitstudy

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RestrictTo
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.revature.retrofitstudy.ui.theme.RetrofitStudyTheme
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : ComponentActivity() {
    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RetrofitStudyTheme {

                var myApiClient = InfoApiClient.createInfoApiClient().create(InfoFetchApi::class.java)

                GlobalScope.launch {
                    var res = myApiClient.getInfo()
                    Log.d("res",res.body().toString())


                }

            }
        }
    }
}

