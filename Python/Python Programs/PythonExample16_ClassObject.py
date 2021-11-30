# -*- coding: utf-8 -*-
"""
Created on Tue Nov 30 20:28:00 2021

@author: sanja
"""
#Python Program - ClassObject

class MyNumbers:
  def __iter__(self):
    self.a = 1
    return self

  def __next__(self):
    x = self.a
    self.a += 1
    return x

myclass = MyNumbers() 
myiter = iter(myclass)

print('\n')
print(next(myiter))
print(next(myiter))
print(next(myiter))
print(next(myiter))
print(next(myiter))

