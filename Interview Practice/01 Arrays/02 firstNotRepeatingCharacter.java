char firstNotRepeatingCharacter(String str) 
{
    HashMap<Character,Integer>  ch = new HashMap<Character ,Integer>();
    int i, length;
    char c = 0;
    length= str.length();
    for (i=0; i < length; i++)
    {
        c = str.charAt(i);
        if(ch.containsKey(c))
        {
            ch.put(c, ch.get(c) + 1);
        }
        else
        {
            ch.put(c, 1) ;
        }
    }
     
    for (i =0; i < length; i++)
    {
        c = str.charAt(i);
        if(ch.get(c) == 1)
            return c;
        else
            c = '_';
    }
    return c;
}
