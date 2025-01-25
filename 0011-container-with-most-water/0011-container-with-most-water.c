int min(int a, int b){
  if(a<b) return a;
  else return b;
  // return a < b : a ? b;
}
int max(int a, int b){
  if(a>b) return a;
  else return b;
  // return a> b: a ? b;
}

int maxArea(int* arr, int n) {
  int left = 0;
  int right = n -1;
//   if(n == 0 ) printf("0");
  int area = 0;
  int result = 0;
  while(left<right){
    area = (right - left) * min(arr[left], arr[right]);
    result = max(area, result);

    if(arr[left] < arr[right]) left++;
    else right--;
  }
  return result;
}