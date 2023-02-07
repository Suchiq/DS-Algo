class Solution {
    ArrayList<ArrayList<Integer>> adjArr = new ArrayList();
    ArrayList<Boolean> visited = new ArrayList();
    ArrayList<Boolean> explored = new ArrayList();
    boolean isCourseAllowed = false;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //create adjecency list
        // we will be maintaining 2 values for each node visited and explored
        //will mark each node visited while visiting but mark explored when all the depended nodes
        //are explored for that node
        // we are checking if graph contains cycle or not
        //if visiting is true and explored is false then there is cycle

        //fill array

        for (int i = 0; i < numCourses; i++) {
            adjArr.add(new ArrayList<Integer>());
            visited.add(false);
            explored.add(false);
        }

        //create adjecency list

        for (int[] pre : prerequisites) {
            int a = pre[0];
            int b = pre[1];
            adjArr.get(b).add(a);
        }

        //call dfs

        for (int i = 0; i < adjArr.size(); i++) {
            if (!visited.get(i)) {
                if (iscycleDetected_dfs(i)) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean iscycleDetected_dfs(int node) {
        visited.set(node, true);

        ArrayList<Integer> curr = adjArr.get(node);

        for (int i = 0; i < curr.size(); i++) {
            //System.out.println(visited.get(curr.get(i)));
            //System.out.println(explored.get(curr.get(i)));

            if (!visited.get(curr.get(i))) {
                if (iscycleDetected_dfs(curr.get(i))) {
                    return true;
                }
            } else if (!explored.get(curr.get(i))) {
                return true;
            }
        }
        explored.set(node, true);

        return false;
    }
}
