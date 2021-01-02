// I gotta think over this problem


// This failed because of time limitation. :Time limit exceeded
// Algorithm worstcase senario O(n^2)
static long arrayManipulation(int n, int[][] queries) {
  long maxValue = 0;
  
  long[] baseArr = new long[n];

  for(int i=0; i < queries.length; i++){
    for(int k = queries[i][0] - 1; k <= queries[i][1] - 1; k++){
      baseArr[k] += queries[i][2];
      if (maxValue < baseArr[k])
        maxValue = baseArr[k];
    }
  }
  
  return maxValue;   
}
 
