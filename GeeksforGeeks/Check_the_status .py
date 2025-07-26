class Solution:
    def checkStatus(self, a, b, flag):
        # code here
        if(a>0) and (flag == False) and b<0:
            return True
        elif(b>0 and flag == False and a<0):
            return True
        elif(a<0 and b<0 and flag == True):
            return True
        else:
            return False
