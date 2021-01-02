// Complete the rotLeft function below.
static int[] rotLeft(int[] a, int d) {
  int[] b = new int[a.length];

  for(int i = 0; i < a.length; i++){
      if (i-d < 0)
        b[a.length + i - d] = a[i];
      else
        b[i-d] = a[i];
  }
  
  return b;
}

// Complete the rotLeft function below.
static int[] rotLeft(int[] a, int d) {
  for(int j = 0 ; j < d; j++ ){
    int tmp = a[0]; // 1 i al
    for (int i = 1; i < a.length; i++) 
        a[i-1] = a[i];
    a[a.length-1] = tmp;
  }

  return a;
} 
