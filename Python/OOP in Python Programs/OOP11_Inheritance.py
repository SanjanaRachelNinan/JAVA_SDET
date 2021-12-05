# -*- coding: utf-8 -*-
"""
Created on Sun Dec  5 13:19:12 2021

@author: sanja
"""

# Python program - Inheritance

class X:
    
    def print_text(self):
        self.var = 10
        print("\nThis is parent class")

class Y(X):
    pass

x = Y()
x.print_text()
print(x.var)
