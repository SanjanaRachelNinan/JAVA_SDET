# -*- coding: utf-8 -*-
"""
Created on Thu Dec  2 22:53:37 2021

@author: sanja
"""
# Python Method

class Student:      
    # Constructor special method      
    def __init__(self, name):      
        print("\nThis is constructor")      
        self.name = name  
    # method  
    def show(self):      
        print("\nHello ",self.name)      
student = Student("C# corner")  
#calling the method  
student.show()   