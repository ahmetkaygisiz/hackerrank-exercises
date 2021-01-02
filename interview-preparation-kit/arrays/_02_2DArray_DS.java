// Complete the hourglassSum function below.
static int hourglassSum(int[][] arr) {
  int maxValue = Integer.MIN_VALUE;
  int sum = 0;
  
  for(int i = 0; i < arr.length - 2 ; i++){
    for(int j = 0; j < arr[i].length - 2; j++){
      sum = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                      + arr[i+1][j+1]
            + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
            
      if (sum > maxValue)
          maxValue = sum;
    }
  }
  return maxValue;
} 
