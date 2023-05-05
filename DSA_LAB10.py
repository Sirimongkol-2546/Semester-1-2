class Item:
    def __init__(self, name, price, weight):

        self.name = name
        self.price = price
        self.weight = weight
        
    def getName(self):
        return self.name   
    
    def getPrice(self):
        return self.price
      
    def getWeight(self):
        return self.weight
      
    def getCost(self):
        return self.price / self.weight
    
def knapsack(num, item):
    item.sort(key = lambda x: x.getCost(), reverse = True)
    list = []
    sumnum = 0
    lostweight = num
    for item in item:
        if lostweight >=item.getWeight():
            list.append(item)
            sumnum += item.getPrice()
            lostweight -= item.getWeight()
    print("Knapsack Size: %s kg" %num)
    print("===============================")
    for item in list:
        print("%s -> %s kg -> %s THB" %(item.getName(),item.getWeight(),item.getPrice()))
    print("Total: %s THB" %sumnum)

def coinExchange(amount, coinList):
    ans = [0, 0, 0, 0]
    total = coinList[0] + coinList[1] + coinList[2] + coinList[3]
    check = coinList[0]*10 + coinList[1]*5 + coinList[2]*2 + coinList[3]*1
    while amount > 0:
        if check < amount:
            print("Coins are not enough")
            print(check)
            break
        else:
            if amount-10 >= 0 and coinList[0] > 0:
                ans[0] += 1
                coinList[0] -= 1
                amount -= 10

            elif amount-5 >= 0 and coinList[1] > 0:
                ans[1] += 1
                coinList[1] -= 1
                amount -= 5

            elif amount-2 >= 0 and coinList[2] > 0:
                ans[2] += 1
                coinList[2] -= 1
                amount -= 2

            elif amount-1 >= 0 and coinList[3] > 0:
                ans[3] += 1
                coinList[3] -= 1
                amount -= 1

    num = ans[0] + ans[1] + ans[2] + ans[3]
    print(ans)
    print("number of coins :", num)

coinList = [10, 10, 10, 10]
coinExchange(127, coinList)

item1 = Item('tablet', 7000, 0.5)
item2 = Item('perfume', 6000, 0.5)
item3 = Item('guitar', 9000, 1)
item4 = Item('air purifier', 9000, 2)
item5= Item('watch', 8000, 0.5)
item = [item1, item2, item3,
item4, item5]
knapsack(3, item)