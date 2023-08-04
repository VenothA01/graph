package src.com.dailycoder;

import java.util.*;

public class Graph {

    public static List<List<Integer>>  constructAdjacencyList(List<int[]> list){


        List<List<Integer>> adjList = new ArrayList<>();
        int size = list.size();

        for(int i=0;i<size;++i){
            adjList.add(i,new ArrayList<Integer>());
        }

        for(int[] edge:list){

            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }


        return adjList;
    }

    public static void main(String[] args) {

        int[] edge = new int[2];
        List<int[] > list = new ArrayList<int[]>();

        list.add(new int[]{1,2});
        list.add(new int[]{1,5});
        list.add(new int[]{2,3});
        list.add(new int[]{2,5});
        list.add(new int[]{3,5});
        list.add(new int[]{4,5});


        for(int[] node: list)
            System.out.println(Arrays.toString(node));

        List<List<Integer>> adjList = constructAdjacencyList(list);

        System.out.println(adjList);

    }
}
