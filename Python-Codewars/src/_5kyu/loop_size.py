'''

Challenge: (5kyu) Can you get the loop?
https://www.codewars.com/kata/52a89c2ea8ddc5547a000863/python

Description:
    You are given a node that is the beginning of a linked list. 
    This list contains a dangling piece and a loop. Your objective 
    is to determine the length of the loop.

    For example in the following picture the size of the 
    dangling piece is 3 and the loop size is 12:
    
    # Use the `next' attribute to get 
    # the following node 'node.next'
    
    NOTES:
    - do NOT mutate the nodes!
    - in some cases there may be only a loop, with no dangling piece
    - Thanks to shadchnev, I broke all of the methods from the Hash class.
    - Don't miss dmitry's article in the discussion after you pass the Kata !! 

'''

def loop_size(node):
    step = node
    nodes = {}
    
    ctr = 1
    while step.next not in nodes:
        step = step.next
        nodes[step] = ctr
        ctr += 1
    else:
        step = step.next
        
    return max(nodes.values()) + 1 - nodes.get(step)