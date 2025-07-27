class Solution:
    def divideString(self, s: str, k: int, fill: str) -> List[str]:
        le = len(s)
        l = []
        for i in range(0, le, k):
            t = s[i:i+k]
            if len(t) < k:
                t += fill * (k - len(t))
            l.append(t)
        
        return l
