
// Test the functions from the auxiliars script

import Main.game.GameOverFunctions.GameOver

import scala.Tuple
import scala.language.postfixOps
import org.scalatest.funsuite.AnyFunSuite


class test_is_board_complete extends AnyFunSuite:

  val empty_board = Array.fill(4, 4)(0)
  val uncomplete_board = Array(Array(2, 2, 2, 2), Array(2, 2, 2, 0), Array(2, 2, 2, 2), Array(2, 2, 2, 2))
  val complete_board = Array.fill(4,4)(2)

  test("board is not only complete as its totally empty") {
    assert(GameOver.is_board_complete(empty_board) == false)
  }

  test("board only has one empty position") {
    assert(GameOver.is_board_complete(uncomplete_board) == false)
  }

  test(testName = "board completed") {
    assert(GameOver.is_board_complete(complete_board) == true)
  }
