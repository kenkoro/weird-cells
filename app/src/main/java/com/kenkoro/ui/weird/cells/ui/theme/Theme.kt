package com.kenkoro.ui.weird.cells.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.kenkoro.ui.weird.cells.core.local.CellsGeneratorHeight
import com.kenkoro.ui.weird.cells.core.local.CellsGeneratorRadius
import com.kenkoro.ui.weird.cells.core.local.CellsGeneratorWidth
import com.kenkoro.ui.weird.cells.core.local.LocalHeight
import com.kenkoro.ui.weird.cells.core.local.LocalRadius
import com.kenkoro.ui.weird.cells.core.local.LocalWidth

private val LightColorScheme =
  lightColorScheme(
    primary = primary,
    secondary = secondary,
    background = background,
  )

@Composable
fun WeirdCellsTheme(content: @Composable () -> Unit) {
  val colorScheme = LightColorScheme

  CompositionLocalProvider(
    LocalHeight provides CellsGeneratorHeight(),
    LocalRadius provides CellsGeneratorRadius(),
    LocalWidth provides CellsGeneratorWidth(),
  ) {
    MaterialTheme(
      colorScheme = colorScheme,
      typography = Typography,
      content = content,
    )
  }
}