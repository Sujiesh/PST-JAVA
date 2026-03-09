public static void miniMaxSum(List<Integer> arr) {
    
    long total = 0;
    
    for(int num : arr){
        total += num;
    }
    
    long min = Long.MAX_VALUE;
    long max = Long.MIN_VALUE;
    
    for(int num : arr){
        long sum = total - num;
        min = Math.min(min, sum);
        max = Math.max(max, sum);
    }
    
    System.out.println(min + " " + max);
}