
// Test the functions from the auxiliars script
import src.main.scala.TestConfig._
import src.main.scala.TestGameOver._

import src.main.scala.GameOver.is_game_over

import scala.Tuple
import scala.language.postfixOps
import org.scalatest.funsuite.AnyFunSuite


class test_is_game_over extends AnyFunSuite:

  test(testName = "no game over (either an empty position or adjacent positions with the same value)") {
    assert(is_game_over(empty_board) == false)
    assert(is_game_over(game_over_board_1) == false)
    assert(is_game_over(game_over_board_2) == false)
    assert(is_game_over(game_over_board_4) == false)
    assert(is_game_over(game_over_board_5) == false)
  }

  test(testName = "game over") {
    assert(is_game_over(game_over_board_3) == true)
  }
