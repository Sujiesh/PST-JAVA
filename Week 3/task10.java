public int AddSub(int input1, int input2){

    int result = 0;
    int sign;

    if(input2 == 1)
        sign = 1;      // N - (N-1) + (N-2) ...
    else
        sign = 1;      // N + (N-1) - (N-2) ...

    for(int i = input1; i >= 1; i--){
        result += sign * i;

        if(input2 == 1)
            sign *= -1;
        else{
            if(i != input1)
                sign *= -1;
        }
    }

    return result;
}