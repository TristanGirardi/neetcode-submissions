class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        my_map = {}
        arr=[]
        for i in range(len(nums)):
            goal = target - nums[i]
            if goal not in my_map:
                my_map[nums[i]] = i
            else:
                arr.append(my_map[goal])
                arr.append(i)
                break
        return arr 
        