from turtle import st


class BSTNode: # Node
    def __init__(self,input_data): # รับ data เข้ามา
        self.data = input_data
        self.left = None
        self.right = None

class BST: # Trees
    def __init__(self): # ต้องมี root
        self.root = None

    def is_empty(self):
        if self.root == None:
            return True
        else:
            return False

    def preorder(self, root):
        if root != None:
            print("->", root.data, end=" ")
            self.preorder(root.left)
            self.preorder(root.right)
        return

    def inorder(self, root):
        if root != None:
            self.inorder(root.left)
            print("->", root.data, end=" ")
            self.inorder(root.right)
        return

    def postorder(self, root):
        if root != None:
            self.postorder(root.left)
            self.postorder(root.right)
            print("->", root.data, end=" ")
        return
    
    def traverse(self):
        if self.is_empty():
            print("This is an empty tree!!")
        else:
            # Pre In Post เป็นฟังก์ชันที่อยู่ใน class ต้องเรียกผ่าน self
            # ต้องป้อน root เข้าไปด้วย
            print("\nPreorder: ")
            self.preorder(self.root)
            print("\nInorder: ")
            self.inorder(self.root)
            print("\nPostorder: ")
            self.postorder(self.root)

    def insert(self, data):
        pNew = BSTNode(data)
        prev = None
        start = self.root
        if self.is_empty():                     # กรณี empty tress -> โหนดจะเป็น root
            self.root = pNew
        else:
            # วิ่งตามต้นไม้ ค่่าน้อยกว่า -> ไปซ้าย ค่ามากกว่า -> ไปขวา เทียบกับตัวโหนดของต้นไม้ มี pointer ช่วยในการวิ่ง
            # วิ่งขวาอย่างเดียว
            while start != None:
                if data < start.data:           # 25 < 10 -> วิ่งขวา
                    prev = start
                    start = start.left
                else:
                    prev = start                # ชี้ที่เดียวกับ start
                    start = start.right         # start วิ่งขวาต่อ
            if data < prev.data:
                prev.left = pNew
            else:
                prev.right = pNew
            return

    
    def delete(self, data):
        prev = None
        start = self.root
        
        if self.is_empty():
            return None
        
        while start != None:
            if data < start.data:          
                prev = start
                start = start.left
            else:
                prev = start                
                start = start.right         
        
        # Case 1
        if start.left == None and start.right == None:
            prev.left = start
            prev.left = None
        else:
            prev.right = None

        # Case 2
        # ฝั่งซ้ายไม่ว่าง
        if start.left != None and start.right == None:
            if prev.right == start:
                prev.left = start
                prev.right = start.left
            else:
                prev.right = start.right

        #ฝั่งขวาไม่ว่าง
        if start.left == None and start.right != None:
            if prev.left == start:
                prev.right = start
                prev.left = start.left
            else:
                prev.left = start.right
        return

    def findMin(self):
        start = self.root
        while start.left != None:
            start = start.left
        return start.data

    def findMax(self):
        start = self.root
        while start.right != None:
            start = start.right
        return start.data



my_BST = BST()
my_BST.insert(14)
my_BST.insert(23)
my_BST.insert(7) 
my_BST.insert(10)
my_BST.insert(33)
my_BST.insert(5)
my_BST.insert(20)
my_BST.insert(13)
my_BST.traverse()

# my_BST.delete(33)
# my_BST.traverse()


# print("\n---------------------")
# print("Min: ")
# print("->", my_BST.findMin())
# print("Max: ")
# print("->", my_BST.findMax())
