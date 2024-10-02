package com.kenkoro.ui.weird.cells.feature.generating.cells.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kenkoro.ui.weird.cells.feature.generating.cells.presentation.composables.bars.TopBar
import com.kenkoro.ui.weird.cells.feature.generating.cells.presentation.composables.fabs.CellsGeneratorFab
import com.kenkoro.ui.weird.cells.ui.theme.WeirdCellsTheme

@Composable
fun CellsGeneratorScreen(
  modifier: Modifier = Modifier,
) {
  Scaffold(
    modifier = modifier,
    topBar = { TopBar() },
    floatingActionButton = { CellsGeneratorFab() },
    floatingActionButtonPosition = FabPosition.Center,
  ) { innerPaddings ->
    /* Some content */
    Box(modifier = modifier.padding(innerPaddings))
  }
}

@Preview(showBackground = true)
@Composable
private fun CellsGeneratorScreenPrev() {
  WeirdCellsTheme {
    CellsGeneratorScreen()
  }
}