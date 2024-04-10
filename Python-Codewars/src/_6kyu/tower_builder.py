'''

Challenge: (6kyu) Build Tower
https://www.codewars.com/kata/576757b1df89ecf5bd00073b

Description:
    Build a pyramid-shaped tower, as an array/list of strings, given a positive 
    integer number of floors. A tower block is represented with "*" character.

    For example, a tower with 3 floors looks like this:
      [
      "  *  ",
      " *** ", 
      "*****"
      ]
    
    And a tower with 6 floors looks like this:
      [
      "     *     ", 
      "    ***    ", 
      "   *****   ", 
      "  *******  ", 
      " ********* ", 
      "***********"
      ]

'''

def tower_builder(n_floors: int) -> list[str]:
    
    tower = list()
    length = 1
    
    for i in range(n_floors):
        tower.append((" " * (n_floors - i - 1)) + ("*" * length) + (" " * (n_floors - i - 1)))
        length += 2
    
    return tower