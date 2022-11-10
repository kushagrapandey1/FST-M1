import pandas
dataframe = pandas.read_excel("UserData.xlsx",sheet_name = "Sheet1")
print("Data in the Excel:\n",dataframe)
print("No: of rows and columns in the Excel:",dataframe.shape)
print("Emails:\n",dataframe['Email'])
print("Soreted data:\n",dataframe.sort_values('FirstName') )
