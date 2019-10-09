# Simple Algorithm
def gcd(m,n):
    fm = []
    for i in range(1, m+1):
        if m%i == 0:
            fm.append(i)
    
    fn = []
    for i in range(1, n+1):
        if n%i == 0:
            fn.append(i)
    
    fx = []
    for f in fm:
       if f in fn:
           fx.append(f)
    
    return fx[-1]

if __name__ == "__main__":
    print("{}".format(gcd(4,5)))