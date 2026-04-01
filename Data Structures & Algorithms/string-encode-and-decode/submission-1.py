class Solution:

    def encode(self, strs: List[str]) -> str:
        res = ''
        for s in strs:
            encoded = str(len(s)) + '/' + s
            res += encoded
        return res
        
    def decode(self, s: str) -> List[str]:
        res, i = [], 0
        while i < len(s):
            # For example, 12/abc
            e = i
            while e < len(s) and s[e] != '/':
                e += 1
            size = int(s[i:e])
            word = s[e + 1 : e + 1 + size]
            i = e + 1 + size
            res.append(word)
        return res