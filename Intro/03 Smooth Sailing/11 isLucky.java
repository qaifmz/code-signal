boolean isLucky(int n) {
    String tempStr = Integer.toString(n);
    char[] charArray = tempStr.toCharArray();
    int len = charArray.length;
    int firstHalf = 0, secondHalf = 0;
    
    for(int i = 0, j=len-1; i<j; i++,j-- )
    {
        firstHalf += Character.getNumericValue(charArray[i]);
        secondHalf +=Character.getNumericValue(charArray[j]);
    }
    return firstHalf == secondHalf;
}
