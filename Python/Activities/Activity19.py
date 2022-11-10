import pandas
from pandas import ExcelFile
from pandas import ExcelWriter
# create dictionary for user data
data = {
    "FirstName":["Satvik","Avinash","Lahri"],
    "LastName":["Shah","Kati","Rath"],
    "Email":["satshah@example.com","avinashk@example.com","lahri.rath@example.com"],
    "PhoneNumber":["4537829158","5892184058","4528727830"]
}
dataframe = pandas.DataFrame(data)
print(dataframe)
writer = ExcelWriter("UserData.xlsx")
dataframe.to_excel(writer,"Sheet1",index = False)
writer.save()