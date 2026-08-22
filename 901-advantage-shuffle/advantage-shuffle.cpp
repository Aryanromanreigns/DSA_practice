class Solution {
public:
    vector<int> advantageCount(vector<int>& nums1, vector<int>& nums2) {
        int n = nums1.size();
        vector<int>ans(n);
        vector<pair<int , int>>a;
        for(int i = 0 ; i < n ; i++){
            a.push_back({nums2[i],i});
        }

        sort(a.begin() , a.end());
        sort(nums1.begin() , nums1.end());

        int l = 0;
        int r = n-1;

        for(int i = n-1; i >= 0 ; i--){
            if(nums1[r] > a[i].first){
                ans[a[i].second] = nums1[r];
                r--;
            }
            else{
                ans[a[i].second] = nums1[l];
                l++;
            }
        }
        return ans;
        
    }
};