class cal:
    def addi(self,a,b):
        print(a+b);
        return a+b;
class myCal:
    def sub(self,a,b):
        print(a-b);
class cal2(myCal,cal):
    def multi(self,a,b):
        print(a*b);


c=cal2();
c.multi(10,20);
c.sub(45,30);
c.addi(100,25);
print(c.addi(200,566));