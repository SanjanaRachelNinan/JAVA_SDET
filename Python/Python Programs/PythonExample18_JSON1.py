# -*- coding: utf-8 -*-
"""
Created on Tue Nov 30 20:45:14 2021

@author: sanja
"""

#Python Program - JSON 1
import json

# some JSON:
x = '{ "Name":"John", "Age":30, "City":"New York"}'

# parse x:
y = json.loads(x)

# the result is a Python dictionary:
print('\n')
print(y["Age"])
