import random

snakes = {
    99: 21,
    87: 45,
    76: 34,
    65: 23,
    54: 12,
    91: 38,
    83: 47,
    72: 29,
    68: 30,
    62: 19
}

ladders = {
    4: 25,
    11: 49,
    17: 74,
    22: 58,
    26: 84,
    33: 52,
    38: 89,
    44: 67,
    48: 93,
    53: 90
}

# Roll the dice
def roll_dice():
    return random.randint(1, 6)

# Check for snake or ladder
def check_snake_or_ladder(pos):
    if pos in snakes:
        print(f"You got bitten by a snake at {pos}. Moving down to {snakes[pos]}")
        return snakes[pos]
    elif pos in ladders:
        print(f"You found a ladder at {pos}. Climbing up to {ladders[pos]}")
        return ladders[pos]
    return pos

# Player's turn
def take_turn(player, position):
    input(f"{player}'s turn. Press Enter to roll the dice...")
    dice = roll_dice()
    print(f"{player} rolled a {dice}")

    if position + dice > 100:
        print("You need the exact number to reach 100. Turn skipped.\n")
        return position

    position += dice
    position = check_snake_or_ladder(position)
    print(f"{player} is now at position {position}\n")
    return position

# Main game loop
def play_game():
    p1 = input("Name of 1st player: ")
    p2 = input("Name of 2nd player: ")

    pos1 = 0
    pos2 = 0

    while True:
        pos1 = take_turn(p1, pos1)
        if pos1 == 100:
            print(f"{p1} wins the game! ")
            break

        pos2 = take_turn(p2, pos2)
        if pos2 == 100:
            print(f"{p2} wins the game! ")
            break

if __name__ == '__main__':
    play_game()




# NOTES:

# LOGICAL FLOW

# 1 - Initialize the Game 
#  => set all player position to 0 .
#  => Define snakes and ladder as dict

# 2 - Game Loop Starts
#  => While no player has reached position 100:
#         => each player takes turns.
#         => Roll the dices.
#         => calculate the new positions.
#         => if landed ona snale or ladder, update the position
#         => print the player ' position
#         => check if the player has wom

# 3 - turn HAndling:
#  => players alternate turns.
#  => A 6 may give an extra turn

# 4 - Winning Conditions
#  => Game ends immediately when any player reaches 100 
#  => Declare as winner 


# --------------------------------------------------------------
# # roll_dice()
# # plyer_move(position, dice_value)
# # chech_snake _or_ladder()
# # player_turn()
# # chech_winner()

# algorithm 

# import random
# Uniform Random Selection
# syntax = random.randint(1,6)


# simple Arithmetic

# snake  & handleing

# snake = {16: 6, 47:25....}
# ladder = {3:11, 77:}

# win condition:
# if position == 100:
#     declare winner 







