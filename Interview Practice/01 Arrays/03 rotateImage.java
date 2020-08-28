int[][] rotateImage(int[][] a) {
    int n = a.length;
	for (int i = 0; i < n / 2; i++) {
		for (int j = 0; j < Math.ceil(((double) n) / 2.); j++) {
			int temp = a[i][j];
			a[i][j] = a[n-1-j][i];
			a[n-1-j][i] = a[n-1-i][n-1-j];
			a[n-1-i][n-1-j] = a[j][n-1-i];
			a[j][n-1-i] = temp;
		}
	}
    return a;
}
