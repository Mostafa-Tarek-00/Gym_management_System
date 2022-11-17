
package gym;

public class OtherWorkers extends CommisionStaff {
    private double baseSalray;
    public OtherWorkers(String id , String fName , String lName , String BD , String Age , String mCase,String PNumber,double rate,double sales,double salary){
        super(id,fName,lName,BD,Age,mCase,PNumber,rate,sales);
        setBaseSalray(salary);
    }

    public double getBaseSalray() {
        return baseSalray;
    }

    public void setBaseSalray(double salary) {
        baseSalray = (salary <0.0)?0.0:salary;
    }
    @Override
        public double moneypay(){
                return getBaseSalray()*super.moneypay();
        }

    @Override
    public String toString() {
        return "OtherWorkers{" + "baseSalray=" + baseSalray + '}';
    }
        
}
