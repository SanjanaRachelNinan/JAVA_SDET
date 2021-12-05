# -*- coding: utf-8 -*-
"""
Created on Thu Dec  2 16:55:00 2021

@author: sanja
"""
# Non Parameterized Constructor

class Csharpcorner:  
    community=""  
    def __init__(self):  #constructor declared without any arguments
        self.community="Wellcome to C# corner"  
  
    def display(self):
        print('\n')
        print(self.community)  
obj=Csharpcorner()       #Constructor automatically execute by the object creation
obj.display()   