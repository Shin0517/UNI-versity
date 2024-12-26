# author: Shin0517
class Solution(object):
    def majorityElement(self, nums):
        
        nums.sort() 
        # 不保留原本陣列
        n = len(nums)
        return nums[n//2]

class Solution(object):
    def majorityElement(self, nums):
        candidate = None
        count = 0

        for i in nums:
            if count == 0:
                candidate = i
                count = 1
            elif i == candidate:
                count += 1
            else:
                count -=1
        
        return candidate
    