
// Functions that will allow the player to move the board in the four possible directions

package Main.game.GameMoves

object Moves {

  //  def move_up(board: Array[Array[Int]]): MovesOutcome = {
  //    /**
  //     * Move all the cells of the game board up.
  //     *
  //     * :param board: 2048 game board that is going to be shifted
  //     * :return: the same 2048 game board with all the cells shifted to one upper position
  //     */
  //
  //
  //  }

  //  def move_down(board: Array[Array[Int]]): Array[Array[Int]] = {
  //    /**
  //     * Move all the cells of the game board down.
  //     *
  //     * :param board: 2048 game board that is going to be shifted
  //     * :return: the same 2048 game board with all the cells shifted to one lower position
  //     */
  //
  //
  //  }

  def move_right(board: Array[Array[Int]], points: Int): Tuple = {
    /**
     * Move all the cells of the game board on the right direction.
     *
     * :param board: 2048 game board that is going to be shifted
     * :return: the same 2048 game board with all the cells shifted to the right direction and
     * the points that were generated during that operation
     */

    var new_board = List[Array[Int]]()
    var total_points = points

    for (row <- 0 to 3) {

      val new_row = Array.fill(4)(0)

      for (col <- 0 to 3) {
        if (board(row)(col) == board(row).lift(col + 1).getOrElse(-1)) {
          new_row(col) = 0
          new_row(col + 1) = board(row)(col) * 2
          total_points += new_row(col + 1)
        }
        else if (board(row).lift(col + 1).getOrElse(-1) == 0) {
          new_row(col + 1) = board(row)(col)
        }
      }
      // TODO: call a shift function here
      new_board = new_board :+ new_row
    }

    (new_board.toArray, total_points)
  }

  //  def move_left(board: Array[Array[Int]]): Array[Array[Int]] = {
  //    /**
  //     * Move all the cells of the game board on the left direction.
  //     *
  //     * :param board: 2048 game board that is going to be shifted
  //     * :return: the same 2048 game board with all the cells shifted to one left direction
  //     */
  //
  //
  //  }
}
