class Solution {
    public boolean isValid(String s) {
        // Stack<Character> stk=new Stack<>();
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
        //         stk.push(s.charAt(i));

        //     else{
        //         if(stk.isEmpty()) return false;
        //         if(s.charAt(i)==']'&&stk.peek()=='['){
        //             stk.pop();
        //         }
        //         else if(s.charAt(i)=='}'&&stk.peek()=='{'){
        //             stk.pop();
        //         }
        //         else if(s.charAt(i)==')'&&stk.peek()=='('){
        //             stk.pop();
        //         }
        //         else return false;
        //         }
        // }
        // return stk.isEmpty();
        Stack<Character> stk=new Stack<>();
        HashMap<Character,Character> hmap=new HashMap<>();
        hmap.put(')','(');
        hmap.put('}','{');
        hmap.put(']','[');
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                stk.push(s.charAt(i));
            }
            else{
                if(stk.isEmpty()) return false;
                if(stk.peek()==hmap.get((s.charAt(i)))){
                    stk.pop();
                }
                else
                    return false;
            }
        }
        return stk.isEmpty();
}
}