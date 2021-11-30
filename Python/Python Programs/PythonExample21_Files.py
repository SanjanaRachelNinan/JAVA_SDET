# -*- coding: utf-8 -*-
"""
Created on Tue Nov 30 20:57:25 2021

@author: sanja
"""

# Python Program - Files

""""demofile is a text document containing
. . . . . . . . . . . . . . . 

Name : Sanjana Rachel Ninan
Age : 22

. . . . . . . . . . . . . . . 

"""
f = open("demofile.txt", "r")
print('\n')
for x in f:
  print(x)
