int commonCharacterCount(String s1, String s2) {
    int len = s1.length(), sol = 0;
    char[] arr = s1.toCharArray();

    for(int i = 0; i<len; i++)
    {
        int pos = s2.indexOf(arr[i]);
        if(pos != -1)
        {
            s2 = s2.substring(0,pos) + s2.substring(pos+1);
            sol++;
        }
    }

    return sol;
}
