class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int c[]=new int[n+m];
        int p1=0;
        int p2=0;
        int k=0;
        while(p1<m&&p2<n){
            if(nums1[p1]<=nums2[p2]){
                c[k]=nums1[p1];
                p1++;
            }
            else{
                c[k]=nums2[p2];
                p2++;
            }
            k++;
        }
        while(p1<m){
            c[k]=nums1[p1];
            p1++;
            k++;
        }
        while(p2<n){
            c[k]=nums2[p2];
            p2++;
            k++;
        }
        for(int i=0;i<n+m;i++){
            nums1[i]=c[i];
        }
    }
}