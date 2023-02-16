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

def infixToPostfix(expression):
    """Lab 4.3"""
    operatorStack = ArrayStack()
    operandStack = ArrayStack()
    add = ArrayStack()
    ex = ''

    for i in expression:
        if i.isalpha():
            operandStack.push(i)
        else:
            if i == "*" or i == "/":
                operatorStack.push(i)
            elif i == "+" or i == "-" and operatorStack.stackTop() == "*" or operatorStack.stackTop() == "/":
                while operatorStack.is_empty() != True:
                    x = operatorStack.pop()
                    operandStack.push(x)
                operatorStack.push(i)
            elif i == "+" or i == "-" and operatorStack.stackTop() != "*" or operatorStack.stackTop != "/":
                operatorStack.push(i)

    while operatorStack.is_empty() != True:
        operandStack.push(operatorStack.pop())

    while operatorStack.is_empty() != True:
        add.push(operandStack.pop())

    while add.is_empty() != True:
        ex += add.pop()
    
    return ex
            
exp = "A+B*C-D/E"
postfix = infixToPostfix(exp)
print(postfix)