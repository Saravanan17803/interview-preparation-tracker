class ShuffletheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        
        for (int i = 0; i < n; i++) {
            arr[2 * i] = nums[i];
            arr[2 * i + 1] = nums[i + n];
        }
        
        return arr;
    }

    public static void main(String[] args) {
        ShuffletheArray solution = new ShuffletheArray();
        int n = 3;  
        int[] nums = {1, 2, 3, 4, 5, 6};
        int[] result = solution.shuffle(nums, n);
        System.out.println("Shuffled array:");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
