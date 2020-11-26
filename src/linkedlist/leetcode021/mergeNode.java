package linkedlist.leetcode021;

public class mergeNode {

    public static void main(String[] args) {

    }

    public static Node merge(Node n1,Node n2){
        Node n = new Node();
        while (n1 != null && n2 != null){
            if(n1.value <= n2.value){
                n.next = n1;
                n1 = n1.next;
            }else {
                n.next = n2;
                n2 = n2.next;
            }
        }
        n.next = n1 == null?n2:n1;
        return n;
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
