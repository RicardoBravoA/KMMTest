package com.rba.kmmtest.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ComposablePreview()
        }
    }

    @Preview
    @Composable
    fun ComposablePreview() {
        ShowName("Test")
    }

    @Composable
    fun ShowName(text: String) {
        Text(text)
    }
}
