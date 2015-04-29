import java.awt.event.*; 

import javax.swing.*; 

public class MJF extends JFrame implements ActionListener 

{    private JTextField text_number; 

   private JButton button; 

   private Object datas[][]; 

   private JTable table; 

   public MJF() 

   {    super("幻方"); 

     this.setBounds(300,240,400,200); 

     this.setBackground(java.awt.Color.lightGray); 

     this.setDefaultCloseOperation(EXIT_ON_CLOSE); 

     JPanel panel=new JPanel(); 

     this.getContentPane().add(panel,"North"); 

     panel.add(new JLabel("幻方阶数")); 

     text_number=new JTextField("3",4); 

     panel.add(text_number); 

        button=new JButton("显示"); 

     panel.add(button); 

     button.addActionListener(this); 

     datas=new Object[3][3]; 

     String titles[]=new String[3]; 

     titles[0]=""; 

     titles[1]=""; 

     titles[2]=""; 

     datas=setdatas(3); 

     table=new JTable(datas,titles); 

        this.getContentPane().add(table); 

        this.setVisible(true); 

   } 

   public void actionPerformed(ActionEvent e) 

   {     int k=Integer.parseInt(text_number.getText()); 

           String titles[]=new String[k]; 

           for(int i=0;i<k;i++) 

               titles[i]=""; 

           datas=setdatas(k); 

       this.getContentPane().remove(table); 

       table=new JTable(datas,titles); 

       this.getContentPane().add(table); 

       this.setVisible(true); 

       table.setEnabled(false);     } 

   public Object[][] setdatas(int k) 

   {     Object datas[][]=new Object[k][k];   

         int i=0,j=k/2; 

         for(int n=1;n<=k*k;n++) 

      {    datas[i][j]=n; 

         if(n%k==0) 

           i=(i+1)%k; 

         else 

         {    i=(i-1+k)%k; 

           j=(j+1)%k; 

         } 

       } 

       for(i=0;i<k;i++)           

       {    for(j=0;j<k;j++) 

             datas[i][j]=String.format("%4d", datas[i][j]);  

             } 

       return datas; 

   } 

   public static void main(String args[]) 

   {      new MJF(); 

   } 

} 