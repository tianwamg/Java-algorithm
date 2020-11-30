package linkedlist.leetcode142;

import linkedlist.LinkList;
import linkedlist.Node;

public class position {

    public static void main(String[] args) {

    }

    public Node position(Node node){
        if(node == null){
            return null;
        }
        Node slow = node,fast = node;
        while (fast != null){
            slow = slow.next;
            if(fast.next != null){
                fast = fast.next.next;
            }else {
                return null;
            }
            if(fast == slow){
                Node ptr = node;
                while (ptr != slow){
                    ptr = ptr.next;
                    slow = slow.next;
                }
                return ptr;
            }
        }
        return null;
    }
}
