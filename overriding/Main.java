package overriding;

public class Main {

    public static void main(String[] args) {

        BaseCreditManager[] baseC = new BaseCreditManager[]{
            new TeacherCreditManager(),
            new FarmCreditManager(),
            new StudentCreditManager()
        };
        for(BaseCreditManager credit:baseC){
            System.out.println(credit.calculate(1000));
        }
        System.out.println(baseC[0].calculate(1000));

    }
}
