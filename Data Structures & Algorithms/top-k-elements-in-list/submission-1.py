class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        nums.sort(reverse=True)
        dic={}
        lst=[]
        for i in range(len(nums)):
            if nums[i] in dic:
                dic[nums[i]]+=1
            else:
                dic[nums[i]]=1
        while k > 0:
            max_val = 0
            max_key = 0
            for key, value in dic.items():
                if value > max_val:
                    max_val = value
                    max_key = key
            lst.append(max_key)
            dic.pop(max_key)
            k -= 1
        return lst



            