package linkedlist;

/**
 * 节点类
 */
public class Node {

    public Node next;

    public int data;

    public Node(int data){
        this.data = data;
    }

    public void show(){
        System.out.print(data+"\t");
    }
}
