# Get the maximum enemy Y and minimum enemy Y basing on Pacman's Y level 
# get the maximum enemy X and minimum enemy X basing on Pacman's X position
#
# The lower the Y level, the higher the enemy (viceversa)

def pac_man(n, pm, enemies):
    py, px = pm
    enemy_pos = {'max_y': 0, 'min_y': 0,
                 'max_x': 0, 'min_x': 0}
    
    print(f'Pacman: {pm}')
    for y, x in enemies:
        if enemy_pos['max_y'] < y > py:
            enemy_pos['max_y'] = y
        if enemy_pos['min_y'] > y < py:
            enemy_pos['min_y'] = y
        print(f'Enemy: {y} {x}')
    print(enemy_pos)
    
    # Printing
    print()


    # field = [[0 for i in range(n)] for i in range(n)]
    # py, px = pm
    # field[py][px] = "P"

    # coins = 0

    # for i in range(len(enemies)):
    #     ey, ex = enemies[i]
    #     field[ey] = [1 for i in field[ey]]
    #     for j in field:
    #         j[ex] = 1

    # Print
    # for i in field:
    #     print(''.join(map(str, i)))
    # print(f'Coins: {coins - 1}\n')

pac_man(4, [3, 0], [[1, 2]])
pac_man(10,[4, 6],[[0,2], [5,2], [5,5]])