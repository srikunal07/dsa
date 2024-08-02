import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int previousIndex = map.get(nums[i]);
                if (i - previousIndex <= k) {
                    return true;
                }
            }
            // Update the map with the current index of the element
            map.put(nums[i], i);
        }
        
        return false;
    }
}
