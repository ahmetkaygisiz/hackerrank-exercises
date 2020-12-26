public static int countingValleys(int steps, String path) {
  AtomicInteger lvl = new AtomicInteger();
  AtomicInteger v = new AtomicInteger();

  path.chars()
    .forEach(i -> {
      if ( i == 'U') lvl.incrementAndGet();
      if ( i == 'D') lvl.decrementAndGet();
      
      if (lvl.intValue() == 0 && i == 'U')
        v.incrementAndGet();
    });
            
  return v.intValue();
}