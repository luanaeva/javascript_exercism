def is_armstrong_number(number):
    num_to_str = str(number)
    sum = 0

    for i in num_to_str:
        sum += int(i) ** len(num_to_str)

    return  sum == number
