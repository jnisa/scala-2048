


def draw_board(board: Array[Array[Int]]) = {
    /**
    * Draws the board game on the terminal with all the values separated
    * by commas.
    *
    * param board: 2048 game board that is going to be evaluated
    */

   board.map(_.mkString(", ")).foreach(println)
}

def moves_available(board: Array[Array[Int]]): Boolean = {
    /**
    * Method that explores if the board receive is still playable, i.e if there's
    * a position that contains an adjacent position to every single cell of the board
    * that contains the same value.
    *
    * param board: 2048 game board that is going to be evaluated
    * return: boolean value indicating if the board is still playable.
    */

    var row, col = 0;

    for (row <- 3; col <- 3){
        if !(get_adjacent_values(board, row, col) contains board(row)(col)){
            return False
        } 

    return True
    }
}


def get_adjacent_vals(board: Array[Array[Int]], row_idx: Int, col_idx: Int): Tuple = {
    /**
    * Extract the values of the adjacent positions that is under analysis.
    *
    * param board: 2048 game board that is going to be evaluated
    * param row_idx: index of the row of the position under analysis
    * param col_idx: index of hte column of the position under analysis
    * return: an array with all the adjacent values is returned at the end of this method.
    */

    var row = board(row_idx)
    var upper_row = if (board.lift(row_idx - 1) != None) board.lift(row_idx - 1) else None
    var bottom_row = if (board.lift(row_idx + 1) != None) board.lift(row_idx + 1) else None

    val upper_val = if (upper_row != None) upper_row.get(col_idx) else None
    val lower_val = if (bottom_row != None) bottom_row.get(col_idx) else None
    val left_val = if (row.lift(col_idx - 1) != None) row.lift(col_idx - 1).get else None
    val right_val = if (row.lift(col_idx + 1) != None) row.lift(col_idx + 1).get else None
    
    return (upper_val, lower_val, left_val, right_val)
}


def is_board_complete(board: Array[Array[Int]]): Boolean = {
    /**
    * Checks if the board is complete, i.e. if there's any empty positions.
    *
    * param board: 2048 game board that is going to be evaluated
    * return: boolean that whose value translates whether the board is empty
    * or not.
    */
    
    var is_complete = true
    
    for ( row <- board ) {
        if (row contains 0) {
            is_complete = false
        }
    }
    return is_complete
}