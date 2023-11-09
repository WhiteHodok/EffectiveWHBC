package com.example.effectivewhbc.presentation.content

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.effectivewhbc.models.PromoModel
import com.example.effectivewhbc.ui.theme.size.Units

@Composable
fun PromoContent(promoList: List<PromoModel>) {
    LazyRow {
        itemsIndexed(promoList) { index, promoModel ->
            PromoItem(promoModel = promoModel)
            Spacer(modifier = Modifier.width(width = Units.Spaces.promoPadding))
        }
    }
}