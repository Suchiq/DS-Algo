class Solution {
    //make result array with path

    List<List<Integer>> result = new ArrayList<>();

    // make temp array

    List<Integer> temp = new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        dfs(graph, 0, graph.length - 1);

        return result;
    }

    public void dfs(int[][] graph, int source, int des) {
        //System.out.println(source);
        //System.out.println(des);
        temp.add(source);

        if (source == des) {
            // System.out.println(temp.size());
            result.add(new ArrayList<>(temp));
        }

        for (int vertises : graph[source]) {
            dfs(graph, vertises, des);
        }

        temp.remove(temp.size() - 1);
    }
}
