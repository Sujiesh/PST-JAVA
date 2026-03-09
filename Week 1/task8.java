static int mostFrequentDigit(int n) {
    int[] freq = new int[10];

    while (n > 0) {
        freq[n % 10]++;
        n /= 10;
    }

    int max = 0, digit = 0;
    for (int i = 0; i < 10; i++) {
        if (freq[i] > max) {
            max = freq[i];
            digit = i;
        }
    }
    return digit;
}
