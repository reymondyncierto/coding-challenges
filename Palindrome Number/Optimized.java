class Optimized {
  public boolean isPalindrome(int x) {
    if ((x < 0) || ((x % 10 == 0) && (x != 0))) {
      return false;
    }
    // 1. negative numbers are never palindromes because of the negative sign (-121) and (121-) which is invalid
    // 2. numbers ending with 0 but not equal to 0 (e.g. 10) cannot be palindromes since its reversed will end iwth a leading zero which is invalid

    // reversing half
    int reversed = 0;
    while (x > reversed) {
      reversed = reversed * 10 + x % 10;
      x /= 10;
    }

    return ((x == reversed) || (x == reversed / 10));
    // for even: compare both
    // for odd: compare but ignore middle digit
  }

  public static void main(String[] args) {
    int x = 121;

    Optimized sol = new Optimized();
    System.out.println(sol.isPalindrome(x));
  }
}
