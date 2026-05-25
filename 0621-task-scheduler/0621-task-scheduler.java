class Solution {
    public int leastInterval(char[] tasks, int n) {
        int maxfreq=0;
        int maxcount=0;
        HashMap<Character,Integer> hmap=new HashMap<>();
        for(char task:tasks){
            hmap.put(task,hmap.getOrDefault(task,0)+1);
        }
        for(char key:hmap.keySet()){
            maxfreq=Math.max(maxfreq,hmap.get(key));
        }
         for (char key : hmap.keySet()) {
            if (hmap.get(key) == maxfreq) {
                maxcount++;
            }
         }
        int res=(maxfreq-1)*(n+1)+(maxcount);
        int ans=Math.max(tasks.length,res);
        return ans;
    }
}