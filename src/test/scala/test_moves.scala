
// Test the functions from the moves script
import TestConfig._
import Main.game.GameMoves.Moves

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers._


class test_moves extends AnyFunSuite:

  test(testName = "when the player choose to move the board game right") {
    val result = Moves.move_right(move_right_input_1, 2)
    val expected = (move_right_expected_1, 62)

    result.productElement(0) shouldEqual expected(0)
    result.productElement(1) shouldEqual expected(1)
  }