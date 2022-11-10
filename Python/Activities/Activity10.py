tuple = tuple(input("Enter numbers in to tuple: ").split(","))
print('Tuple has following elements: ', tuple)
for i in tuple:
    if int(i) % 5 == 0:
        print(i)