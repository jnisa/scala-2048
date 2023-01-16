// Functions that will be used by other functions on the app

package Main.game.AuxiliarFunctions

object Auxiliars {

  def is_good_coords(row_input: Int, col_input: Int, board_dims: Array[Int] = Array(0, 3)): Boolean = {
    /**
     * Evaluates if the two inputs provided (one for the row and the other one for the column) is
     * value i.e. within the board limits.
     *
     * :param row_input: row value that is targeted
     * :param col_input: column value that is targeted
     * :param board_dims: predefined range of values that are allowed according to the board dims
     * :return: boolean value is returned indicating whether the coordinates are in the board or not
     */

    val valid_range = board_dims(0) to board_dims(1)

    if ((valid_range contains row_input) && (valid_range contains col_input)) {
      true
    }
    else false
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

    if (!is_good_coords(row_idx, col_idx)) {
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
