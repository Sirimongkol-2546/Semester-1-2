class ArreyStack:
    def __init__(self, name=''):
        self.data = []

    def size(self):
        return len(self.data)

    def is_empty(self):
        if len(self.data) == 0:
            return True
        else:
            return False
    
    def push(self, input_data):
        return self.data.append(input_data)

    def pop(self):
        if self.data == []:
            print("Underflow: Cannot pop data  from an empty list.")
            return None
        else:
            self.data.pop()
        return
    
    def stackTop(self):
        if self.data == []:
            return None
        else:
            return self.data[-1]

    def printStack(self):
        print(self.data)
        return


mylist = ArreyStack()

# mylist.push(10)
# mylist.push(20)
# mylist.push(30)
# print(mylist.stackTop())
# print(mylist.is_empty())
# print(mylist.size())
# mylist.pop()
# mylist.printStack()

    