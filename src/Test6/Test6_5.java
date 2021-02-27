package Test6;

public class Test6_5 {
    public node head;
    public node tail;
    public node reverse(node head){
        if (head==null){
            return null;
        }
        Test6_5 temp=new Test6_5();
        node start=head;
        temp.head=start;
        temp.tail=start;
        while (start.next!=null){
            node new_node=temp.head;
            temp.head=start.next;
            temp.head.next=new_node;
            start=start.next;
        }
        temp.head=start;
        return temp.head;
    }
}
class node{
    public int val;
    public node next;

    public node(int val, node next) {
        this.val = val;
        this.next = next;
    }

    public node() {
    }
}
