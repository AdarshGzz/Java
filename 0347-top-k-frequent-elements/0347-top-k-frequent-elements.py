class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        # freq = Counter(nums)
        # items = list(freq.items())
        # def getFreq(pair):
        #     return pair[1]
        # items.sort(key = getFreq,reverse=True)
        # result = []
        # for i in range(k):
        #     result.append(items[i][0])
        # return result


        freq = Counter(nums)
        heap=[]

        for num,count in freq.items():
            heapq.heappush(heap,(count,num))

            if len(heap)>k :
                heapq.heappop(heap)
        ans = []
        while heap:
            ans.append(heapq.heappop(heap)[1])

        return ans

        