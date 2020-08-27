int[] alternatingSums(int[] a) {
    int team1Sum = 0;
    int team2Sum = 0;
    for(int i = 0; i < a.length; i++)
    {
        if(i % 2 == 0)
            team1Sum += a[i];
        else
            team2Sum += a[i];
    }
    return new int[]{team1Sum, team2Sum};
}
