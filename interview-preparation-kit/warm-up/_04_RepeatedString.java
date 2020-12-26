static long repeatedString(String s, long n) {
  long strCount = n / s.length() ;
  int rest = (int) (n % s.length());
  
  long count = s.chars().filter(ch -> ch == 'a').count();
  long restCount = s.substring(0, rest).chars()
                            .filter(ch -> ch == 'a')
                            .count();
  
  
  return strCount * count + restCount;
}