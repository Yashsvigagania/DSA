class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int n= s.size();
        unordered_map <char,int> mp;
        int lenght=0;
        int left=0;
        for(int i=0;i<n;i++){
            char currChar=s[i];
            if(mp.find(currChar) != mp.end() && mp[currChar]>=left){
                left=mp[currChar] +1;
            }
            mp[currChar]=i;
            lenght=max(lenght,i-left+1);
        }
        return lenght;
    }
};
