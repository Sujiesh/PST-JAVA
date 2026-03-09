public int sumOfSumsOfDigits(int input1){
    
    String s = String.valueOf(input1);
    int n = s.length();
    int total = 0;

    for(int i = 0; i < n; i++){
        int sum = 0;
        for(int j = i; j < n; j++){
            sum += s.charAt(j) - '0';
        }
        total += sum;
    }

    return total;
}