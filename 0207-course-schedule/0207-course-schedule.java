class Solution {
    ArrayList<ArrayList<Integer>> adjArr = new ArrayList();
    boolean[] visited;
    boolean[] explored;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //create adjecency list
        // we will be maintaining 2 values for each node visited and explored
        //will mark each node visited while visiting but mark explored when all the depended nodes
        //are explored for that node
        // we are checking if graph contains cycle or not
        //if visiting is true and explored is false then there is cycle

        //fill array

        visited = new boolean[numCourses];
        explored = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++) {
            adjArr.add(new ArrayList<Integer>());
            visited[i] = false;
            explored[i] = false;
        }

        //create adjecency list

        for (int[] pre : prerequisites) {
            int a = pre[0];
            int b = pre[1];
            adjArr.get(b).add(a);
        }

        //call dfs

        for (int i = 0; i < adjArr.size(); i++) {
            if (!visited[i]) {
                if (iscycleDetected_dfs(i)) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean iscycleDetected_dfs(int node) {
        visited[node] = true;

        ArrayList<Integer> curr = adjArr.get(node);

        for (int i = 0; i < curr.size(); i++) {
            //System.out.println(visited.get(curr.get(i)));
            //System.out.println(explored.get(curr.get(i)));

            if (!visited[curr.get(i)]) {
                if (iscycleDetected_dfs(curr.get(i))) {
                    return true;
                }
            } else if (!explored[curr.get(i)]) {
                return true;
            }
        }

        explored[node] = true;

        return false;
    }
}
