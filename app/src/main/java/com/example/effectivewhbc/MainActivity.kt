package com.example.effectivewhbc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposableTarget
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.effectivewhbc.ui.theme.EffectiveWHBCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DotaUpperBackgroundPreview()

        }
    }
}

@Preview
@Composable
fun ShadowGr(){
    Image(
        painter = painterResource(id = R.drawable.rectangle31),
        contentDescription = "Top Image",
        modifier = Modifier
            .fillMaxWidth()
            .height(126.dp),
        alignment = Alignment.Center,
        contentScale = ContentScale.FillBounds)
}


@Preview
@Composable
public fun DotaUpperBackground() {

            Row(){
                Image(painter = painterResource(id = R.drawable.image16),
                    contentDescription = "image description",
                    modifier = Modifier
                        .width(628.dp)
                        .height(368.07339.dp)
                    )
            }
    ShadowGr()
        }


@Preview
@Composable
fun DotaUpperBackgroundPreview() {

    Row(){
        Image(painter = painterResource(id = R.drawable.rectangle22),
            contentDescription = "image description",
            modifier = Modifier
                .fillMaxWidth()
                .height(930.dp),
            alignment = Alignment.Center,
            contentScale = ContentScale.FillBounds)


}
    DotaUpperBackground()
}

