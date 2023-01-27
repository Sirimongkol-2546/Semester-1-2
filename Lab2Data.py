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
            pNew = DataNode("Bill")
            pNew.next = self.head
            self.head = pNew
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

        return

    # def delete(self, data):
    #     if self.head == None:
    #         print("Cannot delete, <data> dose not exist.")
    #     else:
            

mylist = SinglyLinkedList() #root node

pNew = DataNode("John")
mylist.head = pNew
print(mylist.head.name)

pNew = DataNode("Tony")
mylist.head.next = pNew
print(mylist.head.next.name)

mylist.insertFront("Bill")
mylist.insertLast("Someone")


mylist.traverse()