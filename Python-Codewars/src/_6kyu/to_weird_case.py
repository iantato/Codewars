'''

Challenge: (6kyu) WeIrD StRiNg CaSe
https://www.codewars.com/kata/52b757663a95b11b3d00062d

Description:
    Write a function that accepts a string, and returns the same string with all 
    even indexed characters in each word upper cased, and all odd indexed characters 
    in each word lower cased. The indexing just explained is zero based, 
    so the zero-ith index is even, therefore that character should be upper cased 
    and you need to start over for each word.

    The passed in string will only consist of alphabetical characters and spaces(' '). 
    Spaces will only be present if there are multiple words. Words will be 
    separated by a single space(' ').
    
    Examples:
        "String" => "StRiNg"
        "Weird string case" => "WeIrD StRiNg CaSe"

'''

def to_weird_case(words):
        
    index = 0
    new_word = ""
    
    for let in words:
        
        if let == " ":
            index = -1
            new_word += let
        if index % 2 == 0:
            new_word += let.upper()
        else:
            new_word += let.lower()
        
        index += 1
    
    return " ".join(new_word.split())