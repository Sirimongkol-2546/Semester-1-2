"""LAB 9 DATA"""

def insertionSort(list, last):
    current = 1
    for i in range(1, last + 1):
        key = list[i]
        j = i - 1 # walker ขยับไปเรื่อยๆ   
        while j >= 0 and key < list[j]:
            list[j + 1] = list[j] # เคลื่อน walker ไปทางขวา
            j -= 1 # ลดค่า walker
            current += 1
        list[j + 1] = key # walker + 1
        print(list)
    print("Comparison:", current)
    return

def selectionSort(list, last):
    
    return

def bubbleSort(list, last):
    current = 0
    for i in range(len(list)-1, 0, -1):
        for j in range(i):
            if list[j] > list[j+1]:
                temp = list[j]
                list[j] = list[j+1]
                list[j+1] = temp
            current += 1
        print(list)
    print("Comparison:", current)
    return


# test1 = [23, 78, 45, 8, 32, 56]
# insertionSort(test1, 5)

test3 = [23, 78, 45, 8, 32, 56]
bubbleSort(test3, 5)