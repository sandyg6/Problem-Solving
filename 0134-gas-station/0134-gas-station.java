class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int currentGas = 0;
        int startIndex = 0;
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i< gas.length; i++){
            totalGas += gas[i];
            totalCost += cost[i];
            currentGas += (gas[i] - cost[i]);
            q.add(gas[i] - cost[i]);

            while(currentGas < 0 && !q.isEmpty()){
                currentGas -= q.poll();
                startIndex++;
            }
        }
        return totalGas >= totalCost ? startIndex % gas.length : -1;
    }
}