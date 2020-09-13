a=input('enter the charcter')
a=ord(a)
if(a>=97 and a<=122):
    print('it is lowercase alphabet')
elif(a>=65 and a<=90):
    print('it is uppercase alphabet')
elif(a>=48 and a<=57):
    print('it is digits')
else :
    print('it is special charcter')
    
    
