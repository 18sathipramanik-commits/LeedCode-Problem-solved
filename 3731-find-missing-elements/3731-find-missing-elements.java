class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       List<Integer> list=new ArrayList<>();
       
       HashSet<Integer> set=new HashSet<>();
        int min=nums[0];
        int max=nums[0];
       for (int num : nums) {
            set.add(num);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
       for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                list.add(i);
            }
        }
        return list;
    }
}