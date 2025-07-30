package datastructure.hashmap;

import java.util.*;

public class CountFreqOfArray {
    static void countFreq(int arr[],int n){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            if(map.containsKey(arr[i])) map.put(arr[i],map.get(arr[i])+1);
            else map.put(arr[i],1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
            System.out.println(entry.getKey()+ " -> " + entry.getValue());
    }

    public static void main(String[] args) {
        int []arr = {10,20,20,10,30,50};
        int n = arr.length;
        countFreq(arr,n);
    }
}
