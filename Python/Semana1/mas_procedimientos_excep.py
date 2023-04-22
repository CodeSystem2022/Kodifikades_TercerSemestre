result = None

try:
  firstNumber = int(input('Digit the first number: '))
  secondNumber = int(input('Digit the second number: '))
  result = firstNumber / secondNumber
except TypeError as e:
  print(f'TypeError - Throwing error: {type(e)}')
except ZeroDivisionError as e:
  print(f'TypeError - Throwing error: {type(e)}')
except Exception as e:
  print(f'TypeError - Throwing error: {type(e)}')

print(f'The result is: {result}')