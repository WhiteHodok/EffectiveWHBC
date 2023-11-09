package com.example.effectivewhbc.presentation.buttons

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.effectivewhbc.R
import com.example.effectivewhbc.ui.theme.size.Units
import com.example.effectivewhbc.utilities.showToast
import com.example.effectivewhbc.ui.theme.color.videoButtonColor

@Preview(showBackground = true, showSystemUi = true, name = "Video button")
@Composable
fun VideoButton() {
    Button(
        onClick = { showToast("") },
        colors = ButtonDefaults.buttonColors(
            containerColor = videoButtonColor,
            contentColor = Color.White
        ),
        shape = MaterialTheme.shapes.extraLarge,
        modifier = Modifier.size(size = Units.WidgetSize.videoSize),
        contentPadding = PaddingValues(all = Units.Spaces.smallPadding)
    ) {
        Icon(
            imageVector = Icons.Rounded.PlayArrow,
            contentDescription = stringResource(id = R.string.video)
        )
    }
}