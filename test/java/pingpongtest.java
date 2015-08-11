import org.junit.*;
import static org.junit.Assert.*;

public class pingpongtest {

  @Test
  public void pingpongtestforone() {
    PingPong test1 =new PingPong();
    String[] teststring = test1.pingfunction("1");
    String[] output1 = {"1"};

    assertEquals(output1,teststring);
    

  }
}
