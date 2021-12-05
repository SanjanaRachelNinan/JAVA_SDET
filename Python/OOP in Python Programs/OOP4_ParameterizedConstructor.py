# -*- coding: utf-8 -*-
"""
Created on Thu Dec  2 21:56:16 2021

@author: sanja
"""

class fruits:  
    total=0  
    def __init__(self,fno,fname,fcolor):  #Constructor declared with number of arguments
        self.fno=fno  
        self.fname=fname  
        self.fcolor=fcolor  
        fruits.total+=1  
    def displaytotal(self):  
        print("\nNo:",self.fno,"Fruit Name:",self.fname,",Fruit color:",self.fcolor)  
    def displayfruit(self):  
        print("\nNo:",self.fno,"Fruit Name:",self.fname,",Fruit color:",self.fcolor)  
f1=fruits(1,"Apple","Red") 
f2=fruits(2,"lemon","Yellow") 
f3=fruits(3,"Banana","Yellow") 
f1.displaytotal()    
f2.displayfruit()    
print("\nTotal Number of Fruits %d" % fruits.total)  