int makeArrayConsecutive2(int[] statues) {
    Arrays.sort(statues);
    int sol = 0;
    for(int i = 1; i<statues.length; i++)
    {
        sol += (statues[i] - (statues[i-1]+1));
    }
    return sol;
}
