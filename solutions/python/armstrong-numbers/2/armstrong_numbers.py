def is_armstrong_number(number):
    num_to_str = str(number)
    som = 0

    for i in num_to_str:
        som += int(i) ** len(num_to_str)

    return  som == number
