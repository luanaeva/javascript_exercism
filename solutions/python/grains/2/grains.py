import math

def square(number):
    if number > 0 and number < 65:
        return int(math.pow(2, number-1))
    
    raise ValueError("square must be between 1 and 64")


def total():
    return 2**64 - 1