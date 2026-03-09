static int sumNonPrimeIndex(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        if (!isPrime(i)) sum += arr[i];
    }
    return sum;
}
