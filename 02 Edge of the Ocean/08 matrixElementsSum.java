int matrixElementsSum(int[][] matrix) {
    int sum = 0;
    for(int i = 0; i < matrix[0].length; i++)
    {
        for(int j = 0; j < matrix.length; j++)
        {
            sum += matrix[j][i];
            if(matrix[j][i] == 0)
            break;
        }
    }
    return sum;	
}
