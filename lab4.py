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


def is_parentheses_matching(expression):
    """Lab 4.1"""
    my_stack1 = ArreyStack()
    for str in expression:
        if str == "(":
            my_stack1.push(str)
        elif str == ")" and my_stack1.stackTop == "(":
            my_stack1.pop()
        else:
            if my_stack1.is_empty():
                return False

def copystack(stack1, stack2):
    return

print(is_parentheses_matching("((A+B)*C"))