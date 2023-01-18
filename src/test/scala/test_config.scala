
// Test configuration variables

object TestConfig {
  /**
   * Configuration variables that might be used in the tests that will be performed to every
   * function.
   */

  val empty_board = Array.fill(4, 4)(0)
}

object TestAdjacentVals {
  /**
   * Variables that will be used on the configuration of the tests that will be performed to
   * the function get_adjacent_vals.
   */

  val adjacent_vals_board_1 = Array(
    Array(1, 2, 3, 4),
    Array(5, 6, 7, 8),
    Array(9, 10, 11, 12),
    Array(13, 14, 15, 16)
  )
}

object TestTransposeMatrix {
  /**
   * Variables that will be used on the configuration of the tests that will be performed
   * to the function transpose_matrix
   */

  val matrix_input_1 = Array(
    Array(0, 0, 0),
    Array(0, 0, 0),
    Array(0, 0, 0)
  )
  val matrix_expected_1 = matrix_input_1
  val matrix_input_2 = Array(
    Array(1, 2, 3),
    Array(0, 0, 0),
    Array(0, 0, 0)
  )
  val matrix_expected_2 = Array(
    Array(1, 0, 0),
    Array(2, 0, 0),
    Array(3, 0, 0)
  )
  val matrix_input_3 = Array(
    Array(1, 2, 3),
    Array(4, 5, 6),
    Array(7, 8, 9)
  )
  val matrix_expected_3 = Array(
    Array(1, 4, 7),
    Array(2, 5, 8),
    Array(3, 6, 9)
  )
}

object TestGameOver {
  /**
   * Variables that will be used on the configuration of the tests that will be performed to
   * the function is_game_over.
   */

  val game_over_board_1 = Array(
    Array(2, 2, 2, 2),
    Array(2, 2, 2, 0),
    Array(2, 2, 2, 2),
    Array(2, 2, 2, 2)
  )
  val game_over_board_2 = Array.fill(4, 4)(2)
  val game_over_board_3 = Array(
    Array(2, 4, 8, 16),
    Array(4, 8, 16, 32),
    Array(8, 16, 32, 64),
    Array(16, 32, 64, 128)
  )
  val game_over_board_4 = Array(
    Array(2, 4, 8, 16),
    Array(4, 8, 16, 32),
    Array(8, 16, 32, 64),
    Array(16, 32, 64, 0)
  )
  val game_over_board_5 = Array(
    Array(2, 4, 8, 16),
    Array(4, 8, 16, 32),
    Array(8, 16, 32, 128),
    Array(16, 32, 64, 64)
  )
}

object TestRightMove {
  /**
   * Variables that will be used on the configuration of the tests that will be performed to
   * the function move_right.
   */

  val move_right_input_1 = Array(
    Array(2, 4, 8, 16),
    Array(32, 64, 128, 256),
    Array(16, 32, 64, 128),
    Array(2, 4, 16, 32)
  )
  val move_right_expected_1 = move_right_input_1

  val move_right_input_2 = Array(
    Array(0, 2, 4, 0),
    Array(8, 0, 0, 4),
    Array(2, 4, 8, 16),
    Array(2, 4, 8, 0)
  )
  val move_right_expected_2 = Array(
    Array(0, 0, 2, 4),
    Array(0, 0, 8, 4),
    Array(2, 4, 8, 16),
    Array(0, 2, 4, 8)
  )
  val move_right_input_3 = Array(
    Array(2, 2, 4, 4),
    Array(2, 4, 4, 8),
    Array(2, 4, 8, 8),
    Array(16, 4, 32, 32)
  )
  val move_right_expected_3 = Array(
    Array(0, 0, 4, 8),
    Array(0, 2, 8, 8),
    Array(0, 2, 4, 16),
    Array(0, 16, 4, 64)
  )
  val move_right_input_4 = Array(
    Array(2, 0, 0, 2),
    Array(0, 2, 0, 4),
    Array(16, 16, 32, 32),
    Array(2, 2, 2, 2)
  )
  val move_right_expected_4 = Array(
    Array(0, 0, 0, 4),
    Array(0, 0, 2, 4),
    Array(0, 0, 32, 64),
    Array(0, 0, 4, 4)
  )
  val move_right_input_5 = Array(
    Array(0, 0, 2, 2),
    Array(0, 0, 4, 4),
    Array(16, 16, 32, 32),
    Array(2, 2, 2, 2)
  )
  val move_right_expected_5 = Array(
    Array(0, 0, 0, 4),
    Array(0, 0, 0, 8),
    Array(0, 0, 32, 64),
    Array(0, 0, 4, 4)
  )
  val move_right_input_6 = Array.fill(4, 4)(4)
  val move_right_expected_6 = Array(
    Array(0, 0, 8, 8),
    Array(0, 0, 8, 8),
    Array(0, 0, 8, 8),
    Array(0, 0, 8, 8)
  )
}

object TestLeftMove {
  /**
   * Variables that will be used on the configuration of the tests that will be performed to
   * the function move_left.
   */

