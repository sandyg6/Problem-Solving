class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        //create adj list
        List<List<Integer>> adj = new ArrayList<>(numCourses);
        for(int i=0 ; i<numCourses ; i++){
            adj.add(new ArrayList<>());
        }
        for(int [] preReq :prerequisites){
            int v = preReq[0];
            int u = preReq[1];
            adj.get(u).add(v);
        }
        //calculate in-degree
        int[] inDegree = new int[numCourses];
        for(int[] preReq : prerequisites){
            int v = preReq[0];
            int u = preReq[1];
            inDegree[v] ++;
        }
        Queue<Integer> q = new LinkedList<>();
        int[] orderofcourse = new int[numCourses];
        int courseIndex = 0;
        for(int i=0 ; i<numCourses ; i++){
            if(inDegree[i] == 0){
                q.add(i);
                orderofcourse[courseIndex++] = i;
            }
        }
        while(!q.isEmpty()){
            int curr = q.poll();
            for(int nei : adj.get(curr)){
                inDegree[nei]--;
                if(inDegree[nei] == 0){
                    orderofcourse[courseIndex++] = nei;
                    q.add(nei);
                }
            }
        }
        for(int i=0 ; i<numCourses ; i++){
            if(inDegree[i] != 0)
            return new int[]{};
        }
        return orderofcourse;
    }
}