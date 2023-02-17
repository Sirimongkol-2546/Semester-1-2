class ArrayStack:
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
        else:
            return self.data.pop()
    
    def stackTop(self):
        if self.data == []:
            return None
        else:
            return self.data[-1]

    def printStack(self):
        print(self.data)
        return

def copystack(stack1, stack2):
    """Lab 4.2"""
    stack3 = ArrayStack()
    while stack2.is_empty() != True:
        stack2.pop()

    while stack1.is_empty() != True:
        x = stack1.pop()
        stack3.push(x)

    while stack3.is_empty() != True:
        y = stack3.pop()
        stack1.push(y)
        stack2.push(y)

s1 = ArrayStack()
s2 = ArrayStack()

s1.push(10), s1.push(20), s1.push(30)
s2.push(50), s2.push(40)

copystack(s1,s2)
s2.printStack()
s1.printStack()
