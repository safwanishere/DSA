import java.util.*;

public class MostLeastFrequent{
    static int[] program(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        int maxFreq = 0, minFreq = n;
        int maxEle = 0, minEle = 0;
        // Traverse through map and find the elements
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            int element = entry.getKey();

            if (count > maxFreq) {
                maxEle = element;
                maxFreq = count;
            }
            if (count < minFreq) {
                minEle = element;
                minFreq = count;
            }
        }
        
        int[] res = {maxEle, minEle};
        return res;
    }

    public static void main(String[] args){
        int[] arr = {10, 5, 10, 15, 5};

        int[] res = program(arr);
        int mostFrequent = res[0], leastFrequent = res[1];

        System.out.println(mostFrequent + " " + leastFrequent);
    }
}