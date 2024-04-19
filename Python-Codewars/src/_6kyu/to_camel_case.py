'''

Challenges: (6kyu) Convert string to camel case
https://www.codewars.com/kata/517abf86da9663f1d2000003/train/python

Description:
    Complete the method/function so that it converts dash/underscore delimited 
    words into camel casing. The first word within the output should be capitalized 
    only if the original word was capitalized (known as Upper Camel Case, also 
    often referred to as Pascal case). The next words should be always capitalized.
    
    Examples:
        "the-stealth-warrior" gets converted to "theStealthWarrior"
        "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
        "The_Stealth-Warrior" gets converted to "TheStealthWarrior"

'''

import re

def to_camel_case(text):
    text = [i.title() if pos != 0 else i for pos, i in enumerate(re.split('_|-', text))]
    return ''.join(text)