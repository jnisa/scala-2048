
// Functions required to detect the game over state
//package src.main.scala.game_over.GameOverFunctions
package src.main.scala

import src.main.scala.Auxiliars.get_adjacent_vals
//import src.main.scala.auxiliars.AuxiliarFunctions.Auxiliars.get_adjacent_vals


object GameOver {

    def is_game_over(board: Array[Array[Int]]): Boolean = {
        /**
         * Check if the provided board has reached to the game over state.
         *
         * param board: 2048 game board that is going to be evaluated
         * return: boolean whose result indicates whether the board has reached to the game over state.
         */

        for (row <- 0 to 3; col <- 0 to 3) {
            val is_slot_empty = (board(row)(col) == 0)
            val is_move_available = get_adjacent_vals(board, row, col).productIterator.exists(_ == board(row)(col))

            if (is_slot_empty || is_move_available) return false
        }
        true
    }
}