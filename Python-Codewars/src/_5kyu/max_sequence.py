'''

Challenge: (5kyu) Maximum subarray sum
https://www.codewars.com/kata/54521e9ec8e60bc4de000d6c

Description:
    The maximum sum subarray problem consists in finding the maximum sum of 
    a contiguous subsequence in an array or list of integers:
    max_sequence([-2, 1, -3, 4, -1, 2, 1, -5, 4])
    # should be 6: [4, -1, 2, 1]
  
    Easy case is when the list is made up of only positive numbers and the 
    maximum sum is the sum of the whole array. If the list is made up of only 
    negative numbers, return 0 instead.

    Empty list is considered to have zero greatest sum. Note that the 
    empty list or array is also a valid sublist/subarray.

'''

def max_sequence(arr: list[int]) -> int:
    
    if len(arr) == 0 or max(arr) < 0:
        return 0

    max_sum = 0
    curr_max = 0

    for i in range(0, len(arr)):
        curr_max = curr_max + arr[i]
        if curr_max < 0:
            curr_max = 0
            
        elif max_sum < curr_max:
             max_sum = curr_max
             
    return max_sum