  val move_left_input_1 = Array(
    Array(2, 4, 8, 16),
    Array(4, 8, 16, 32),
    Array(8, 16, 32, 64),
    Array(2, 4, 8, 16)
  )
  val move_left_expected_1 = move_left_input_1
  val move_left_input_2 = Array(
    Array(0, 2, 4, 0),
    Array(8, 0, 0, 4),
    Array(2, 4, 8, 16),
    Array(2, 4, 0, 8)
  )
  val move_left_expected_2 = Array(
    Array(2, 4, 0, 0),
    Array(8, 4, 0, 0),
    Array(2, 4, 8, 16),
    Array(2, 4, 8, 0)
  )
  val move_left_input_3 = Array(
    Array(2, 2, 4, 4),
    Array(2, 4, 4, 8),
    Array(2, 4, 8, 8),
    Array(16, 4, 32, 32)
  )
  val move_left_expected_3 = Array(
    Array(4, 8, 0, 0),
    Array(2, 8, 8, 0),
    Array(2, 4, 16, 0),
    Array(16, 4, 64, 0)
  )
  val move_left_input_4 = Array(
    Array(2, 0, 2, 0),
    Array(0, 2, 0, 4),
    Array(16, 16, 32, 32),
    Array(2, 2, 2, 2)
  )
  val move_left_expected_4 = Array(
    Array(4, 0, 0, 0),
    Array(2, 4, 0, 0),
    Array(32, 64, 0, 0),
    Array(4, 4, 0, 0)
  )
  val move_left_input_5 = Array(
    Array(2, 2, 0, 0),
    Array(4, 4, 0, 0),
    Array(16, 16, 32, 32),
    Array(2, 2, 2, 2)
  )
  val move_left_expected_5 = Array(
    Array(4, 0, 0, 0),
    Array(8, 0, 0, 0),
    Array(32, 64, 0, 0),
    Array(4, 4, 0, 0)
  )
  val move_left_input_6 = Array.fill(4, 4)(4)
  val move_left_expected_6 = Array(
    Array(8, 8, 0, 0),
    Array(8, 8, 0, 0),
    Array(8, 8, 0, 0),
    Array(8, 8, 0, 0)
  )
}

object TestDownMove {
  /**
   * Variables that will be used on the configuration of the tests that will be performed to
   * the function move_down.
   */

  val move_down_input_1 = Array(
    Array(0, 4, 16, 0),
    Array(2, 0, 0, 0),
    Array(0, 8, 32, 2),
    Array(4, 0, 64, 4)
  )
  val move_down_expected_1 = Array(
    Array(0, 0, 0, 0),
    Array(0, 0, 16, 0),
    Array(2, 4, 32, 2),
    Array(4, 8, 64, 4),
  )
  val move_down_input_2 = Array(
    Array(0, 4, 16, 2),
    Array(2, 0, 32, 0),
    Array(2, 4, 32, 2),
    Array(4, 0, 64, 0)
  )
  val move_down_expected_2 = Array(
    Array(0, 0, 0, 0),
    Array(0, 0, 16, 0),
    Array(4, 0, 64, 0),
    Array(4, 8, 64, 4)
  )
  val move_down_input_3 = Array(
    Array(0, 0, 0, 0),
    Array(0, 0, 0, 0),
    Array(0, 0, 0, 0),
    Array(2, 2, 2, 2)
  )
  val move_down_expected_3 = move_down_input_3
  val move_down_input_4 = Array(
    Array(2, 2, 2, 16),
    Array(2, 0, 2, 16),
    Array(2, 2, 0, 32),
    Array(2, 0, 2, 32)
  )
  val move_down_expected_4 = Array(
    Array(0, 0, 0, 0),
    Array(0, 0, 0, 0),
    Array(4, 0, 4, 32),
    Array(4, 4, 2, 64)
  )
}

object TestUpMove {
  /**
   * Variables that will be used on the configuration of the tests that will be performed to
   * the function move_up.
   */

  val move_up_input_1 = Array(
    Array(0, 4, 16, 0),
    Array(2, 0, 0, 0),
    Array(0, 8, 32, 2),
    Array(4, 0, 64, 4)
  )
  val move_up_expected_1 = Array(
    Array(2, 4, 16, 2),
    Array(4, 8, 32, 4),
    Array(0, 0, 64, 0),
    Array(0, 0, 0, 0),
  )
  val move_up_input_2 = Array(
    Array(0, 4, 16, 2),
    Array(2, 0, 32, 0),
    Array(2, 4, 32, 2),
    Array(4, 0, 64, 0)
  )
  val move_up_expected_2 = Array(
    Array(4, 8, 16, 4),
    Array(4, 0, 64, 0),
    Array(0, 0, 64, 0),
    Array(0, 0, 0, 0),
  )
  val move_up_input_3 = Array(
    Array(2, 2, 2, 2),
    Array(0, 0, 0, 0),
    Array(0, 0, 0, 0),
    Array(0, 0, 0, 0)
  )
  val move_up_expected_3 = move_up_input_3
  val move_up_input_4 = Array(
    Array(2, 2, 2, 16),
    Array(2, 0, 2, 16),
    Array(2, 2, 0, 32),
    Array(2, 0, 2, 32)
  )
  val move_up_expected_4 = Array(
    Array(4, 4, 2, 32),
    Array(4, 0, 4, 64),
    Array(0, 0, 0, 0),
    Array(0, 0, 0, 0)
  )
}
