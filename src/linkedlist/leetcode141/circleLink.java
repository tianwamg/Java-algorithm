package linkedlist.leetcode141;

import linkedlist.LinkList;
import linkedlist.Node;

public class circleLink {

    public static void main(String[] args) {

    }

    /**
     * 快慢指针判断是否存在环
     * @param node
     * @return
     */
    public boolean hasCircle(Node node){
        if(node == null || node.next ==null){
            return false;
        }
        Node slow = node;
        Node fast = node.next;
        while (slow != fast){
            if(fast == null || fast.next ==null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
