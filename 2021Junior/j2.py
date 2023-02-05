# Return who is the first to bid the most.

userInput = input()
userInput = userInput.split(" ")

count = 0
score = 0
name = ""

for i in range(int(userInput[0])):
    count += 2
    print(score)
    print(userInput[count])
    if score < int(userInput[count]):
        score = int(userInput[count])
        name = userInput[count - 1]

print(name)

>>> 3 Ahmed 300 Suzanne 500 Ivona 450
    Ivona
