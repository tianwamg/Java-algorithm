package linkedlist.leetcode019;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 栈
 */
public class deleteN {

    public static void main(String[] args) {

        int n=2;
        Node head = new Node(-1);
        Deque<Node> stack = new LinkedList<>();
        Node cur = head;
        while (cur!= null){
            stack.push(cur);
            cur = cur.next;
        }
        for(int i=0;i<n;i++){
            stack.pop();
        }

        Node prev = stack.peek();
        prev.next = prev.next.next;


    }

    static class Node{
        int value;
        Node next;
        Node(){}
        Node(int value){
            this.value = value;
        }

        Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }
}
