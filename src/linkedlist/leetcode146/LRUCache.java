package linkedlist.leetcode146;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    class LinkNode{
        int key;
        int value;
        LinkNode prev;
        LinkNode next;

        public LinkNode(){}
        public LinkNode(int key,int value){
            this.key = key;
            this.value = value;
        }
    }

    private Map<Integer,LinkNode> cache = new HashMap<>();

    private int size;
    private int capacity;
    private LinkNode head,tail;

    public LRUCache(int capacity){
        this.size=0;
        this.capacity = capacity;
        head = new LinkNode();
        tail = new LinkNode();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key){
        LinkNode node = cache.get(key);
        if(node == null){
            return -1;
        }
        //存在，移动到头部
        moveToHead(node);
        return node.value;
    }

    public void put(int key,int value){
        LinkNode node = cache.get(key);
        if(node == null){
            LinkNode newNode = new LinkNode(key,value);
            cache.put(key,newNode);
            moveToHead(newNode);
            size++;
            if(size> capacity){
                LinkNode tail = removeTail();
                cache.remove(tail.key);
                size--;
            }
        }else {
            node.value =value;
            moveToHead(node);
        }
    }

    public void addToHead(LinkNode node){
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    public void moveToHead(LinkNode node){
        remove(node);
        addToHead(node);
    }

    public LinkNode removeTail(){
        LinkNode node = tail.prev;
        remove(node);
        return node;
    }

    public void remove(LinkNode node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}
