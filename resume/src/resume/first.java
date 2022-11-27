package resume;

import javax.swing.*;
import java.awt.Color;    
public class first extends JFrame{    
JProgressBar jb;    
int i=0,num=0;     
first(){    
jb=new JProgressBar(0,2000);    
jb.setForeground(Color.GREEN);
jb.setBounds(10,391,565,7);         
jb.setValue(0);    
jb.setStringPainted(true);    
getContentPane().add(jb);    
setSize(599,503);    
getContentPane().setLayout(null);    
}    
public void iterate(){    
while(i<=2000){    
  jb.setValue(i);    
  i=i+20;    
  try{Thread.sleep(150);}catch(Exception e){}    
}
setVisible(false);
new home1().setVisible(true);
}    
public static void main(String[] args) {    
    first m=new first();    
    m.setVisible(true);    
    m.iterate();    
}    
}  