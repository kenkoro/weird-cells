package com.kenkoro.ui.weird.cells.core.local

import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class CellsGeneratorWidth(
  val fab: Dp = 331.dp,
)

val LocalWidth = compositionLocalOf { CellsGeneratorWidth() }