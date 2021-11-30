# -*- coding: utf-8 -*-
"""
Created on Tue Nov 30 20:54:16 2021

@author: sanja
"""

#Python Program - RegEx 

import re

#Split the string at every white-space character:

txt = "The rain in Spain"
x = re.split("\s", txt)
print('\n')
print(x)
