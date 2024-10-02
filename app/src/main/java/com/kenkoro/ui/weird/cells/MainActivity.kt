package com.kenkoro.ui.weird.cells

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.kenkoro.ui.weird.cells.feature.generating.cells.presentation.CellsGeneratorScreen
import com.kenkoro.ui.weird.cells.ui.theme.WeirdCellsTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      WeirdCellsTheme {
        CellsGeneratorScreen()
      }
    }
  }
}