int firstDuplicate(int[] a) {
    HashSet hs = new HashSet();
    
    for(int n:a){
        if(hs.contains(n))
            return n;
        else 
            hs.add(n);
    }
    return -1;
}
