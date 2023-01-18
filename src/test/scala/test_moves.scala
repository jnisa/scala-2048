
// Test the functions from the moves script
import TestConfig._
import Main.game.GameMoves.Moves._

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers._


class test_moves extends AnyFunSuite:

  test(testName = "move_right | when we have two ending positions of a row with the same value") {
    val result = move_right(move_right_input_1, 2)
    val expected = (move_right_expected_1, 62)

    result.productElement(0) shouldEqual expected(0)
    result.productElement(1) shouldEqual expected(1)
  }

  test(testName = "move_right | when we have a row with the same value") {
    val result = move_right(move_right_input_2, 10)
    val expected = (move_right_expected_2, 26)

    result.productElement(0) shouldEqual expected(0)
    result.productElement(1) shouldEqual expected(1)
  }

  test(testName = "move_right | when we have two different straight values in a row") {
    val result = move_right(move_right_input_3, points = 2)
    val expected = (move_right_expected_3, 14)

    result.productElement(0) shouldEqual expected(0)
    result.productElement(1) shouldEqual expected(1)
  }

  test(testName = "move_right | more complex tests with multiple transformations on the different rows") {
    val result = move_right(move_right_input_4, points = 0)
    val expected = (move_right_expected_4, 108)

    result.productElement(0) shouldEqual expected(0)
    result.productElement(1) shouldEqual expected(1)
  }