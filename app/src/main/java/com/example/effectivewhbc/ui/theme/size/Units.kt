package com.example.effectivewhbc.ui.theme.size

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

object Units {
    object TextSize {
        val _10sp = 10.sp
        val _12sp = 12.sp
        val _16sp = 16.sp
        val _20sp = 20.sp
        val _48sp = 28.sp
    }

    object TextWeight {
        val _400 = FontWeight(400)
        val _500 = FontWeight(500)
        val _700 = FontWeight(700)
    }

    object LetterSpacing {
        val defaultLetterSpacing = 0.5.sp
        val mediumLetterSpacing = 0.6.sp
    }

    object LineHeight {
        val bodySmall = 12.19.sp
        val bodyMedium = 20.sp
        val labelLarge = 57.6.sp
        val titleSmall = 19.2.sp
        val titleMedium = 19.2.sp
        val titleLarge = 24.sp
    }

    object WidgetSize {
        val buttonRadius = 12.dp
        val promoRadius = 14.dp
        val reviewerRadius = 18.dp
        val tagRadius = 100.dp

        val reviewerSize = DpSize(width = 36.dp, height = 36.dp)
        val videoSize = DpSize(width = 48.dp, height = 48.dp)
        val logoSize = 78.dp
        val bannerSize = 340.dp
        val promoSize = DpSize(width = 240.dp, height = 135.dp)

        val starsSize = DpSize(width = 76.dp, height = 12.dp)
    }

    object Spaces {
        val headSpacer = 64.dp
        val contentSpacer = 46.dp

        val borderWidth = 2.dp
        val dividerHeight = 2.dp

        val extraSmallPadding = 10.dp
        val imagePadding = 17.dp
        val defaultPadding = 24.dp
        val smallPadding = 12.dp
        val promoPadding = 12.dp
        val buttonPadding = 20.dp

        val reviewSpacer = 30.dp
        val reviewItemSpacer = 17.dp
        val reviewerItemSpacer = 7.dp

        val headLogoItemSpacer = 12.dp
        val headItemSpacer = 7.dp
        val headRatingItemSpacer = 10.dp
    }
}