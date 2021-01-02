// piuhhh.... that was challenging.
static int minimumSwaps(int[] arr) {
  int swap = 0;
  
  for(int i=0; i < arr.length - 1; i++){
    if (arr[i] == i+1)
      continue;
    
    if(arr[i] > i+1){ 
      int tmp = arr[arr[i] - 1];
      arr[arr[i] - 1] = arr[i];
      arr[i] = tmp;
      i--;
      swap++;
    }
  }
  
  return swap;
}

/*******************/
// Bad way.
// Time Limit ERROR!!! 
static int minimumSwaps(int[] arr) {
  int swap = 0;
  
  for(int i=0; i < arr.length; i++){
    int minIndex = findMin(arr, i);
    
    if (minIndex != i){
      int tmp = arr[i];
      arr[i] = arr[minIndex];
      arr[minIndex] = tmp;
      swap++;
    }
  }
  
  return swap;
}

static int findMin(int[] arr, int startIndex){
  int min = startIndex;
  
  for(int i = startIndex; i < arr.length; i++){
    if ( arr[i] < arr[min]) 
      min = i;
  }
  
  return min;
}
