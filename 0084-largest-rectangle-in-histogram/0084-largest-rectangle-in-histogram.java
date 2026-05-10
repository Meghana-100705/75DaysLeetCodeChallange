class Solution {
    public int largestRectangleArea(int[] heights) {
    //    int maxarea=0;
    //    for(int i=0;i<heights.length;i++){
    //     int left=i;
    //     int right=i;
    //     while(left>=0&&heights[left]>=heights[i]){
    //         left--;
    //     }
    //     while(right<heights.length&&heights[right]>=heights[i]){
    //         right++;
    //     }
    //     int width=right-left-1;
    //     int area=heights[i]*width;
    //     maxarea=Math.max(area,maxarea);
    //    }
    //    return maxarea;
    Stack<Integer> stk=new Stack<>();
    int maxarea=0;
    int n=heights.length;
    for(int i=0;i<=n;i++){
        int curr=(i==n)?0:heights[i];
        while(!stk.isEmpty() && curr<heights[stk.peek()]){
            int height=heights[stk.pop()];
            int width;
            if(stk.isEmpty()){
                width=i;
            }
            else{
                width=i-stk.peek()-1;
            }
            maxarea=Math.max(maxarea,height*width);
        }
        stk.push(i);
    }
    return maxarea;
    }
}