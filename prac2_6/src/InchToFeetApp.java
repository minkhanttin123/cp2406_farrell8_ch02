/**
 * Created by jc339438 on 22/11/2016.
 */

import javax.swing.JOptionPane;
public class InchToFeetApp {

  public int getNum(){

      String num;
      int num2;
      num = JOptionPane.showInputDialog("Enter inches");
      num2 = Integer.parseInt(num);
      return num2;



  }

}
