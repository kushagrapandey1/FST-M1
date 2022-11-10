FruitDict = {
    "apple": 50,
    "orange": 30,
    "grape": 70
    }
Userinput = input("Enter which fruit u need to check: ").lower()
if Userinput in FruitDict:
    print(Userinput, " is available in Fruit Dictionary")
else:
    print(Userinput, " is not available in Fruit Dictionary")