

import random

class Game2048:
    def __init__(self):
        self.grid = [[0 for _ in range(4)] for _ in range(4)]
        self.spawn_new_tile()
        self.spawn_new_tile()
        self.score = 0
        
    def spawn_new_tile(self):
        empty_tiles = [(i, j) for i in range(4) for j in range(4) if self.grid[i][j] == 0]
        if empty_tiles:
            value = 2 if random.random() < 0.9 else 4
            i, j = random.choice(empty_tiles)
            self.grid[i][j] = value

    def move(self, direction):
        if direction == "up":
            self.grid = self.transpose(self.grid)
        elif direction == "left":
            pass
        elif direction == "down":
            self.grid = self.transpose(self.grid[::-1])
        elif direction == "right":
            self.grid = [row[::-1] for row in self.grid]

        for i in range(4):
            self.grid[i], points = self.move_row_left(self.grid[i])
            self.score += points

        if direction == "up":
            self.grid = self.transpose(self.grid)
        elif direction == "left":
            pass
        elif direction == "down":
            self.grid = self.transpose(self.grid[::-1])
        elif direction == "right":
            self.grid = [row[::-1] for row in self.grid]
        self.spawn_new_tile()
        
    def move_row_left(self, row):
        new_row = [i for i in row if i]
        points = 0
        for i in range(len(new_row) - 1):
            if new_row[i] == new_row[i + 1]:
                new_row[i] *= 2
                points += new_row[i]
                new_row[i + 1] = 0
        new_row = [i for i in new_row if i]
        new_row += [0] * (4 - len(new_row))
        return new_row, points
    
    def transpose(self,matrix):
        return [list(i) for i in zip(*matrix)]

    def check_gameover(self):
        for i in range(4):
            for j in range(4):
                if self.grid[i][j]==2048:
                    return True
                if self.grid[i][j]==0 or (j!=3 and self.grid[i][j]==self.grid[i][j+1]) or (i!=3 and self.grid[i][j]==self.grid[i+1][j]):
                    return False
        return True


game = Game2048()
while True:
    ...
    direction = input("Enter direction to move (up, down, left, right): ")
    game.move(direction)
    if game.check_gameover():
        print("Game over! Your score is: ", game.score)
        break
    print(game.grid)
