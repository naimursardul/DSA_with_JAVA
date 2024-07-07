class time_complexity_demo {
    public static void main(String[] args){
        double start = System.currentTimeMillis();
        
        int sum = findSum(999999);
        System.out.println(sum);
        
        double end = System.currentTimeMillis();

        System.out.println("Time taken " + (end - start) + " milliseconds");


    }
    

    // static int findSum(int n){
    //     return n * (n + 1) / 2;
    // }
    // This one is taking less time.

    static int findSum(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
    // This one is taking more time.
}
