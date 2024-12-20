from statistics import mean, median, mode

def calculate_averages(numbers):
    avg_mean = mean(numbers)
    avg_median = median(numbers)
    avg_mode = mode(numbers)

    print(f"Mean: {avg_mean}")
    print(f"Median: {avg_median}")
    print(f"Mode: {avg_mode}")


if __name__ == "__main__":
    numbers = [1, 2, 3, 4, 4, 5, 6, 7]
    calculate_averages(numbers)
