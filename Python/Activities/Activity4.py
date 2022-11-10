player1 = str(input('Enter Player 1 Name: '))
player2 = str(input('Enter Player 2 Name: '))
while True:
    p1_input = int(input('Welcome to Rock - Paper - Scissors Game!!!\n Pick any of the following:\n1. Rock\n2. Paper\n3. Scissors\n'))
    p2_input = int(input('Welcome to Rock - Paper - Scissors Game!!!\n Pick any of the following:\n1. Rock\n2. Paper\n3. Scissors\n'))
    if(p1_input < 4 and p2_input < 4):
        print(player1 + ' picked ' + format(p1_input) + ' and ' + player2 + ' picked ' + format(p2_input))
        if(p1_input == p2_input):
            print('Its a tie between ' + player1 + ' and ' + player2 + ' because both of them picked same option')
        elif(p1_input < p2_input ):
            if(p2_input == 2):
                print(player2 + ' wins. Paper beats Rock')
            elif(p1_input == 2 and p2_input == 3):
                (player2 + ' wins. Scissors beats Paper') 
            else: 
                print(player1 + ' wins. Rock beats Scissors')
        else: 
            if((p1_input == 3) and (p2_input == 2)):
                print(player1 + ' wins. Scissors beats paper')
            elif(p1_input == 2 and p2_input == 1):
                print(player1 + ' wins. Paper beats Rock')
            else:   
                print(player2 + ' wins. Rock beats Scissors')
    else:
        print(player1 + ' or/and ' + player2 + ' did not select either of Rock, Paper, Scissors. Please start game once again')
    repeat = input("Do you want to play another round? Yes/No: ").lower()
    
    # If they say yes, don't do anything
    if(repeat == "yes"):
        pass
    # If they say no, exit the game
    elif(repeat == "no"):
        raise SystemExit
    # If they say anything else, exit with an error message.
    else:
        print("You entered an invalid option. Exiting now.")
        raise SystemExit
