package com.kenkoro.ui.weird.cells.feature.generating.cells.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FabPosition
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.kenkoro.ui.weird.cells.feature.generating.cells.presentation.composables.CellsGeneratorContent
import com.kenkoro.ui.weird.cells.feature.generating.cells.presentation.composables.bars.TopBar
import com.kenkoro.ui.weird.cells.feature.generating.cells.presentation.composables.fabs.CellsGeneratorFab
import com.kenkoro.ui.weird.cells.ui.theme.WeirdCellsTheme

@Composable
fun CellsGeneratorScreen(modifier: Modifier = Modifier) {
  val viewModel: CellsGeneratorViewModel = viewModel()

  Scaffold(
    modifier = modifier,
    topBar = { TopBar() },
    floatingActionButton = { CellsGeneratorFab(onPopulate = viewModel::populate) },
    floatingActionButtonPosition = FabPosition.Center,
  ) { innerPaddings ->
    Column(
      modifier = Modifier
        .background(
          brush = Brush.verticalGradient(
            colors = listOf(
              MaterialTheme.colorScheme.secondary,
              Color.Black,
            ),
          )
        )
        .padding(innerPaddings)
        .fillMaxSize(),
      horizontalAlignment = Alignment.CenterHorizontally,
    ) {
      CellsGeneratorContent(cells = viewModel.cells)
    }
  }
}

@Preview(showBackground = true)
@Composable
private fun CellsGeneratorScreenPrev() {
  WeirdCellsTheme {
    CellsGeneratorScreen()
  }
}