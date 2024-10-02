package com.kenkoro.ui.weird.cells.feature.generating.cells.presentation.composables.fabs

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.kenkoro.ui.weird.cells.R
import com.kenkoro.ui.weird.cells.core.local.LocalHeight
import com.kenkoro.ui.weird.cells.core.local.LocalRadius
import com.kenkoro.ui.weird.cells.core.local.LocalWidth

@Composable
fun CellsGeneratorFab(
  modifier: Modifier = Modifier,
  onPopulate: () -> Unit = {},
) {
  val height = LocalHeight.current
  val width = LocalWidth.current
  val radius = LocalRadius.current

  FloatingActionButton(
    modifier =
      modifier
        .size(width = width.standard, height = height.fab),
    onClick = onPopulate,
    containerColor = MaterialTheme.colorScheme.primary,
    shape = RoundedCornerShape(radius.fab),
  ) {
    Text(
      text = stringResource(id = R.string.cells_generator_screen_fab_label).uppercase(),
      style = MaterialTheme.typography.bodySmall,
    )
  }
}