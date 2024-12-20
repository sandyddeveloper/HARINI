def calculate_mean(numbers):
    return sum(numbers) / len(numbers)

def calculate_median(numbers):
    numbers.sort()
    n = len(numbers)
    mid = n // 2
    if n % 2 == 0:
        return (numbers[mid - 1] + numbers[mid]) / 2
    else:
        return numbers[mid]

def calculate_mode(numbers):
    frequency = {}
    for num in numbers:
        frequency[num] = frequency.get(num, 0) + 1
    max_freq = max(frequency.values())
    modes = [key for key, value in frequency.items() if value == max_freq]
    return modes[0] if len(modes) == 1 else modes

def calculate_averages(numbers):
    avg_mean = calculate_mean(numbers)
    avg_median = calculate_median(numbers)
    avg_mode = calculate_mode(numbers)

    print(f"Mean: {avg_mean}")
    print(f"Median: {avg_median}")
    print(f"Mode: {avg_mode}")

if __name__ == "__main__":
    numbers = [1, 2, 3, 4, 4, 5, 6, 7]
    calculate_averages(numbers)


### Output:
For the list `[1, 2, 3, 4, 4, 5, 6, 7]`, the program will output:
```
Mean: 4.0
Median: 4.0
Mode: 4
``` 

