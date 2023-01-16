// Functions required to detect the game over state

package Main.game.GameOverFunctions

import Main.game.AuxiliarFunctions.Auxiliars.get_adjacent_vals


object GameOver {
    def is_move_available(board: Array[Array[Int]]): Boolean = {
        /**
         * Method that explores if the board receive is still playable, i.e if there's
         * a position that contains an adjacent position to every single cell of the board
         * that contains the same value.
         *
         * param board: 2048 game board that is going to be evaluated
         * return: boolean value indicating if the board is still playable.
         */

        for (row <- 0 to 3; col <- 0 to 3) {
            val condition = get_adjacent_vals(board, row, col).toArray contains Option(board(row)(col))
            if !(condition) then return false
        }
        true
    }


    def is_board_complete(board: Array[Array[Int]]): Boolean = {
        /**
         * Checks if the board is complete, i.e. if there's any empty positions.
         *
         * param board: 2048 game board that is going to be evaluated
         * return: boolean that whose value translates whether the board is empty
         * or not.
         */

        for (row <- board) {
            if (row contains 0) {
                return false
            }
        }
        true
    }


    def is_game_over(board: Array[Array[Int]]): Boolean = {
        /**
         * Check if the provided board has reached to the game over state.
         *
         * param board: 2048 game board that is going to be evaluated
         * return: boolean whose result indicates whether the board has reached to the game over state.
         */

        if (is_board_complete(board) || is_move_available(board)) {
            false
        } else {
            true
        }
    }
}