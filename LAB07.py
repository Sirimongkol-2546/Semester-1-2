from time import time
import random

"""Check time"""
def analyze_algo(n=1):
    stime = time() # record the starting time
    summation_2(n) # call summation(n)
    etime = time() # record the ending time
    elapsed = etime-stime # compute the elapsed time
    print("execution time: ", elapsed)

"""7.1"""
def summation_1(n):
    total = 0
    for i in range(1, n+1):
        total += i
    print(total)

def summation_2(n):
    total = (n*(n+1))/2
    print(total)

"""7.2"""
def isIntersect_n2(n): # n = size of list
    list_a = []
    list_b = []
    list_c = []
    intersect = []

    for i in range(n):
        list_a.append(random.randint(1, 100))
        list_b.append(random.randint(1, 100))
        list_c.append(random.randint(1, 100))
    print(list_a, list_b, list_c)
    
    intersect = [i for i in list_a if i in list_b and i in list_c]
    print(intersect)
    print(bool(intersect))

def isIntersect_n3(n):
    list_a = []
    list_b = []
    list_c = []
    intersect = []

    for i in range(n):
        list_a.append(random.randint(1, 100))
        list_b.append(random.randint(1, 100))
        list_c.append(random.randint(1, 100))
    
    intersect = [i for i in list_a if i in list_b]
    intersect2 = [i for i in intersect if i in list_c]
    # print(intersect2)
    print(bool(intersect is intersect2))

def analyze_intersection_n2(n=1):
    stime = time() # record the starting time
    isIntersect_n2(n) # call summation(n)
    etime = time() # record the ending time
    elapsed = etime-stime # compute the elapsed time
    print("execution time: ", elapsed)

def analyze_intersection_n3(n=1):
    stime = time() # record the starting time
    isIntersect_n3(n) # call summation(n)
    etime = time() # record the ending time
    elapsed = etime-stime # compute the elapsed time
    print("execution time: ", elapsed)

analyze_intersection_n3(1000)