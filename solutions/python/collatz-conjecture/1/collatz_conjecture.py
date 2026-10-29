def steps(number):
    counter = 0
    while number != 1:
        if number <= 1:
            raise ValueError("Only positive integers are allowed")
        else:
            if number % 2 == 0:
                number = number / 2
                counter = counter + 1
            else:
                number = number * 3 + 1
                counter = counter + 1
            
    return counter
