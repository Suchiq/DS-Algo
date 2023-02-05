class Solution {

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();

        ArrayList<Boolean> visited = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            l.add(new ArrayList<Integer>());
            visited.add(false);
        }
        //creating adjacency array

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];

            //System.out.println(u);
            // System.out.println(v);
            //it's bidirectional

            l.get(u).add(v);
            l.get(v).add(u);
        }

        //for (int i = 0; i < l.size(); i++) {
        //    System.out.println(l.get(i));
        //}

        Queue<Integer> q = new LinkedList<>();
        q.add(source);

        visited.set(source, true);

        while (!q.isEmpty()) {
            int curr = q.poll();

           // System.out.println(curr);

            if (curr == destination) {
                return true;
            }

            visited.set(curr, true);

            // explore directions
           // System.out.println(l.get(curr));

            for (int i = 0; i < l.get(curr).size(); i++) {
                if (!visited.get(l.get(curr).get(i))) {
                    q.add(l.get(curr).get(i));
                    visited.set(l.get(curr).get(i), true);
                }
            }
        }

        return false;
    }
}
