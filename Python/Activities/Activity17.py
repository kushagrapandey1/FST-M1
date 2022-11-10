import pandas
userdata = {
    "usernames" : ['admin','Charles','Deku'],
    "Passwords" : ['password','Charl13','AllMight']
}
dataframe = pandas.DataFrame(userdata)
print(dataframe)
dataframe.to_csv('UserDetails.csv',index=False)
