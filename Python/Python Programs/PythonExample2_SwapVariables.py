# -*- coding: utf-8 -*-
"""
Created on Tue Nov 30 11:46:35 2021

@author: sanja
"""

# Python program to swap two variables

#To take inputs from the user

x = input('Enter value of x : ')
y = input('Enter value of y : ')

print('\n The value of x before swapping : {}'.format(x))
print('\n The value of y before swapping : {}'.format(y))

# create a temporary variable and swap the values

temp = x
x = y
y = temp

print('\n The value of x after swapping : {}'.format(x))
print('\n The value of y after swapping : {}'.format(y))