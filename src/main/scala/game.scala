
// Main file of the game

import scala.io.StdIn
import scala.util.control.Breaks.break

import src.main.scala.Moves._
import src.main.scala.GameOver._
import src.main.scala.Auxiliars._

object GameLaunchpad {
  def main(args: Array[String]): Unit = {
    println("------------ Game 2048 ------------")
    var points = 0
    var board = Array.fill(4, 4)(0)

    // get the two positions
    val pos_1 = generate_board_position(board)
    val pos_2 = generate_board_position(board)

    board(pos_1(0))(pos_1(1)) = 2
    board(pos_2(0))(pos_2(1)) = 2

    draw_board(board)

    //  while (true) {
    //    println("Please enter the move (right, left, up, and down):")
    //    val move = StdIn.readLine()
    //
    //    if (move == "right"){
    //      val outcome = move_right(board, points)
    //
    //      board = outcome(0)
    //      points = outcome(1)
    //    }
    //    else if (move == "left") {
    //      val outcome = move_left(board, points)
    //
    //      board = outcome(0)
    //      points = outcome
    //    }
    //    else if (move == "up") {
    //      val outcome = move_up(board, points)
    //
    //      board = outcome(0)
    //      points = outcome
    //    }
    //    else if (move == "down") {
    //      val outcome = move_down(board, points)
    //
    //      board = outcome(0)
    //      points = outcome
    //    }
    //    else {
    //      println("The direction to move the board chosen is not supported!")
    //    }
    //
    //    if (is_game_over(board)) {
    //      println(f"Game over! Your score is $points%2.2f")
    //      break
    //    }
    //  }
  }
}
