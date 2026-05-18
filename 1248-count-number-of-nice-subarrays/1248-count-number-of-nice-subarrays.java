class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        // int c=0;
        // for(int i=0;i<nums.length;i++){
        //     int count=0;
        //     for(int j=i;j<nums.length;j++){
        //         // for(int k=i;k<=j;k++){
        //         if(nums[j]%2!=0){
        //             count++;
        //         }
        //      //   }
        //         if(count==tar){
        //                 c+=1;
        //     }
        //     }
             
           
        // }
        // return c;
        HashMap<Integer,Integer> hmap=new HashMap<>();
        hmap.put(0,1);
        int count=0;
        int prefixsum=0;
        for(int num:nums){
            prefixsum+=num%2;
        if(hmap.containsKey(prefixsum-k)){
            count+=hmap.get(prefixsum-k);
        }
        hmap.put(prefixsum,hmap.getOrDefault(prefixsum,0)+1);
        }
        return count;
    }
}