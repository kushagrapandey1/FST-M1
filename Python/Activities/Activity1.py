from datetime import date
Name = input("Enter Your Name: ")
Age = int(input("Enter Your Age: "))
result = str((date.today().year) + (100 - Age))
print(Name + " will be 100 years old in " + format(result))