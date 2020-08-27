String reverseInParentheses(String inputString) 
{
    StringBuilder str = new StringBuilder();
    int start = 0;
    int end = inputString.length() - 1;
    str.setLength(0);
    if (inputString.contains("(")) 
    {
        start = inputString.lastIndexOf("(");
        end = inputString.indexOf(")", start);
        str.append(inputString, start+1, end);
        return reverseInParentheses(inputString.substring(0, start) + str.reverse().toString() + inputString.substring(end+1));
    }
    return inputString;
}
