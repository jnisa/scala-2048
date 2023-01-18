
// Test the functions from the auxiliars script
import TestConfig._
import TestAdjacentVals._
import TestTransposeMatrix._
import Main.game.AuxiliarFunctions.Auxiliars._

import scala.Tuple
import scala.language.postfixOps
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers._


class test_get_adjacent_vals extends AnyFunSuite:
  /**
   * Tests to the get_adjacent_vals function.
   */

  test("adjacent when the board is fully empty") {
    assert(get_adjacent_vals(empty_board, 1, 2) == (0, 0, 0, 0))
    assert(get_adjacent_vals(adjacent_vals_board_1, 2, 2) == (7, 15, 10, 12))
  }

  test("when you hit the limits of the board") {
    assert(get_adjacent_vals(empty_board, 0, 0) == (None, 0, None, 0))
    assert(get_adjacent_vals(adjacent_vals_board_1, 3, 3) == (12, None, 15, None))
  }

  test(testName = "when you hit a position that is outside the board") {
    assert(get_adjacent_vals(empty_board, row_idx = 4, col_idx = 4) == (None, None, None, None))
    assert(get_adjacent_vals(adjacent_vals_board_1, row_idx = -1, col_idx = -1) == (None, None, None, None))
  }

class test_shift_row extends AnyFunSuite:
  /**
   * Tests to the shift_row function.
   */

  test(testName = "shift a row board right") {
    val result = shift_row(Array(1, 0, 2, 0), "right")
    val expected = Array(0, 0, 1, 2)

    result shouldEqual expected
  }

  test(testName = "shift the non-zero array values with another length to the left") {
    val result = shift_row(Array(1, 0, 0, 2, 0, 0), direction = "left")
    val expected = Array(1, 2, 0, 0, 0, 0)

    result shouldEqual expected
  }

  test(testName = "when the provided array is filled with zeros") {
    val result = shift_row(Array(0, 0, 0), direction = "right")
    val expected = Array(0, 0, 0)

    result shouldEqual expected
  }

class test_transpose_matrix extends AnyFunSuite:
  /**
   * Tests to the transpose_matrix function.
   */

  test(testName = "when the matrix is absolutely empty | Dims: 3x3") {
    val result = transpose_matrix(matrix_input_1)
    val expected = matrix_expected_1

    result shouldEqual expected
  }

  test(testName = "when the matrix only has values on the first row | Dims: 3x3") {
    val result = transpose_matrix(matrix_input_2)
    val expected = matrix_expected_2

    result shouldEqual expected
  }

