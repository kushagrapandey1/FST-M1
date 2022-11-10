import pandas
dataframe = pandas.read_csv('UserDetails.csv')
print('User Deatils:\n', dataframe)
print('User Names:\n', dataframe['usernames'])
print('User name and password in 2nd row:\n', dataframe['usernames'][1], ',', dataframe['Passwords'][1])
print('Usernames sorted in ascending order:\n', dataframe.sort_values('usernames'))
print('Passwords sorted in descending order:\n', dataframe.sort_values('Passwords',ascending = False))
