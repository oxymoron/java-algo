import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P1_1_28 {

    public static int[] whitelist(int[] a, int[] b){
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(a);
        a = removeSame(a);
        for (int item : b) {
            if(rank(item, a) < 0) list.add(item);
        }
        return listToArray(list);
    }

    private static int[] removeSame(int[] a) {
        List<Integer> list = new ArrayList<Integer>();
        int prev = Integer.MAX_VALUE;
        for(int item : a){
            if (item != prev) list.add(item);
            prev = item;
        }
        return listToArray(list);
    }

    private static int[] listToArray(List<Integer> list) {
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }

    private static int rank(int key, int[] arr) {
        int a = 0;
        int b = arr.length - 1;
        while (a <= b){
            int mid = a + (b - a) / 2;
            if (key < arr[mid]){
                b = mid - 1;
            }else if (key > arr[mid]){
                a = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
