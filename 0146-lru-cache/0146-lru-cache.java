class LRUCache {
    Node head = new Node();
    Node tail = new Node();
    Map<Integer, Node> map;
    int cache_capacity;

    public LRUCache(int capacity) {
        map = new HashMap(capacity);
        this.cache_capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }

    public Integer get(int key) {
        //check in hashmao if exist not then return -1
        // remove and add that to front

        if (map.containsKey(key)) {
            //  System.out.println("get"+map.get(key));
            Node node = map.get(key);
            remove(node);
            addNode(node);
            return map.get(key).val;
        }

        return -1;
    }

    public void put(int key, int value) {
        // check in hasmap if exist remove and add to front
        // if not exist in hasmap check for capacity if full then remove and add
        // if capacity not full then add

        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.val = value;
            remove(node);
            addNode(node);
            return;
        }
        if (map.size() == cache_capacity) {
          
            remove(tail.prev);
        }

        Node node = new Node();
        node.key = key;
        node.val = value;
        addNode(node);
        map.put(key, node);
    }

    public void remove(Node node) {
        //remove from hasmap
        //remove from dubly link list
            System.out.println(node);
        map.remove(node.key);
        Node node_next = node.next;
        Node node_prev = node.prev;

        node_prev.next = node.next;
        node_next.prev = node_prev;
    }

    public void addNode(Node node) {
        map.put(node.key, node);
    
        Node head_next = head.next;
        node.next = head_next;
        head_next.prev = node;
        head.next = node;
        node.prev = head;
    }
}

class Node {
    int key;
    int val;
    Node next;
    Node prev;
}
/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
