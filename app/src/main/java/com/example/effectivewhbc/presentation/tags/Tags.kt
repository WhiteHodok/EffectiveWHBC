package com.example.effectivewhbc.presentation.tags

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.effectivewhbc.ui.theme.size.Units

@Composable
fun Tags(list: List<String>) {
    LazyRow(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(
            space = Units.Spaces.smallPadding,
            alignment = Alignment.Start
        ),
        modifier = Modifier.fillMaxWidth()
    ) {
        items(list) { item ->
            Tag(item = item)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun Tags() {
    Tags(
        list = listOf(
            "MOBA",
            "MULTIPLAYER",
            "STRATEGY"
        )
    )
}