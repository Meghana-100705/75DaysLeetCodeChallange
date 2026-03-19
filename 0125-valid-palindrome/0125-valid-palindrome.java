class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch)||Character.isDigit(ch)){
                str=str+Character.toLowerCase(ch);
            }

        }
        String ns="";
        for(int i=str.length()-1;i>=0;i--){
            ns=ns+str.charAt(i);

        }
        return str.equals(ns);
    }
}