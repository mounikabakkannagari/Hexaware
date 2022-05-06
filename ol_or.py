class P:
    def m1(self):
        print("m1")
    def m1(self):
        print("m2")

class C(P):
    pass
    #def m1(self):
     #   print("m3")

c=C()
c.m1()
