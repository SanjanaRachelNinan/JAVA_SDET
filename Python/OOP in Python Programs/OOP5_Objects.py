# -*- coding: utf-8 -*-
"""
Created on Thu Dec  2 22:05:22 2021

@author: sanja
"""

# Objeects in a Class

class calculation:              #Class declaration  
      
    def __init__(self,a,b):  
        self.a=a  
        self.b=b    
    def Add(self):
        c=self.a+self.b
        print("\n The sum of the two numbers : %d"%c)
    def Divide(self): 
        d=self.a/self.b
        print("\n The result by dividing the two numbers : %d"%d)
c1=calculation(10,20)           #Declare object c1  
c2=calculation(100,50)          #Declare object c2  
c1.Add()                        #Call our Instance method Add  
c2.Divide()                     #Call our instance method Divide 