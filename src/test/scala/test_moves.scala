
// Test the functions from the moves script
import TestConfig._
import TestUpMove._
import TestDownMove._
import TestRightMove._
import TestLeftMove._
import Main.game.GameMoves.Moves._

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers._

class test_move_up extends AnyFunSuite:
  /**
   * Tests to the move_up function.
   */

  test(testName = "check if the board is correctly shifted up and no points are added") {
    val result = move_up(move_up_input_1, 0)
    val expected = (move_up_expected_1, 0)

    result.productElement(0) shouldEqual expected(0)
    result.productElement(1) shouldEqual expected(1)
  }

  test(testName = "check if the board is correctly shifted up with some points being added") {
    val result = move_up(move_up_input_2, 0)
    val expected = (move_up_expected_2, 80)

    result.productElement(0) shouldEqual expected(0)
    result.productElement(1) shouldEqual expected(1)
  }

  test(testName = "check if the board is consistent with the upper row filled with the same value") {
    val result = move_up(move_up_input_3, 0)
    val expected = (move_up_expected_3, 0)

    result.productElement(0) shouldEqual expected(0)
    result.productElement(1) shouldEqual expected(1)
  }

  test(testName = "check if the board remains empty when a empty board is provided") {
    val result = move_up(empty_board, points = 0)
    val expected = (empty_board, 0)

    result.productElement(0) shouldEqual expected(0)
    result.productElement(1) shouldEqual expected(1)
  }

  test(testName = "check with a full board game if the function is able to perform") {
    val result = move_up(move_up_input_4, points = 0)
    val expected = (move_up_expected_4, 112)

    result.productElement(0) shouldEqual expected(0)
    result.productElement(1) shouldEqual expected(1)
  }

class test_move_down extends AnyFunSuite:
  /**
   * Tests to the move_down function.
   */

  test(testName = "check if the board is correctly shifted up and no points are added") {
    val result = move_down(move_down_input_1, 0)
    val expected = (move_down_expected_1, 0)

    result.productElement(0) shouldEqual expected(0)
    result.productElement(1) shouldEqual expected(1)
  }

  test(testName = "check if the board is correctly shifted up with some points being added") {
    val result = move_down(move_down_input_2, 4)
    val expected = (move_down_expected_2, 84)

    result.productElement(0) shouldEqual expected(0)
    result.productElement(1) shouldEqual expected(1)
  }

  test(testName = "check if the board is consistent with the upper row filled with the same value") {
    val result = move_down(move_down_input_3, 0)
    val expected = (move_down_expected_3, 0)

    result.productElement(0) shouldEqual expected(0)
    result.productElement(1) shouldEqual expected(1)
  }

  test(testName = "check if the board remains empty when a empty board is provided") {
    val result = move_down(empty_board, points = 0)
    val expected = (empty_board, 0)

    result.productElement(0) shouldEqual expected(0)
    result.productElement(1) shouldEqual expected(1)
  }

  test(testName = "check with a full board game if the function is able to perform") {
    val result = move_down(move_down_input_4, points = 0)
    val expected = (move_down_expected_4, 112)

    result.productElement(0) shouldEqual expected(0)
    result.productElement(1) shouldEqual expected(1)
  }

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

class test_move_left extends AnyFunSuite:
  /**
   * Tests to the move left function.
   */

  test(testName = "when the board as no empty cells and no cells with matching values") {
    val result = move_left(move_left_input_1, points = 0)
    val expected = (move_left_expected_1, 0)

    result.productElement(0) shouldEqual expected(0)
    result.productElement(1) shouldEqual expected(1)
  }

  test(testName = "when the board has empty cells and no cells with matching values") {
    val result = move_left(move_left_input_2, 10)
    val expected = (move_left_expected_2, 10)

    result.productElement(0) shouldEqual expected(0)
    result.productElement(1) shouldEqual expected(1)
  }

  test(testName = "when the board has cells with matching values but no empty cells") {
    val result = move_left(move_left_input_3, points = 2)
    val expected = (move_left_expected_3, 102)

    result.productElement(0) shouldEqual expected(0)
    result.productElement(1) shouldEqual expected(1)
  }

  test(testName = "when the board has matching cells and cells with empty values") {
    val result = move_left(move_left_input_4, points = 0)
    val expected = (move_left_expected_4, 108)

    result.productElement(0) shouldEqual expected(0)
    result.productElement(1) shouldEqual expected(1)
  }

  test(testName = "when the board is already sorted to the left with matching values cells") {
    val result = move_left(move_left_input_5, points = 12)
    val expected = (move_left_expected_5, 128)

    result.productElement(0) shouldEqual expected(0)
    result.productElement(1) shouldEqual expected(1)
  }

  test(testName = "when the board has all the cells with the exact same value") {
    val result = move_left(move_left_input_6, points = 0)
    val expected = (move_left_expected_6, 64)

    result.productElement(0) shouldEqual expected(0)
    result.productElement(1) shouldEqual expected(1)
  }