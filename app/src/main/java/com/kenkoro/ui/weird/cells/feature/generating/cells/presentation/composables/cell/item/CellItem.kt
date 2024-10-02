package com.kenkoro.ui.weird.cells.feature.generating.cells.presentation.composables.cell.item

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kenkoro.ui.weird.cells.R
import com.kenkoro.ui.weird.cells.core.local.LocalHeight
import com.kenkoro.ui.weird.cells.core.local.LocalRadius
import com.kenkoro.ui.weird.cells.feature.generating.cells.presentation.composables.util.CellType
import com.kenkoro.ui.weird.cells.ui.theme.WeirdCellsTheme

@Composable
fun CellItem(
  modifier: Modifier = Modifier,
  type: CellType,
) {
  val height = LocalHeight.current
  val radius = LocalRadius.current

  Row(
    modifier = modifier
      .fillMaxWidth()
      .height(height.item)
      .clip(RoundedCornerShape(radius.item))
      .background(Color.White),
    verticalAlignment = Alignment.CenterVertically,
  ) {
    Spacer(modifier = Modifier.width(16.dp))
    when (type) {
      CellType.Dead -> {
        Cell(
          gradientColors = listOf(Color(0xFF0D658A), Color(0xFFB0FFB4)),
          icon = stringResource(id = R.string.dead_cell_icon),
          title = stringResource(id = R.string.dead_cell_title),
          supportingText = stringResource(id = R.string.dead_cell_supporting_text),
        )
      }

      CellType.Alive -> {
        Cell(
          gradientColors = listOf(Color(0xFFFFB800), Color(0xFFFFF780)),
          icon = stringResource(id = R.string.alive_cell_icon),
          title = stringResource(id = R.string.alive_cell_title),
          supportingText = stringResource(id = R.string.alive_cell_supporting_text),
        )
      }

      CellType.Life -> {
        Cell(
          gradientColors = listOf(Color(0xFFAD00FF), Color(0xFFFFB0E9)),
          icon = stringResource(id = R.string.life_cell_icon),
          title = stringResource(id = R.string.life_cell_title),
          supportingText = stringResource(id = R.string.life_cell_supporting_text),
        )
      }
    }
  }
}

@Preview(showBackground = true, backgroundColor = android.graphics.Color.BLACK.toLong())
@Composable
private fun CellItemPrev() {
  WeirdCellsTheme {
    Column {
      CellItem(type = CellType.Alive)
      CellItem(type = CellType.Dead)
      CellItem(type = CellType.Life)
    }
  }
}