'''

Challenge: (4kyu) Snail
https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1/python

Description:
    Snail Sort
    
    Given an n x n array, return the array elements arranged from 
    outermost elements to the middle element, traveling clockwise.
        array = [[1,2,3],
                [4,5,6],
                [7,8,9]]
        snail(array) #=> [1,2,3,6,9,8,7,4,5]

    For better understanding, please follow the numbers of the next array consecutively:
        array = [[1,2,3],
                [8,9,4],
                [7,6,5]]
        snail(array) #=> [1,2,3,4,5,6,7,8,9]
    
    NOTE: The idea is not sort the elements from the lowest value to the highest; 
          the idea is to traverse the 2-d array in a clockwise snailshell pattern.
    NOTE 2: The 0x0 (empty matrix) is represented as en empty array inside an array [[]].

'''

def snail(snail_map):
    
    res = list([])
    
    while len(snail_map) > 0:
        
        # Right to Left
        res += snail_map[0]
        snail_map.pop(0)
        
        if len(snail_map) > 0:
            # Down
            for row in snail_map:
                res.append(row.pop(len(row) - 1))
                
            # Left to Right
            res += snail_map[-1][::-1]
            snail_map.pop(-1)
            
            # Up
            for row in reversed(snail_map):
                res.append(row.pop(0))
        
    return res