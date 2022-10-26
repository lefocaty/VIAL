public class PhoneNumber {
    int count = 0, num = 67164;

    public int countDigits(){
    while (num != 0) {
      // num = num/10
      num /= 10;
      ++count;
    }
    return count;
    }
}
