package com.kenkoro.ui.weird.cells.feature.generating.cells.presentation.composables.cell.item

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kenkoro.ui.weird.cells.R
import com.kenkoro.ui.weird.cells.core.local.LocalWidth

@Composable
fun Cell(
  gradientColors: List<Color>,
  icon: String,
  title: String,
  supportingText: String,
) {
  val width = LocalWidth.current

  Box(
    modifier = Modifier
      .size(width.itemIcon)
      .clip(CircleShape)
      .background(
        brush = Brush.verticalGradient(
          colors = gradientColors,
        )
      ),
    contentAlignment = Alignment.Center,
  ) {
    Text(text = icon)
  }
  Spacer(modifier = Modifier.width(16.dp))
  Column(horizontalAlignment = Alignment.Start) {
    Text(
      text = title,
      fontSize = 20.sp,
      color = Color.Black,
      fontWeight = FontWeight.Bold,
    )
    Text(
      text = supportingText,
      fontSize = 14.sp,
      color = Color.Black,
    )
  }
}