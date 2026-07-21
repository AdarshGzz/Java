class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        # Brute force (o(n^2))

        # ans = []

        # for i in range(len(nums)):
        #     product = 1
        #     for j in range(len(nums)):
        #         if i != j:
        #             product *= nums[j]
        #     ans.append(product)

        # return ans



        # Prefix + Running Suffx

        n = len(nums)
        ans = [1] * n

        prefix = 1        
        for i in range(n):
            ans[i] = prefix
            prefix *= nums[i]

        suffix = 1
        for i in range(n-1,-1,-1):
            ans[i] *= suffix
            suffix *= nums[i]

        return ans