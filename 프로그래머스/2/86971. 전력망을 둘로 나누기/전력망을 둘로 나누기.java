import java.util.*;
class Solution {
    private int totalPower;
    private int minDifference = Integer.MAX_VALUE;
    
    public int solution(int n, int[][] wires) {
        totalPower = n;
        
        List<List<Integer>> graph = new ArrayList<>();
        
        for(int i= 0 ; i <= n ; i++){
            graph.add(new ArrayList<>());
        }
        
        for(int[] wire : wires){
            graph.get(wire[0]).add(wire[1]);
            graph.get(wire[1]).add(wire[0]);
        }
        
        for(int[] wire: wires){
            graph.get(wire[0]).remove((Integer) wire[1]);
            graph.get(wire[1]).remove((Integer) wire[0]);
            
            int power = dfs(graph, wire[0], new boolean[n+1]);
            int difference = Math.abs(totalPower - power - power);
            minDifference = Math.min(minDifference, difference);
            
            graph.get(wire[0]).add(wire[1]);
            graph.get(wire[1]).add(wire[0]);
        }
        return minDifference;
    }
    
    public int dfs(List<List<Integer>> graph, int node, boolean[] visited){
        visited[node] = true;
        int power = 1;
        
        for(int neighbor : graph.get(node)){
            if(visited[neighbor] == false){
                power += dfs(graph,neighbor,visited);
            }
        }
        return power;
    }
}