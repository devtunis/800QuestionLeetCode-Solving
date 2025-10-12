input_string =""
stack = []
for c in input_string:
    if c == '(':
        stack.append(c)    
    elif c == ')':
        if not stack:
            print("❌")
            break
        stack.pop()       

if not stack:
    print("✅")
else:
    print("❌")

