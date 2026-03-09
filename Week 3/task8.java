class UserMainCode
{
    public int seriesN(int input1)
    {
        int term = 1;

        for(int i = 2; i <= input1; i++)
        {
            if(i % 2 == 0)
                term = term + 2;
            else
                term = term + 3;
        }

        return term;
    }
}