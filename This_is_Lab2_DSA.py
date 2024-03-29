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
        start = self.head
        prev = self.head.next

        if self.head.name == node:
                pNew.next = start
                self.head = pNew
                self.count += 1
                return

        if prev.next == None and prev.next.name == data:
                pNew.next = prev.next
                start.next.next = pNew
                return

        while prev != None:
            if prev.name == node:
                pNew.next = prev
                start.next = pNew
                self.count += 1
            start = start.next
            prev = prev.next

        if prev == None and start.name != data:
            print("Cannot insert,", node, "does not exist.")
        return

    def delete(self, name):
        start = self.head
        prev = self.head.next
        if self.head == None:
            print('Cannot delete, ' + name + ' does not exist')

        elif start.name == name:
                self.head = prev
                self.count -= 1
                return

        while prev.next != None:
            if prev.name == name:
                start.next = prev.next
                self.count -= 1
                break
            start = start.next
            prev = prev.next
            
            if prev.next == None and prev.name != name:
                print('Cannot delete, ' + name + ' does not exist')
                break
        
        if prev.next == None and prev.name == name:
            start.next = None
        return

mylist = SinglyLinkedList() #root node

pNew = DataNode("John")
mylist.head = pNew
#print(mylist.head.name)

pNew = DataNode("Tony")
mylist.head.next = pNew
#print(mylist.head.next.name)

mylist.insertFront("Bill")
mylist.traverse()

mylist.insertLast("Alex")
mylist.traverse()

mylist.insertBefore("Bll", "Kim")
mylist.traverse()

mylist.delete("Alex")
mylist.traverse()
