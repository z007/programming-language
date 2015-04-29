import java.awt.*;

import javax.swing.*;

public class MyWindow extends JFrame

{

 public MyWindow(String title)

 {

  super(title);

  setSize(300,300);

  setLocation(30,50);

  setVisible(true);

  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 }

 public static void main(String[] args)

 {

  new MyWindow("´°¿Ú");

 }

}