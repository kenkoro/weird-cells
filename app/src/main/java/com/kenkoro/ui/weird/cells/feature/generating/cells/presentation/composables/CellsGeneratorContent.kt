package com.kenkoro.ui.weird.cells.feature.generating.cells.presentation.composables

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kenkoro.ui.weird.cells.core.local.LocalHeight
import com.kenkoro.ui.weird.cells.core.local.LocalWidth
import com.kenkoro.ui.weird.cells.feature.generating.cells.presentation.composables.cell.item.CellItem
import com.kenkoro.ui.weird.cells.feature.generating.cells.presentation.composables.util.CellType
import com.kenkoro.ui.weird.cells.ui.theme.WeirdCellsTheme
import java.util.UUID

@Composable
fun CellsGeneratorContent(
  modifier: Modifier = Modifier,
  cells: List<CellType>,
) {
  val width = LocalWidth.current
  val height = LocalHeight.current

  LazyColumn(modifier = modifier.width(width.standard)) {
    items(items = cells, key = { UUID.randomUUID().toString() }) { type ->
      CellItem(type = type)
      Spacer(modifier = Modifier.height(4.dp))
    }
    item { Spacer(modifier = Modifier.height(height.item)) }
  }
}