class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        
        # Sorting Methode (brute force)

        # freq = Counter(nums)
        # items = list(freq.items())
        # def getFreq(pair):
        #     return pair[1]
        # items.sort(key = getFreq,reverse=True)
        # result = []
        # for i in range(k):
        #     result.append(items[i][0])
        # return result


        # Heap Methode (Better)

        # freq = Counter(nums)
        # heap=[]

        # for num,count in freq.items():
        #     heapq.heappush(heap,(count,num))

        #     if len(heap)>k :
        #         heapq.heappop(heap)
        # ans = []
        # while heap:
        #     ans.append(heapq.heappop(heap)[1])

        # return ans


        # Bucket Sort (Most optimal)

        freq = Counter(nums)

        bucket = [ [] for _ in range(len(nums)+1)]

        for num,count in freq.items():
            bucket[count].append(num)

        ans = []

        for i in range(len(bucket)-1,-1,-1):
            for num in bucket[i]:
                ans.append(num)
                if len(ans)==k:
                    return ans
        return ans

               