
// Test the functions from the auxiliars script
import TestConfig._
import TestGameOver._
import Main.game.GameOverFunctions.GameOver

import scala.Tuple
import scala.language.postfixOps
import org.scalatest.funsuite.AnyFunSuite


class test_is_game_over extends AnyFunSuite:

  test(testName = "no game over (either an empty position or adjacent positions with the same value)") {
    assert(GameOver.is_game_over(empty_board) == false)
    assert(GameOver.is_game_over(game_over_board_1) == false)
    assert(GameOver.is_game_over(game_over_board_2) == false)
    assert(GameOver.is_game_over(game_over_board_4) == false)
    assert(GameOver.is_game_over(game_over_board_5) == false)
  }

  test(testName = "game over") {
    assert(GameOver.is_game_over(game_over_board_3) == true)
  }
