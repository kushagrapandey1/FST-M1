listinput = list(input("Enter elements in to list: ").split(","))
print(listinput)
sum =0
for i in listinput:
    sum+=int(i)
print(sum)