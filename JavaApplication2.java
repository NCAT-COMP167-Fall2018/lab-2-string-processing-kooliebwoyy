import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JavaApplication2 extends Frame implements ActionListener {

JButton goButton = new JButton( "GO" );
 JLabel progname = new JLabel("COMP163");
 JTextField textInput = new JTextField(10);
 JLabel answerLabel = new JLabel("Answer");
  
JFrame f;
JLabel l1, l2, l3, l4;
TextField tf1, tf2, tf3;
Button b1, b2;
String[] month1 = {"January", "Febrary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
  
public static void main(String[] args) {
firstgui.JavaApplication2 ja = new firstgui.JavaApplication2();
  
}
  
public JavaApplication2() {
f = new JFrame();
l1 = new JLabel("Enter Date");
l2 = new JLabel("/");
l3 = new JLabel("/");
l4 = new JLabel();
tf1 = new TextField();
tf2 = new TextField();
tf3 = new TextField();
b1 = new Button("Convert");
b2 = new Button("Exit");
l1.setBounds(30, 100, 80, 30);
b1.setBounds(130, 100, 80, 30);
b2.setBounds(230, 100, 80, 30);
f.add(l1);
f.add(tf1);
f.add(l2);
f.add(tf2);
f.add(l3);
f.add(tf3);
f.add(b1);
f.add(l4);
f.add(b2);
f.setLayout(new FlowLayout(FlowLayout.LEFT));
f.setSize(300, 300);

//setLayout();
f.setVisible(true);
b1.addActionListener(this);
b2.addActionListener(this);
}

}
   
   
