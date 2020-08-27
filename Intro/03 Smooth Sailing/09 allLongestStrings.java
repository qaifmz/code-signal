String[] allLongestStrings(String[] inputArray) {
    List<String> list = new ArrayList<String>();
    int max = 0;
    for(String s: inputArray){
        int temp = s.length();
        if(max<temp)
        max = temp;
    }
    for(String s: inputArray){
        if(s.length() == max)
        list.add(s);
    }
    return list.toArray(new String[list.size()]);
}
