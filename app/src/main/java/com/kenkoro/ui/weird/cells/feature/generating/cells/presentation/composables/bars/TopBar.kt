package com.kenkoro.ui.weird.cells.feature.generating.cells.presentation.composables.bars

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.kenkoro.ui.weird.cells.R
import com.kenkoro.ui.weird.cells.core.local.LocalHeight
import com.kenkoro.ui.weird.cells.ui.theme.WeirdCellsTheme

@Composable
fun TopBar(modifier: Modifier = Modifier) {
  val height = LocalHeight.current

  Box(
    modifier = modifier
      .height(height.topBar)
      .fillMaxWidth()
      .background(MaterialTheme.colorScheme.secondary),
    contentAlignment = Alignment.Center,
  ) {
    Text(
      text = stringResource(id = R.string.cells_generator_screen_top_bar_title),
      style = MaterialTheme.typography.bodyMedium,
      )
  }
}

@Preview(showBackground = true)
@Composable
private fun TopBarPrev() {
  WeirdCellsTheme {
    TopBar()
  }
}