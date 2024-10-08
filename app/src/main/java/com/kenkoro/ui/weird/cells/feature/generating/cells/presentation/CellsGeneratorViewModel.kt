package com.kenkoro.ui.weird.cells.feature.generating.cells.presentation

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.kenkoro.ui.weird.cells.feature.generating.cells.presentation.composables.util.CellType
import java.util.LinkedList

class CellsGeneratorViewModel : ViewModel() {
  private val deadOrAliveCell = listOf(CellType.Dead, CellType.Alive)

  /**
   * Here, I use a linked list to reduce the time complexity of removeFirst() method - O(1). We
   * could also use a queue or something similar.
   */
  private val threeLastCells = LinkedList<CellType>()
  val cells = mutableStateListOf<CellType>()

  fun populate() {
    val newCell = whichCellCanBeAdded()
    checkThreeDeadCellsInARowCase()

    if (threeLastCells.size >= 3) threeLastCells.removeFirst()

    cells += newCell
    threeLastCells += newCell
  }

  private fun whichCellCanBeAdded(): CellType {
    return if (threeLastCells.size == 3 && threeLastCells.areAllAliveCells()) {
      CellType.Life
    } else {
      deadOrAliveCell.random()
    }
  }

  private fun checkThreeDeadCellsInARowCase() {
    if (threeLastCells.size == 3 && threeLastCells.areAllDeadCells()) {
      val targetCell = cells[cells.size - 4]
      if (targetCell.isLife) {
        cells -= targetCell
      }
    }
  }
}

private fun MutableList<CellType>.areAllAliveCells(): Boolean {
  this.forEach {
    if (!it.isAlive) return false
  }
  return true
}

private fun MutableList<CellType>.areAllDeadCells(): Boolean {
  this.forEach {
    if (it.isAlive) return false
  }
  return true
}