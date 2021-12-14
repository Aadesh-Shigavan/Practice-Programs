public class LinkedList {

    private Node head;
    private Node tail;

    private int size;

    public LinkedList(){
        this.size = 0;
    }

    public void insertLast(int val){

        if(head == tail){
            insertFirst(val);
        }
        else{
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size+=1;
        }
        
    }

    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val,temp.next);
        temp.next = node;

        size+=1;

    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size += 1;
    }

    public int deleteFirst(){

        int val = head.value;
        if(head == null){
            tail = null;
        }
        
        head = head.next;
        size-=1;
        return val;
    }

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int delete(int index){
        if(index == 0){
                return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }

        Node prevNode = get(index - 1);

        int val = prevNode.next.value;

        prevNode.next = prevNode.next.next;

        return val;
    }

    public Node find(int value){
        Node node = head;

        while(node != null){
            node = node.next;
        }

        return node;
    }



    public void display(){
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }
    
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }

    


public static void main(String[] args) {
    
    LinkedList list = new LinkedList();
    list.insertFirst(3);
    list.insertFirst(2);
    list.insertFirst(8);
    list.insertFirst(17);
    list.insertLast(6);
    list.insert(100, 3);
    
    System.out.println(list.deleteFirst());
    System.out.println(list.deleteLast());
    list.delete(2);
    

    list.find(3);
    list.display();

}
}