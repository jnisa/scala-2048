import curses
from curses import KEY_RIGHT, KEY_LEFT, KEY_UP, KEY_DOWN
from random import randint

def main(stdscr):
    curses.curs_set(0)
    stdscr.nodelay(1)
    stdscr.timeout(100)

    # Initialize the board
    board = [[0 for _ in range(4)] for _ in range(4)]
    add_random_tile(board)
    add_random_tile(board)
    score = 0

    while True:
        # Draw the board
        stdscr.clear()
        stdscr.addstr(0, 0, 'SCORE: ' + str(score) + '\n')
        draw_board(stdscr, board)

        # Get user input
        key = stdscr.getch()
        if key in (KEY_LEFT, KEY_RIGHT, KEY_UP, KEY_DOWN):
            moved, score_increment = move(board, key)
            score += score_increment
            if moved:
                add_random_tile(board)

        # End the game if the board is full
        if not any_empty_tiles(board):
            if not can_move(board):
                stdscr.addstr(0, 0, 'Game over! Press any key to quit.')
                stdscr.getch()
                break

def draw_board(stdscr, board):
    for i, row in enumerate(board):
        for j, tile in enumerate(row):
            stdscr.addstr(i+1, j*5, '{:4}'.format(tile))

def add_random_tile(board):
    empty_tiles = [(i, j) for i in range(4) for j in range(4) if board[i][j] == 0]
    if not empty_tiles:
        return
    i, j = empty_tiles[randint(0, len(empty_tiles) - 1)]
    board[i][j] = 2

def any_empty_tiles(board):
    return any(any(row) == 0 for row in board)

def can_move(board):
    for i in range(4):
        for j in range(4):
            if board[i][j] == 0 or (j > 0 and board[i][j-1] == board[i][j]) or (i > 0 and board[i-1][j] == board[i][j]):
                return True
    return False

def move(board, key):
    moved = False
    score_increment = 0
    if key == KEY_LEFT:
        moved, score_increment = move_left(board)
    elif key == KEY_RIGHT:
        board = [[row[i] for row in board] for i in range(4)]
        moved, score_increment = move_left(board)
        board = [[row[i] for row in board] for i in range(4)]
    elif key == KEY
