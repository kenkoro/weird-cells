package com.kenkoro.ui.weird.cells

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
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