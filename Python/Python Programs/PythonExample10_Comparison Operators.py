# -*- coding: utf-8 -*-
"""
Created on Tue Nov 30 16:07:28 2021

@author: sanja
"""

# Python program to check is a number is greater ,lesser or equal to the other number
# Usage of if elif
# Store input numbers
num1 = input('Enter first number (Num1) : ')
num2 = input('Enter second number (Num2) : ')
print('\n')
if num1 > num2:
  print("Num1 : {} is greater than Num2 : {} ".format(num1,num2))
elif num1 < num2:
  print("Num1 : {} is lesser than Num2 : {} ".format(num1,num2))
elif num1 == num2:
  print("Num1 : {} and Num2 : {} are equal ".format(num1,num2))
