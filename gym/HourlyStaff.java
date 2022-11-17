
package gym;


public final class HourlyStaff extends Person  {
    private double hours;
    private double wage;
    //this is constructor.
    public HourlyStaff (String id , String fName , String lName , String BD , String Age , String mCase,String PNumber,double hoursWorked,double hourWage){
    super(id,fName,lName,BD,Age,mCase,PNumber);
    setHours(hoursWorked);
    setWage(hourWage);
}

    public double getHours() {
        return hours;
    }

    public void setHours(double hoursWorked) {
        hours=((hoursWorked>=0.0)&&(hoursWorked<=168.0))?hoursWorked:0.0;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double hourWage) {
        wage=(hourWage<0.0)?0.0:hourWage;
    }

    @Override
        public double moneypay(){
            if(getHours()<=40)
                return getWage()*getHours();
            else
                return 40*getWage()+(getHours()-40)*getWage()*1.5;
        }

    @Override
    public String toString() {
        return String.format(super.toString(),getWage(),getHours());
    }
    
}
