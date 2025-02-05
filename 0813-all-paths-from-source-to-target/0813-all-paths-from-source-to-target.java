class Solution {
    int[][] adj;
    int destination;
    List<List<Integer>> totalPath;

    //backtracking function
    private void dfs(int currNode, List<Integer> currPath){
        currPath.add(currNode);

        //base condition
        if(currNode == destination){
            totalPath.add(new ArrayList<>(currPath));
            currPath.remove(currPath.size() - 1);
            return;
        }

        //recursion call
        for(int neighbor: adj[currNode]){
            dfs(neighbor, currPath);
        }

        //final base case
        currPath.remove(currPath.size() - 1);
    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int vertex = graph.length;
        adj = graph;

        //recursion will call here
        totalPath = new ArrayList<>();
        destination = vertex - 1;

        List<Integer> currPath = new ArrayList<>();
        ///recursionn

        dfs(0, currPath);
        return totalPath;
    }
}