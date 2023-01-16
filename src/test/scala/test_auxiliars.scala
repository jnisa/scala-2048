
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
    assert(Auxiliars.get_adjacent_vals(empty_board, 4, 4) == (0, None, 0, None))
    assert(Auxiliars.get_adjacent_vals(empty_board, 5, 5) == (None, None, None, None))
  }


