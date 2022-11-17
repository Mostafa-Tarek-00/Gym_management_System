
package gym;

import GUI.Login;

public class GYM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Login login =new Login();
        login.setVisible(true);
         HourlyStaff hourlystaf=new HourlyStaff("1","maged","ibrahim","3/10/1999","22","good","01152731350",50.0,150.0);
         System.out.println(hourlystaf);
         System.out.print("Salary = "+hourlystaf.moneypay());
         
    }
    
}
