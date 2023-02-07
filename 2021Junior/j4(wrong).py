# Order in L-M-S, output number of swops.
# This version is wrong, but just wanna leave a record for this piece of shit.

userInput = input()
bookOrder = ["L", "M", "S"]
count = 0
temp = []
result = list(userInput)
myString = ""

for i in range(len(userInput) - 1):
    
    current = userInput[i]
    after = userInput[i + 1]
    temp = [current, after]
    
    if(current != after):
        for j in range(3):
            if(bookOrder[j] == current):
                indexCurrent = j
        for k in range(3):
            if(bookOrder[k] == after):
                indexAfter = k
        
        if(indexCurrent > indexAfter):
            result[i] = after
            result[i + 1] = current
            for x in result:
                myString += x
            userInput = myString
            count += 1
    
print(count)
