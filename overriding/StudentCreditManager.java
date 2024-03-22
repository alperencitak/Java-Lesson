package overriding;

public class StudentCreditManager extends BaseCreditManager {
    public double calculateS(double tutar){
        return tutar*1.10;
    }
}
