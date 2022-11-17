
package gym;

public class CommisionStaff extends Person {
    private double commissionrate;
    private double grosssales;
    public CommisionStaff (String id , String fName , String lName , String BD , String Age , String mCase,String PNumber,double rate,double sales){
        super(id,fName,lName,BD,Age,mCase,PNumber);
        setCommissionrate(rate);
        setGrosssales(sales);
}

    public double getCommissionrate() {
        return commissionrate;
    }

    public void setCommissionrate(double rate) {
        commissionrate =(rate>0.0&&rate<1.0)?rate:0.0;
    }

    public double getGrosssales() {
        return grosssales;
    }

    public void setGrosssales(double sales) {
        grosssales = (sales<0.0)?0.0:sales;
    }

    @Override
        public double moneypay(){
                return getCommissionrate()*getGrosssales();
        }
        
        @Override
    public String toString() {
        return "CommisionStaff{" + "commissionrate=" + commissionrate + ", grosssales=" + grosssales + '}';
    }
}
