public class PhoneNumberTest {
    
    private PhoneNumber num;
    int count = 0, num = 0723967164;
    @Before
    public void setup (){
        this.phone = new PhoneNumber();
    }
    @After
    public void close(){

    }

    @Test
    public void hesabu(){
        while (num != 0) {
            // num = num/10
            num /= 10;
            ++count;
            return count;
          }
          if (count > 10){
            assertTrue(count == 10);
          }
    }
}
