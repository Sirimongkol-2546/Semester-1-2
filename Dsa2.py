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
    
    def insertBefore(self, node, data): #node is target name to insert
        pNew = DataNode(data)
        start = self.head #pointer1
        prev = self.head.next #pointer2

        if self.head == None:
            print("Cannot insert,", node, "does not exist.")
        #ตัวแรก
        else:
            if self.head.name == node:
                start = self.head
                pNew.next = start
                self.head = pNew
                self.count += 1

        #ตัวสุดท้ายยังไม่เป็น null
        while prev != None:

            if prev.name == node:
                pNew.next = prev
                start.next = pNew
                self.count += 1
            start = start.next
            prev = prev.next
        return
        
        # if self.head == None:
        #     print("Cannot insert,", node, "does not exist.")
        
        # elif start.name == node:
        #     pNew.next = start
        #     self.head = pNew
        #     self.count += 1
        
        # while prev.next == node:
        #     if prev.next == None:
        #         print("Cannot insert,", node, "does not exist.")

        #     elif prev.name == node:
        #         pNew.next = prev
        #         start.next = pNew
        #         self.count += 1
        #     start = start.next
        #     prev = prev.next
        # return

    def delete(self, data):
        start = self.head #pointer1
        prev = self.head.next #pointer2

        if self.head == None:
            print("Can not delete,", data, "dose not exist")
        else:
            if start.name == data:
                self.head = prev
                self.count -= 1

        #ลบระหว่าง
        while prev.next != None:
            if prev.name == data:
                start.next = prev.next
                self.count -= 1
            start = start.next
            prev = prev.next
        return 

    # def delete(self, name):
    #     pointer = self.head
    #     next_to = self.head.next
    #     if self.head == None:
    #         print('Cannot delete, ' + name + ' does not exist')

    #     elif pointer.name == name:
    #         self.head = next_to
    #         self.count -= 1
    #     while next_to.next != None:
    #         if next_to.name == name:
    #             pointer.next = next_to.next
    #             self.count -= 1
    #         pointer = pointer.next
    #         next_to = next_to.next
    #     if next_to.next == None:
    #         print('Cannot delete, ' + name + ' does not exist')
    #     return


mylist = SinglyLinkedList()

pNew = DataNode("AA")
mylist.head = pNew
pNew = DataNode("BB")
mylist.head.next = pNew

mylist.insertFront("CC")
mylist.insertLast("DD")
mylist.insertBefore("CC", "FF")
mylist.traverse()

mylist.delete("F")
mylist.traverse()