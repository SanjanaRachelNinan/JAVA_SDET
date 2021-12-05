# -*- coding: utf-8 -*-
"""
Created on Thu Dec  2 22:27:33 2021

@author: sanja
"""
# Accessing Instance Variables

class community:    
  def __init__(myself, name, year):  #Here I mentioned myself rather than self  
    myself.name = name    
    myself.year = year    
    
  def myfunc(myself):    
    print("\nHello World")           
    
p1 = community("C# corner",2019)    
p1.myfunc()  
print("\nWellcome to ", p1.name, + p1.year) #Accessing object variables 