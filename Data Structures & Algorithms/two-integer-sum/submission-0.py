class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        n=len(nums)
        dic={}
        for i in range(n):
            complement= target-nums[i]
            if complement in dic:
                return [dic[complement],i]
            dic[nums[i]]=i
