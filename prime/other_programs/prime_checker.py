import sys

file_name = sys.argv[1]


def is_prime(n: int) -> bool:
    for m in range(3, n - 1):
        if n % m == 0:
            return False
    return True


with open(file_name) as input_numbers:
    for line in input_numbers:
        number = int(line)
        print(1 if is_prime(number) else 0)
