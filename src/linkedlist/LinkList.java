package linkedlist;

/**
 * 单链表
 */
public class LinkList {

    //头节点
    public Node head;

    //节点位置
    private int pos;

    private int size;

    public LinkList(){
        this.head = null;
    }

    public void addFirst(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
        size ++;
    }

    public Node deleteFirst(){
        Node temp = head;
        head = temp.next;
        size --;
        return temp;
    }

    public void add(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
        }
        Node temp = head;
        while (temp != null){
            temp = temp.next;
        }
        temp.next = node;
        size ++;
    }

    public boolean delete(int index){

        if(index <0 || index > size){
            return false;
        }

        boolean flag = false;
        if(index == 0){
            head = head.next;
            flag = true;
        }
        int i=1;
        Node previous = head;
        Node current = previous.next;
        while (current != null){
            if(i == index){
                previous.next = current.next;
                flag = true;
                break;
            }
            previous = current;
            current = current.next;
            i++;
        }
        if(flag){
            size --;
        }
        return false;
    }

    public void disPlay(){
        Node current = head;
        while (current != null){
            current.show();
            current = current.next;
        }
        System.out.println();
    }

    public Node findByData(int data){
        Node current = head;
        while (current.data != data){
            if(current.next == null){
                return null;
            }
            current = current.next;
        }
        return current;
    }

    public int size(){
        return size;
    }

}
