// Functions that will be used by other functions on the app

package Main.game.AuxiliarFunctions

import scala.:+


object Auxiliars {

  def shift_row(array_in: Array[Int], direction: String): Array[Int] = {
    /**
     * Shifts all the non-zero values of the provided row (array) to either right or left.
     *
     * :param array_in: array that will be shifted
     * :param direction: it can either be left or right
     * :return: the array provided already shifted according to the direction input argument value
     */

    var zero_counter = 0
    var array_out = List[Int]()

    for (idx <- 0 to array_in.size - 1) {
      if (array_in(idx) != 0) {
        array_out = array_out :+ array_in(idx)
      } else {zero_counter += 1}
    }

    for {i <- 0 to zero_counter - 1} {
      if (direction == "right") {
        array_out = 0 :: array_out
      }
      else if (direction == "left") {
        array_out = array_out :+ 0
      }
    }

    array_out.toArray
  }
  def get_adjacent_vals(board: Array[Array[Int]], row_idx: Int, col_idx: Int): Tuple = {
    /**
     * Extract the values of the adjacent positions that is under analysis.
     *
     * :param board: 2048 game board that is going to be evaluated
     * :param row_idx: index of the row of the position under analysis
     * :param col_idx: index of hte column of the position under analysis
     * :return: an array with all the adjacent values is returned at the end of this method.
     */

    val board_range = 0 to 3

    if (!(board_range contains row_idx) || !(board_range contains col_idx)) {
      return (None, None, None, None)
    }

    val row = board(row_idx)
    val upper_row = if (board.lift(row_idx - 1).isDefined) board.lift(row_idx - 1) else None
    val bottom_row = if (board.lift(row_idx + 1).isDefined) board.lift(row_idx + 1) else None

    val upper_val = if (upper_row.isDefined) upper_row.get(col_idx) else None
    val lower_val = if (bottom_row.isDefined) bottom_row.get(col_idx) else None
    val left_val = if (row.lift(col_idx - 1).isDefined) row.lift(col_idx - 1).get else None
    val right_val = if (row.lift(col_idx + 1).isDefined) row.lift(col_idx + 1).get else None

    (upper_val, lower_val, left_val, right_val)
  }

  def draw_board(board: Array[Array[Int]]) = {
    /**
     * Draws the board game on the terminal with all the values separated
     * by commas.
     *
     * param board: 2048 game board that is going to be evaluated
     */

    board.map(_.mkString(", ")).foreach(println)
  }

}
