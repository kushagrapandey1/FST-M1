def listsum(numlist):
    sum = 0
    for i in numlist:
        sum += int(i)
    return sum
numlist = list(input("Enter numbers in to List: ").split(","))
print('Elements in the list: ', numlist)
total = listsum(numlist)
print('Sum of elements in the list: ' + str(total))

