public class PingPong {
  public static void main(String[] args) {}

  public static String[] pingfunction(String num)
   {
    Integer number = Integer.parseInt(num);
    String[] result = new String[number];
    String output;
    for(int i=1; i<=number; i++)
    {
        if(number % 3 == 0 && number % 5 == 0)
        output = "Ping-Pong";
        else if(number % 3 == 0)
        output = "Ping";
        else if(number % 5 == 0)
        output = "Pong";
        else{
        output = Integer.toString(i);
           }
        int j = i-1;
        result[j] = output;

    }

    return result;
  }
}
