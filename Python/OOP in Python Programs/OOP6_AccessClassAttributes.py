# -*- coding: utf-8 -*-
"""
Created on Thu Dec  2 22:15:50 2021

@author: sanja
"""
#Accessing the Class attributes

class dog:     
    name='Dommy'  #Class attribute 1  
    age='4'       #Class attribute 2  
    count=0       #Class atrribute 3  
          
    def show(self):     
        self.name    
        self.age  
        dog.count+=1  
d1 = dog()  
d1.show()  
d1.show()  
print("\nThe Dog name is:",d1.name)   #Accessing class attribute name  
print("\nThe Dog Age is:",d1.age)     #Accessing class attributes age  
print("\nCount:",d1.count)            #Accessing class attribute count