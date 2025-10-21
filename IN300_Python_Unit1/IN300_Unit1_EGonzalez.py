# ask for three numbers
first_number = float(input("Enter first number: "))
second_number = float(input("Enter second number: "))
third_number = float(input("Enter third number: "))

# calculate the sum and average
sum_value = first_number + second_number + third_number

COUNT = 3 #constant like variable
average = sum_value / COUNT

# check sum for decimals
if sum_value % 1 == 0:
    print("The sum is: ", int(sum_value))
else: print("The sum is: ", sum_value)

# check average for decimals
if average % 1 == 0:
    print("The average is: ", int(average))
else: print("The average is: ", average)