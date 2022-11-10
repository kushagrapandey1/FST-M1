import pytest
@pytest.fixture
def list():
   list = [0,1,2,3,4,5,6,7,8,9,10]
   return list
def sumoflist(list):
    sum = 0
    for i in list:
        sum = sum + i
    assert sum == 55
   
