/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
                ListNode m=findMid(head,true);
        ListNode sh=m.next;
        m.next=null;
        ListNode res=join(head,reverse(sh));
        System.out.println(res);
    }
    ListNode join(ListNode h1,ListNode h2){
        ListNode th1,th2;
        ListNode temp=h1;
        while(h1!=null&h2!=null){
            th1=h1.next;
            h1.next=h2;
            th2=h2.next;
            h2.next=th1;
            h1=th1;
            h2=th2;
        }
        return temp;
    }
    public ListNode findMid(ListNode h,boolean flag){
        ListNode s=h,f=h;
        while(f.next!=null&&f.next.next!=null){
            s=s.next;
            f=f.next.next;
        }
        if(f.next==null||flag==true)
        return s;
        else
        return s.next;
        
    }
     public ListNode reverse(ListNode h) {
        if(h==null||h.next==null)
            return h;
        ListNode n=reverse(h.next);
            h.next.next=h;
            h.next=null;
            return n;

    }
}