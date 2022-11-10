list1 = list(input("Enter numbers in to list1: ").split(","))
list2 = list(input("Enter numbers in to list2: ").split(","))
newlist = []
print('List 1: ',list1)
print('List 2: ',list2)
for i in list1:
    if (int(i) % 2 != 0):
        newlist.append(i)
for i in list2:
    if int(i) % 2 == 0:
        newlist.append(i)
print('New List is: ',newlist)

