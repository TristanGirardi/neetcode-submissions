class Solution:
    def isPalindrome(self, s: str) -> bool:
        st = "".join(ch for ch in s if ch.isalnum()).lower()
        print(st)
        l = 0
        r = len(st) - 1
        while r>l:
            if st[l] != st[r]:
                return False
            r = r-1
            l = l+1
        return True

        