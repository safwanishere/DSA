public class NumericHashing{
    public static void main(String[] args){
        int[] arr = {2, 4, 3, 1, 4, 3, 3, 2, 0, 3, 2, 1, 2, 2};

        // precomputation
        int[] hash = new int[6];
        for (int i=0; i<arr.length; i++){
            hash[arr[i]]++;
        }

        // fetching
        for (int i=0; i<hash.length; i++){
            System.out.println(i + " -> " + hash[i]);
        }
    }
}