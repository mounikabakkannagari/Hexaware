class P:
    def __init__(self,f_name,l_name):
        self.f_name=f_name
        self.l_name=l_name
    def display(self):
        print("firstname:",self.f_name,"lastname:",self.l_name)

class C(P):
    def __init__(self,f_name,l_name):
       P.__init__(self,f_name,l_name)


c=C("Mounika","bakkannagari")
c.display()