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

def is_parentheses_matching(expression):
    """Lab 4.1"""
    my_stack1 = ArrayStack()
    for i in expression:
        if i in ["("]:
            my_stack1.push(i)
        elif i in [")"] :
            if my_stack1.is_empty():
                return False
            if i == ")" and my_stack1.stackTop() == "(":
                my_stack1.pop()
            else:
                return False
    return my_stack1.is_empty()

print(is_parentheses_matching(" ((A+B)*C) "))