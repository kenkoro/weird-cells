package com.kenkoro.ui.weird.cells.feature.generating.cells.presentation.composables.util

enum class CellType {
  Dead, Alive, Life;

  val isAlive: Boolean
    get() = this == Alive

  val isLife: Boolean
    get() = this == Life
}