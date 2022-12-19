class LRUCache {
    HashMap<Integer, Integer> cache;
    int capacity;

    public LRUCache(int capacity) {
        this.cache = new LinkedHashMap<Integer, Integer>(capacity);
        this.capacity = capacity;
    }

    public Integer get(int key) {
        if (cache.containsKey(key)) {
            int value = cache.get(key);
            cache.remove(key);
            cache.put(key, value);
            return value;
        }
        return -1;
    }

    public void put(int key, int value) {
     
          if (cache.containsKey(key)) {
              cache.remove(key);
              cache.put(key, value);
              return;
        }
        if (cache.size() >= capacity) {
            int first = cache.keySet().iterator().next();
            cache.remove(first);
        }
         cache.put(key, value);
    }
}
/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
