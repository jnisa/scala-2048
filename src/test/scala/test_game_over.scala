
// Test the functions from the auxiliars script

import Main.game.GameOverFunctions.GameOver

import scala.Tuple
import scala.language.postfixOps
import org.scalatest.funsuite.AnyFunSuite


val test_board_1 = Array.fill(4, 4)(0)
val test_board_2 = Array(
  Array(2, 2, 2, 2),
  Array(2, 2, 2, 0),
  Array(2, 2, 2, 2),
  Array(2, 2, 2, 2)
)
val test_board_3 = Array.fill(4, 4)(2)
val test_board_4 = Array(
  Array(2, 4, 8, 16),
  Array(4, 8, 16, 32),
  Array(8, 16, 32, 64),
  Array(16, 32, 64, 128)
)
val test_board_5 = Array(
  Array(2, 4, 8, 16),
  Array(4, 8, 16, 32),
  Array(8, 16, 32, 64),
  Array(16, 32, 64, 0)
)

class test_is_game_over extends AnyFunSuite:

  test(testName = "no game over (either an empty position or adjacent positions with the same value)") {
    assert(GameOver.is_game_over(test_board_1) == false)
    assert(GameOver.is_game_over(test_board_2) == false)
    assert(GameOver.is_game_over(test_board_3) == false)
    assert(GameOver.is_game_over(test_board_5) == false)
  }

  test(testName = "game over") {
    assert(GameOver.is_game_over(test_board_4) == true)
  }
