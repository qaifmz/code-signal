boolean sudoku2(char[][] grid) {
    for(int i = 0; i < grid.length; i++){
        for(int j = 0; j < grid[0].length; j++){
            if(grid[i][j] != '.'){
                char tmp = grid[i][j];
                for(int k = j+1; k < grid[0].length; k++){
                    if(tmp == grid[i][k]){
                        return false;
                    }
                }
                for(int l = i+1; l < grid.length; l++){
                    if(tmp == grid[l][j]){
                        return false;
                    }
                }
                int x = 0;
                int y = 0;
                if(i < 3){
                    x = 0;
                }
                if(j < 3){
                    y = 0;
                }
                 if(i > 3 && i < 6){
                    x = 3;
                }
                if(j > 3 && j < 6){
                    y = 3;
                }
                 if(i  > 6){
                    x = 6;
                }
                if(j > 6){
                    y = 6;
                }
                int tmp2 = 0;
                for(int p = x; p < x+3; p++){
                    for(int g = y; g < y+3; g++){
                        if(grid[p][g] == tmp){
                            tmp2++;
                        }
                    }
                }
                if(tmp2 >= 2){
                    return false;
                }
            }
        }
    }
    return true;
}
