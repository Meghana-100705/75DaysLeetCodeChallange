class Solution {
    public int majorityElement(int[] nums) {
       /* int n=nums.length;
        int count=0;
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(nums[j]==nums[j+1])
                count++;
        if(count>=n/2)
        temp=nums[j];
            }
        }
        return temp;*/
        // HashMap<Integer,Integer> hmap=new HashMap<>();
        // for(int num:nums){
        //     hmap.put(num,hmap.getOrDefault(num,0)+1);
        // }
        // int n=nums.length/2;
        // for(int key:hmap.keySet()){
        //     if(hmap.get(key)>n){
        //         return key;
        //     }
        // }
        // return -1;

        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
        }
        for(int key:hmap.keySet()){
        if(hmap.get(key)>nums.length/2){
            return key;
        }
        }
        return -1;
    }

}