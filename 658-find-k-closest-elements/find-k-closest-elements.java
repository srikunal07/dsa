import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        
        int left = 0;
        int right = arr.length - k;
        
        // Binary search to find the smallest left index
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // Check which side is closer to x
            if (x - arr[mid] > arr[mid + k] - x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        // Add the k closest elements to the result list
        for (int i = left; i < left + k; i++) {
            result.add(arr[i]);
        }
        
        return result;
    }
}
