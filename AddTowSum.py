nums = [2,7,11,15]
target = 18-1
 
start  = 0 
end = len(nums)-1
 
while start <end  :
    if (nums[start]+nums[end]==target):
        print(nums[start],"+",nums[end],"=",target)
        break
     
    elif nums[start]+nums[end] >target:
        end = end -1
    elif nums[start]+nums[end]<target:
        start=start+1
 
