# First 2 digits represent direction, keep last 3 digits.
# 00: follow previous instruction, 99999: end of the instruction.

userInput = input()
userInput = userInput.split()

temp = ""
direction = 0
previous = ""

for i in range(len(userInput)):
    temp = userInput[i]
    direction = int(temp[0]) + int(temp[1])
    if(temp == "99999"):
        break
    if(direction == 0):
        print(f"{previous} {temp[2::]}")
    elif(direction % 2 == 0):
        print(f"Right {temp[2::]}")
        previous = "Right"
    else:
        print(f"Left {temp[2::]}")
        previous = "Left"

>>> 57234 00907 34100 99999
  Right 234
  Right 907
  Left 100
