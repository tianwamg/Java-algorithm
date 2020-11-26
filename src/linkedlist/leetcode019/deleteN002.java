package linkedlist.leetcode019;

/**
 * 快慢指针
 */
public class deleteN002 {

    public static void main(String[] args) {
        deleteN.Node node = new deleteN.Node();

        int n = 2;
        deleteN.Node first = node;
        deleteN.Node second = node;
        for(int i=0;i<n;i++){
            first = first.next;
        }
        while (first != null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
    }
}
