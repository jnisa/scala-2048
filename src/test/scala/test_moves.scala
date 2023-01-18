
// Test the functions from the moves script
import TestConfig._
import TestRightMove._
import Main.game.GameMoves.Moves._

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers._


class test_move_right extends AnyFunSuite:
  /**
   * Tests to the move_right function.
   */

  test(testName = "when the board as no empty cells and no cells with matching values") {
    val result = move_right(move_right_input_1, 0)
    val expected = (move_right_expected_1, 0)

    result.productElement(0) shouldEqual expected(0)
    result.productElement(1) shouldEqual expected(1)
  }

  test(testName = "when the board has empty cells and no cells with matching values") {
    val result = move_right(move_right_input_2, 10)
    val expected = (move_right_expected_2, 10)

    result.productElement(0) shouldEqual expected(0)
    result.productElement(1) shouldEqual expected(1)
  }

  test(testName = "when the board has cells with matching values but no empty cells") {
    val result = move_right(move_right_input_3, points = 2)
    val expected = (move_right_expected_3, 102)

    result.productElement(0) shouldEqual expected(0)
    result.productElement(1) shouldEqual expected(1)
  }

  test(testName = "when the board has empty cells and cells with empty values") {
    val result = move_right(move_right_input_4, points = 0)
    val expected = (move_right_expected_4, 108)

    result.productElement(0) shouldEqual expected(0)
    result.productElement(1) shouldEqual expected(1)
  }

  test(testName = "when the board is already sorted to the right with matching values cells") {
    val result = move_right(move_right_input_5, points = 12)
    val expected = (move_right_expected_5, 128)

    result.productElement(0) shouldEqual expected(0)
    result.productElement(1) shouldEqual expected(1)
  }

  test(testName = "when the board has all the cells with the exact same value") {
    val result = move_right(move_right_input_6, points = 0)
    val expected = (move_right_expected_6, 64)

    result.productElement(0) shouldEqual expected(0)
    result.productElement(1) shouldEqual expected(1)
  }