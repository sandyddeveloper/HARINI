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
    return random.randint(1,6)

#Check_snake_or_laddder
def check_snake_or_laddder(pos):
    if pos in snakes:
        print("Snake at {pos} . Now your moving down to {snake[pos]}")
        return snakes[pos]
    elif pos in ladders:
        print("Your in ladder at {pos}.. so your going to move up to {ladders[pos]}")
        return ladders[pos]
    return pos
    
# players turn
def take_turn(player, position):
    input(f"{player}'s turn. Press enter to roll the dice")
    dice = roll_dice()
    print(f"{player} rooled a {dice}")

    if position + dice  > 100:
        print(" You need exact number to 100. Turn skiiped. \n")
        return position
    
    position += dice
    position = check_snake_or_laddder(position)
    print(f'{player} is now at position {position} \n')
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
            print(f"{p1} wins the game")
            break
        pos2 = take_turn(p2, pos2) 
        if pos2 == 100:
            print(f"{p2} win the game")   
            break


if __name__ == '__main__':
    play_game()
    










