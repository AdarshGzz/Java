class Solution:
    def dailyTemperatures(self, temp: List[int]) -> List[int]:
        n = len(temp)
        stack = []
        ans = [0] * n

        for i in range(n):
            while stack and temp[stack[-1]]<temp[i]:
                idx = stack.pop()
                ans[idx] = i-idx
            stack.append(i)
        return ans
                

