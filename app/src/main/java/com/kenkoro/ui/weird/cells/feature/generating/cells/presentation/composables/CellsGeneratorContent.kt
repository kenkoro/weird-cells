package com.kenkoro.ui.weird.cells.feature.generating.cells.presentation.composables

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kenkoro.ui.weird.cells.core.local.LocalWidth
import com.kenkoro.ui.weird.cells.feature.generating.cells.presentation.composables.cell.item.CellItem
import com.kenkoro.ui.weird.cells.feature.generating.cells.presentation.composables.util.CellType
import com.kenkoro.ui.weird.cells.ui.theme.WeirdCellsTheme

@Composable
fun CellsGeneratorContent(
  modifier: Modifier = Modifier,
) {
  val width = LocalWidth.current

  LazyColumn(modifier = modifier.width(width.standard)) {
    item {  }
    items(2) {
      CellItem(type = CellType.Dead)
      Spacer(modifier = Modifier.height(2.dp))
    }
    items(2) {
      CellItem(type = CellType.Alive)
      Spacer(modifier = Modifier.height(2.dp))
    }
    item {
      CellItem(type = CellType.Life)
      Spacer(modifier = Modifier.height(2.dp))
    }
  }
}

@Preview
@Composable
private fun CellsGeneratorContentPrev() {
  WeirdCellsTheme {
    CellsGeneratorContent()
  }
}