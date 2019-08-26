import java.util.Scanner;
import java.util.Random;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Tool.kit;

public class usernamegen {
  public static void main(String[] args) {

    try{
      Random rand = new Random();
      int randomInt = random.nextInt(100);
      FileReader first = new FileReader("first.txt");
      FileReader other = new FileReader("other.txt");
      BufferedReader fReader = new BufferedReader(new FileReader(first));
      BufferedReader oReader = new BufferedReader(new FileReader(other));

      String line = reader.readLine();
      String userName = "";

      List<String> lines = new ArrayList<String>();
      while (line != null) {
        lines.add(line);
        line = reader.readLine();
      }

      String radomLine = lines.get(rand.nextInt(lines.size()));
      
      jOptionPane.showMessageDialog(null,line);
    } catch (IOException e){
      JOptionPane.showMessgaeDialog(null, e.getMessage()+"for lol.txt", "File Error", JOptionPane.ERROR_MESSAGE);
    }
  }
}
