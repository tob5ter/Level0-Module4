package _01_double._2_test_scores;

import javax.swing.JOptionPane;
public class test_scores {
public static void main(String[] args) {

   

        String scoreS= JOptionPane.showInputDialog("What Did You Get On Your Test?");
double scoreD=Double.parseDouble(scoreS);
if(scoreD<85){
    JOptionPane.showMessageDialog(null, "Failure!"); 
}
else{
    JOptionPane.showMessageDialog(null, "Good Job");
}
}
}
