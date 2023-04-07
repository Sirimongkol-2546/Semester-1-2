"""LAB 09 Sorting"""

def insertionSort(list, last):
    compare = 0
    current = 1
    while current <= last: # ทำตัวนอกก่อน
        hold = list[current]
        walker = current - 1
        compare += 1
        while walker >= 0 and hold < list[walker]:
            # move walker right
            list[walker + 1] = list[walker]
            walker -= 1
            compare += 1
        # move hold to walker + 1
        list[walker + 1] = hold # insert ข้อมูลใน sorted list 
        current += 1
        if walker < 0:
            compare -= 1
        print(list)
    print("Insertion Comparison times:", compare)
    return

def selectionSort(list, last):
    compare = 0
    current = 0
    while current <= last:
        smallest = current
        walker = current + 1
        while walker <= last:
            if list[walker] < list[smallest]: 
                smallest = walker 
            walker += 1
            compare += 1
        temp = list[current]
        list[current] = list[smallest]
        list[smallest] = temp
         
        current += 1   
        print(list)
    print("Selection Comparison times:", compare)
    return

def bubbleSort(list, last):
    current = 0
    compare = 0
    sort = False
    while (current <= last and sort is False):
        walker = last 
        sorted = True 
        while (walker > current):
            if (list[walker] < list[walker-1]):
                sort = False
                #exchange (walker, walker-1)
                temp = list[walker]
                list[walker] = list[walker - 1]
                list[walker - 1] = temp
            walker -= 1
            compare += 1
        current += 1
        print(list)
    print("Buble Comparison times:", compare)
    return


insertionSort([23, 78, 45, 8, 32, 56], 5)
insertionSort([2, 1, 3, 4, 5, 6], 5)
insertionSort([503, 87, 512, 61, 908, 170, 897, 275, 653, 426, 154, 765, 703], 12)

print("-------------------------------")

selectionSort([23, 78, 45, 8, 32, 56], 5)
selectionSort([2, 1, 3, 4, 5, 6], 5)
selectionSort([503, 87, 512, 61, 908, 170, 897, 275, 653, 426, 154, 765, 703], 12)

print("-------------------------------")

bubbleSort([23, 78, 45, 8, 32, 56], 5)
bubbleSort([2, 1, 3, 4, 5, 6], 5)
bubbleSort([503, 87, 512, 61, 908, 170, 897, 275, 653, 426, 154, 765, 703], 12)


# test2 = [23, 78, 45, 8, 32, 56]
# selectionSort(test2,5)

# test3 = [23, 78, 45, 8, 32, 56]
# bubbleSort(test3, 5)