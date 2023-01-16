
// Test the functions from the auxiliars script

object ScalaTestingStyles

import Main.game.AuxiliarFunctions.Auxiliars

import scala.Tuple
import scala.language.postfixOps
import org.scalatest.funsuite.AnyFunSuite


class test_auxiliars extends AnyFunSuite:

  val empty_board = Array.fill(4, 4)(0)

  test("adjacent when the board is fully empty") {
    assert(Auxiliars.get_adjacent_vals(empty_board, 1, 2) == (0, 0, 0, 0))
    assert(Auxiliars.get_adjacent_vals(empty_board, 2, 2) == (0, 0, 0, 0))
  }

  test("when you hit the limits of the board") {
    assert(Auxiliars.get_adjacent_vals(empty_board, 0, 0) == (None, 0, None, 0))
    assert(Auxiliars.get_adjacent_vals(empty_board, 3, 3) == (0, None, 0, None))
  }

  test(testName = "when you hit a position that is outside the board") {
    assert(Auxiliars.get_adjacent_vals(empty_board, row_idx = 4, col_idx = 4) == (None, None, None, None))
    assert(Auxiliars.get_adjacent_vals(empty_board, row_idx = -1, col_idx = -1) == (None, None, None, None))
  }
