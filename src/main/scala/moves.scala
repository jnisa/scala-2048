
// Functions that will allow the player to move the board in the four possible directions

package Main.game.GameMoves
import Main.game.AuxiliarFunctions.Auxiliars.*

import scala.collection.mutable.ArrayBuffer

object Moves {

    def move_up(board: Array[Array[Int]], points: Int): Tuple = {
      /**
       * Move all the cells of the game board up.
       *
       * :param board: 2048 game board that is going to be shifted
       * :param points: number of points generated so far
       * :return: the same 2048 game board with all the cells shifted to one upper position
       * and the number of points generated from the operation + the ones collected before
       */

      val transposed_board = transpose_matrix(board)
      val transpose_left_board = move_left(transposed_board, points)

      val final_board = transpose_left_board.productElement(0)
      val final_points = transpose_left_board.productElement(1)

      (final_board, final_points)
    }

    def move_down(board: Array[Array[Int]], points: Int): Tuple = {
      /**
       * Move all the cells of the game board down.
       *
       * :param board: 2048 game board that is going to be shifted
       * :param points: number of points generated so far
       * :return: the same 2048 game board with all the cells shifted to one lower position
       * and the number of points generated from the operation + the ones collected before
       */

      val transposed_board = transpose_matrix(board)
      val transposed_right_board = move_right(transposed_board, points)

      val final_board = transposed_right_board.productElement(0)
      val final_points = transposed_right_board.productElement(1)

      (final_board, final_points)
    }

  def move_right(board: Array[Array[Int]], points: Int): Tuple = {
    /**
     * Move all the cells of the game board on the right direction.
     *
     * :param board: 2048 game board that is going to be shifted
     * :param points: number of points generated so far
     * :return: the same 2048 game board with all the cells shifted to the right direction and
     * the points that were generated during that operation + the ones collected before
     */

    var total_points = points
    var new_board = ArrayBuffer[Array[Int]]()

    for (row <- 0 to 3) {

      var col = 0
      val new_row = board(row).clone()

      while (col <= 3) {
        if (new_row(col) == new_row.lift(col + 1).getOrElse(-1)) {
          new_row(col + 1) = new_row(col) * 2
          total_points += new_row(col + 1)
          new_row(col) = 0
          col += 1
        }
        else if ((new_row(col) != 0) && (new_row.lift(col + 1).getOrElse(-1) == 0)) {
          new_row(col + 1) = new_row(col)
          new_row(col) = 0
        }
        col += 1
      }
      val row_shifted = shift_row(new_row, "right")
      new_board = new_board :+ row_shifted
    }

    (new_board.toArray, total_points)
  }

    def move_left(board: Array[Array[Int]], points: Int): Tuple = {
      /**
       * Move all the cells of the game board on the left direction.
       *
       * :param board: 2048 game board that is going to be shifted
       * :param points: number of points generated so far
       * :return: the same 2048 game board with all the cells shifted to one left direction
       */

      var total_points = points
      var new_board = ArrayBuffer[Array[Int]]()

      for (row <- 0 to 3) {

        var col = 3
        val new_row = board(row).clone()

        while (col >= 0) {
          if (new_row(col) == new_row.lift(col - 1).getOrElse(-1)) {
            new_row(col - 1) = new_row(col) * 2
            total_points += new_row(col - 1)
            new_row(col) = 0
            col -= 1
          }
          else if ((new_row(col) != 0) && (new_row.lift(col - 1).getOrElse(-1) == 0)) {
            new_row(col - 1) = new_row(col)
            new_row(col) = 0
          }
          col -= 1
        }
        val row_shifted = shift_row(new_row, "left")
        new_board = new_board :+ row_shifted
      }

      (new_board.toArray, total_points)
    }
}
