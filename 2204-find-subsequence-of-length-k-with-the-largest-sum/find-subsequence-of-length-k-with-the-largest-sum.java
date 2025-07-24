class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        // Step 1: Map each value to its indexes
        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }

        // Step 2: Clone and sort the array
        int[] copy = nums.clone();
        Arrays.sort(copy);  // ✅ Fix: should be Arrays.sort, not Array.sort

        // Step 3: Get the top k largest values
        ArrayList<Integer> topK = new ArrayList<>();
        for (int i = copy.length - 1; i >= 0 && topK.size() < k; i--) {
            topK.add(copy[i]);
        }

        // Step 4: Get their original indexes using map
        List<Integer> indexes = new ArrayList<>();
        for (int val : topK) {
            List<Integer> idxList = map.get(val);
            indexes.add(idxList.remove(0)); // ✅ Fix: you missed () after remove
        }

        // Step 5: Sort indexes to preserve original order
        Collections.sort(indexes);

        // Step 6: Build final result array
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = nums[indexes.get(i)];
        }

        return result;
    }
}
