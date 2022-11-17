
package gym;


public class  Members extends Person {
    String Sub;
    public Members(String Sub,String id, String fName, String lName, String BD, String Age, String mCase, String PNumber) {
        super(id, fName, lName, BD, Age, mCase, PNumber);
        this.Sub = Sub;
    }
    
    @Override
        public double moneypay(){
            if("1".equals(Sub))
                System.out.println("400");
            else
                System.out.println("1500");
        return 0;
        
        }
        
}
