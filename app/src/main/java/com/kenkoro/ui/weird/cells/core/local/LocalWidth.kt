package com.kenkoro.ui.weird.cells.core.local

import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class CellsGeneratorWidth(
  val standard: Dp = 331.dp,
  val itemIcon: Dp = 40.dp,
)

val LocalWidth = compositionLocalOf { CellsGeneratorWidth() }