
// Test configuration variables

object TestConfig {
  val empty_board = Array.fill(4, 4)(0)

  // 1. Variables that are used to test the get_adjacent_vals function
  val adjacent_vals_board_1 = Array(
    Array(1, 2, 3, 4),
    Array(5, 6, 7, 8),
    Array(9, 10, 11, 12),
    Array(13, 14, 15, 16)
  )

  // 2. Variables that are used to test the is_game_over function
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

  // 3. Variables that are used to test the move_right function
  val move_right_input_1 = Array(
    Array(0, 0, 2, 2),
    Array(0, 0, 4, 4),
    Array(0, 0, 8, 8),
    Array(0, 0, 16, 16)
  )
  val move_right_expected_1 = Array(
    Array(0, 0, 0, 4),
    Array(0, 0, 0, 8),
    Array(0, 0, 0, 16),
    Array(0, 0, 0, 32)
  )

  val move_right_input_2 = Array(
    Array(2, 2, 2, 2),
    Array(0, 0, 0, 0),
    Array(2, 2, 2, 2),
    Array(0, 0, 0, 0)
  )
  val move_right_expected_2 = Array(
    Array(0, 0, 4, 4),
    Array(0, 0, 0, 0),
    Array(0, 0, 4, 4),
    Array(0, 0, 0, 0)
  )
  val move_right_input_3 = Array(
    Array(2, 2, 4, 4),
    Array(0, 0, 0, 0),
    Array(0, 0, 0, 0),
    Array(0, 0, 0, 0)
  )
  val move_right_expected_3 = Array(
    Array(0, 0, 4, 8),
    Array(0, 0, 0, 0),
    Array(0, 0, 0, 0),
    Array(0, 0, 0, 0)
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
}

