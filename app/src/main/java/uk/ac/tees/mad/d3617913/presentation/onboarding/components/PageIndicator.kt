package uk.ac.tees.mad.d3617913.presentation.onboarding.components

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import uk.ac.tees.mad.d3617913.presentation.onboarding.Dimens.IndicatorSize
import uk.ac.tees.mad.d3617913.ui.theme.BlueGray

@Composable
fun PageIndicator(
    modifier: Modifier = Modifier,
    pageSize: Int,
    selectedPage: Int,
    selectedColor: Color = MaterialTheme.colorScheme.primary,
    unSelectedColor: Color = BlueGray
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        repeat(pageSize) { page ->
            Box(
                modifier = Modifier
                    .size(IndicatorSize)
                    .clip(RoundedCornerShape(38))
                    .background(color = if (page == selectedPage) selectedColor else unSelectedColor)
            )
        }
    }
}

@Composable
fun EnhancedPageIndicator(
    isSelected: Boolean
) {
    val animatedWidth = animateDpAsState(
        targetValue = if (isSelected) 35.dp else 15.dp,
        label = ""
    )
    Box(
        modifier = Modifier
            .size(IndicatorSize)
            .width(animatedWidth.value)
            .clip(RoundedCornerShape(38))
//            .background(color = if (page == selectedPage) selectedColor else unSelectedColor)
    )

}