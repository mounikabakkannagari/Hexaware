print("1 st program : sum of elements in list")
l=[10,20,30,40,50,60,70,80,90,100]
sum=0
for i in l:
    sum+=i
print("Sum is : " ,sum)

print("2 nd program : appending elemnets in list")
l1=[2,3,45,6,10,98]
l2=[]
for i in l1:
    if i not in l2:
        l2.append(i)

print(l2)

print(" 3rd program : taking input from user and appending")
m=[]
n=int(input("Enter the employee count"))
for i in range(n):

    temp=input("enter the names of employee")
    m.append(temp)
for i in m:
    print(i)
print("To remove any element from list")
l.remove(50)
print(l)
