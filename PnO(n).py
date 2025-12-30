nums = [2,1,2,2,2,2,2,3]
 
val = 2

i = 0
k= len(nums)-1
while i <=k:
    if nums[i]==val:
        nums[i],nums[k]=nums[k],nums[i]
        k=k-1
        
    else:
        i=i+1
 
print(nums)
