# -*- coding: utf-8 -*-
"""
Created on Thu Dec  2 22:43:32 2021

@author: sanja
"""
# In Build Class Attributes

class collors:  
    'This is a sample class called collors'  
    collorCount=0
    def __int__(self,red,yellow):  
        self.red = "Apple" 
        self.yellow = "Lemon"  
        collorCount+=1
    def displayCount(self):  
        print("Tottal collorCount %d" %collors.collorCount)  
    def displayfruit(self):  
        print("Red:", self.red, "Yellow:",self.yellow)  
  
print("collors.__doc__:",collors.__doc__)  
print("Collos.__name__:", collors.__name__)  
print("collors.__module__:", collors.__module__)  
print("collors.__bases__:", collors.__bases__)  
print("collors.__dict__:", collors.__dict__) 