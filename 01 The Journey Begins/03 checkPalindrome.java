boolean checkPalindrome(String inputString) {
    return new StringBuilder(inputString).reverse().toString().equals(inputString);
}
