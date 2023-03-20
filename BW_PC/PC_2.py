def student_func(x):

    isThree = False
    isFive = False
    if(x % 3 == 0):
        isThree = True
    if(x % 5 == 0):
        isFive = True
    
    if(isThree and isFive):
        return "threefive"
    elif(isThree):
        return "three"
    elif(isFive):
        return "five"
    else:
        return x

print(student_func(135))
