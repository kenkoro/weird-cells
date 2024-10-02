package com.kenkoro.ui.weird.cells.core.local

import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class CellsGeneratorHeight(
  val topBar: Dp = 60.dp,
  val fab: Dp = 36.dp,
)

val LocalHeight = compositionLocalOf { CellsGeneratorHeight() }