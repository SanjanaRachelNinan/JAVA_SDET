# -*- coding: utf-8 -*-
"""
Created on Thu Dec  2 16:27:52 2021

@author: sanja
"""
#Creating a class instance

class employee:  
    salutation="Wellcome All"   #class instance attribute  
      
    def __init__(self):    
        self.Name = 'Kokila'      
        self.Id = 101      
    def display(self):          #class instance method  
        print("\nEmployee Name: %s \nId: %d" %(self.Name, self.Id))      
Emp=employee()  
print('\n')                  
print(Emp.salutation)           #call instance attribute  
Emp.display()                   #call instance method  