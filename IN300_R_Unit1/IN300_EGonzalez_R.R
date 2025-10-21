# ask for three numbers
firstNumber <- as.numeric(readline(prompt = "Enter first number: "))
secondNumber <- as.numeric(readline(prompt = "Enter second number: "))
thirdNumber <- as.numeric(readline(prompt = "Enter third number: "))


# calculate the sum and average 
sum <- firstNumber + secondNumber + thirdNumber

COUNT <- 3 # constant-like variable
average <- sum / COUNT


# check if sum is a whole number 
if (sum %% 1 == 0 ) { 
  cat ("The sum is:", as.integer(sum), "\n")
} else {
    cat ("The sum is:", sum, "\n")
  }

# check if average is a whole number 
if (average %% 1 == 0 ) { 
  cat ("The average is:", as.integer(average), "\n")
} else {
  cat ("The average is:", average, "\n")
}
