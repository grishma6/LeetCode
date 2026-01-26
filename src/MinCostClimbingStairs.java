public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost){
        //You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.
        //
        //You can either start from the step with index 0, or the step with index 1.
        //
        //Return the minimum cost to reach the top of the floor.


        int n = cost.length;

        int prev1 = 0;
        int prev2 = 0;

        for(int i=2; i<=n; i++){
            int curr = Math.min(prev1+cost[i-1], prev2+cost[i-2]);

             prev2 = prev1;
             prev1 = curr;
        }
        return prev1;
    }
}
