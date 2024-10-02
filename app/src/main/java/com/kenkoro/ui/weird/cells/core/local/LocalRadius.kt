package com.kenkoro.ui.weird.cells.core.local

import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class CellsGeneratorRadius(
  val fab: Dp = 4.dp,
  val item: Dp = 8.dp,
)

val LocalRadius = compositionLocalOf { CellsGeneratorRadius() }