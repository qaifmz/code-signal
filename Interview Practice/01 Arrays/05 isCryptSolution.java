boolean isCryptSolution(String[] crypt, char[][] solution) {
    long first = 0;
    long second = 0;
    long third = 0;
    boolean sol = false;
    for(int i = 0; i < crypt.length; i++){
        String tmp = "";
        for(int j = 0; j < crypt[i].length(); j++){
            for(int k = 0; k < solution.length; k++){
                if(crypt[i].charAt(j) == solution[k][0]){
                    if(solution[k][1] == '0' && j == 0 && crypt[i].length() > 1){
                        return false;
                    }
                    tmp += solution[k][1];
                }
            }
        }
        if(i == 0){
            first = Long.parseLong(tmp);
            tmp = "";
        }
        if(i == 1){
            second = Long.parseLong(tmp);
            tmp = "";
        }
        if(i == 2){
            third = Long.parseLong(tmp);
            tmp = "";
        }
    }
    if(first + second == third){
        sol = true;
    }
    return sol;
}
