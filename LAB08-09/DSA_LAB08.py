"""LAB 08 Hashing"""
class Student:
    def __init__(self, id, name, gpa):
        self.id = id
        self.name = name
        self.gpa = gpa

    def getId(self):
        return self.id

    def getName(self):
        return self.name
    
    def getGpa(self):
        return self.gpa
    
    def printDetail(self):
        return print("ID: " + str(self.id) + "\nName: " + self.name + "\nGPA: " + str(self.gpa))

class ProbHash:
    def __init__(self, cap):
        self.hashtable = cap*[None]
        self.n = cap
    
    def hashFuntion(self, mykey):
        index = mykey % self.n
        return index
    
    def rehashFunction(self, hashkey):
        return (hashkey + 1) % self.n
    
    def insertData(self, student_obj):
        index = self.hashFuntion(student_obj.getId()) #-> เอา ID ไป %
        key = student_obj.getId()
        h = self.hashFuntion(key)
        while self.hashtable[h] is not None and self.hashtable[h].getId() != key:
            h = self.rehashFunction(h)
            if h == self.hashFuntion(key):
                print(str(key) + " could not be inserted.")
                return

        while self.hashtable[index] != None:
            #ถ้าช่องไม่ว่างให้ rehash
            index = self.rehashFunction(index)


        self.hashtable[index] = student_obj
        print("Insert " + str(self.hashtable[index].getId()) + " at index " + str(index))
        return
    
    def searchData(self, std_id):
        index = self.hashFuntion(std_id)
        time = 0
        # while std_id != self.hashtable[index].getId() and time != self.n and self.hashtable[index] != None:
        while self.hashtable[index] != None and std_id != self.hashtable[index].getId() and time != self.n:
            index = self.rehashFunction(index)
            time += 1
        #กรณีไม่เจอ
        if self.hashtable[index] == None or time == self.n:
            print(str(std_id) + " does not exist.")
        else:
            print("Found " + str(std_id) + " at index " + str(index))
            return self.hashtable[index]

s1 = Student(65070001, "Sandee Boonmak", 3.05)
s2 = Student(65070077, "Somsak Jaidee", 2.78)
s3 = Student(65070021, "Somsri Jaiyai", 3.44)
s4 = Student(65070042, "Sommai Meeboon", 2.89)

myHash = ProbHash(3)
myHash.insertData(s1)
myHash.insertData(s2)
myHash.insertData(s3)
myHash.insertData(s4)

# print("-------------------------")
# std = myHash.searchData(65070077)
# std.printDetail()
# print("-------------------------")
# std = myHash.searchData(65070021)
# std.printDetail()
# print("-------------------------")
# std = myHash.searchData(65070042)
# std.printDetail()
# print("-------------------------")
# std = myHash.searchData(65070032)