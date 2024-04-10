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