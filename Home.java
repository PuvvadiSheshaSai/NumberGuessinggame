import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
class Home extends JFrame implements ActionListener{
    Random random=new Random();
    int num=random.nextInt(101);
    int count=0;
    JLabel label;
    JLabel label1;
    JLabel label2;
    JTextField textfield;
    JLabel label3;
    JLabel label4;
    JButton button;
    Home(){
        label=new JLabel();
        label.setBounds(220,150,950,60);
        label.setText("Welcome to the Number Guessing Game :)");
        label.setFont(new Font("Curlz MT",Font.BOLD,50));
        label1=new JLabel();
        label1.setBounds(400,230,900,50);
        label1.setText("Guess a number between 1 to 100(Both Included)");
        label1.setFont(new Font("Chiller",Font.BOLD,35));
        label2=new JLabel();
        label2.setText("Enter number here:");
        label2.setBounds(524,300,200,30);
        textfield=new JTextField();
        textfield.setBounds(656,300,60,30);
        textfield.setPreferredSize(new Dimension(60,30));
        label3=new JLabel();
        label3.setBounds(350,480,600,40);
        label3.setVisible(false);
        label4=new JLabel();
        label4.setBounds(400,530,200,40);
        label4.setVisible(false);
        button=new JButton();
        button.setText("Check");
        button.addActionListener(this);
        button.setBounds(600,400,90,40);
        button.setFocusable(false);
        button.setForeground(Color.green);
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(1920,1080);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(label);
        this.add(label1);
        this.add(label2);
        this.add(textfield);
        this.add(button);
        this.add(label3);
        this.add(label4);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==button){
            count++;
            if(count==5){
                label4.setText("You Lost but the number is"+num);
                button.setVisible(false);
                label4.setVisible(true);
            }
            int value=Integer.parseInt(textfield.getText());
            if(value==(num)){
                label3.setText("Congratulations you have got the number and score is "+(10-count*2));
            }
            else if(value>num&&value<=100){
                label3.setText("Don't Worry you entered Bigger number");
            }
            else if(value<num&&value>=0){
                label3.setText("Don't Worry you entered Smaller number");
            }
            else if(value<0||value>100){
                label3.setText("Please enter a number between 1 to 100");
            }
            label3.setVisible(true);
            
        }
    }
}