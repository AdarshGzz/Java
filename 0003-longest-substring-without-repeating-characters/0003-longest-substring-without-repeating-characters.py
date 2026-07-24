class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        n = len(s)
        longest = 0
        u = set()

        left = 0
        for right in range(n):
            char = s[right]

            while char in u:
                left_char = s[left]
                u.remove(left_char)
                left+=1

            u.add(char)
            longest = max(longest,right-left+1)
        
        return longest