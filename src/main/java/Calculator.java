
public class Calculator {

    private double one;
    private double two;

    public Calculator(double one,double two){
        this.one = one;
        this.two = two;
    }

    public double addition(){
        return  one+two;
    }
    public double subtraction(){
        return one-two;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "one=" + one +
                ", two=" + two +
                '}';
    }
}

