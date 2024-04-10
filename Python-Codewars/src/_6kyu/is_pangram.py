'''

Challenge: (6kyu) Detect Pangram
https://www.codewars.com/kata/545cedaa9943f7fe7b000048

Description:
  A pangram is a sentence that contains every single letter of the alphabet at 
  least once. For example, the sentence "The quick brown fox jumps over the lazy dog" is a 
  pangram, because it uses the letters A-Z at least once (case is irrelevant).

  Given a string, detect whether or not it is a pangram. Return True if it is, 
  False if not. Ignore numbers and punctuation.

'''

import string

def is_pangram(s: str) -> bool:
    
    pangram_check = dict({(i, 0) for i in string.ascii_lowercase})
    s = filter(lambda x: x in string.ascii_letters, s)
    
    for let in s:
        if let.lower() in string.ascii_lowercase:
            pangram_check[let.lower()] += 1
    
    return False if min(pangram_check.values()) == 0 else True
    
print(is_pangram("Cwm fjord bank glyphs vext quiz"))