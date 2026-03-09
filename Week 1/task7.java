static int uniqueDigitCount(int n) {
    boolean[] seen = new boolean[10];
    int count = 0;

    while (n > 0) {
        int d = n % 10;
        if (!seen[d]) {
            seen[d] = true;
            count++;
        }
        n /= 10;
    }
    return count;
}
