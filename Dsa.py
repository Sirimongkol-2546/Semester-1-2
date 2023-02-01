"""LAB2 DSA"""
class DataNode:
    def __init__(self, input_name=""):
        self.name = input_name
        self.next = None

class SinglyLinkedList:
    def __init__(self):
        self.count = 0
        self.head = None
    
    def traverse(self):
        if self.head == None:
            print("This is an empty list.")
        else:
            pos = self.head
            while pos != None:
                print("->", pos.name, end="")
                pos = pos.next
            print("")
        return
    
    def insertFront(self, data):
        pNew = DataNode(data) #build data node
        if self.head == None: #check empty list
            self.head = pNew #เอามาต่อท้าย
        else:
            pNew = DataNode(data)
            pNew.next = self.head # ชี้ไปที่ node ต่อไป
            self.head = pNew # root ชี้มาที่ตัวที่แทรก
        self.count += 1
        return
    
    def insertLast(self, data):
        pNew = DataNode(data)
        if self.head == None:
            self.head = pNew
        else:
            start = self.head
            while start.next != None:
                start = start.next
            start.next = pNew
        self.count += 1
        return
    
    def insertBefore(self, node, data):
        pNew = DataNode(data)
        start = self.head
        while start != None:
            if start.name == node:
                break
            start = start.next
        else:
            print("Cannot insert <node> dose not exit.")

        if self.head == start:
            pNew.next == self.head
            self.head = pNew
        else:
            prev = self.head
            while prev.next != start:
                prev = prev.next # เขยิบไปเรื่อยๆ เจอstart แล้วออกจาก loop
            pNew.next = start 
            prev.next = pNew
            self.count += 1
        return

    def delete(self, data):
        start = self.head
        if self.head == None:
            print("Cannot delete, <data> dose not exist.")
        else:
            if self.head == data:
                self.head = self.head.next
                self.count -= 1

        while start.next != None:
            if start.next.name == data:
                start.next = start.next.next
                self.count -= 1
            start = start.next
        return

mylist = SinglyLinkedList() #root node

pNew = DataNode("John")
mylist.head = pNew
print(mylist.head.name)

pNew = DataNode("Tony")
mylist.head.next = pNew
print(mylist.head.next.name)

mylist.insertFront("[Insert: Bill]")
mylist.insertLast("[Insert Last: Alex]")
mylist.insertBefore("Toy", "[Insert: Kim]")
mylist.traverse()

mylist.delete("John")

mylist.traverse()