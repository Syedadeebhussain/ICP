class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        List<Integer> ll = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>(); 
        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        for (int i = k; i < n; i++) {
            ll.add(nums[dq.peekFirst()]);
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.removeFirst();
            }
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        ll.add(nums[dq.peekFirst()]);
        int[] arr = new int[ll.size()];
        for (int i = 0; i < ll.size(); i++) {
            arr[i] = ll.get(i);
        }
        return arr;
    }
}
