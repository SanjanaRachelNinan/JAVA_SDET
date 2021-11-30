# -*- coding: utf-8 -*-
"""
Created on Tue Nov 30 20:22:42 2021

@author: sanja
"""
#Python Program - Class

class Person:
  def __init__(self, name, age):
    self.name = name
    self.age = age

  def myfunc(self):
    print("\nHello my name is " + self.name)

p1 = Person("John", 36)
p1.myfunc()
