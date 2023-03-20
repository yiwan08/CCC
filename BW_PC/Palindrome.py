def student_func(x):
  
    list1 = []
    list2 = []
    
    for i in range(len(x)):
        if(x[i] != " "):
            list1.append(x[i].lower())
    for i in range(1, len(x)+1):
        if(x[-i] != " "):
          list2.append(x[-i].lower())

    print(list1)
    print(list2)
  
    if (list1 == list2):
        return True
    return False

print(student_func())
