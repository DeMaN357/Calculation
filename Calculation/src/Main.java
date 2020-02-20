import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input our expression: ");
        String input=scanner.nextLine();
        String[] string=input.split(" ");
        Boolean flag1;
        Boolean flag2;
        Boolean flag3;
        int result;

        RimNumber rimNumber =new RimNumber();
        Number number =new Number();
        Sign sign =new Sign();

        //Check RimNumber
        flag1= rimNumber.ExceptionRimNumber(string);

        //Check Number
        flag2= number.ExceptionNumber(string);

        //Check Sign
        flag3= sign.ExceptionSign(string[1]);

        if((flag1==true & flag3==true) | (flag2==true & flag3==true)){
            if(flag2==true){
                result=number.CalculationNumber(string[1],string);
                number.show(result);
            }else{
                result=rimNumber.CalculationRimNumber(string[1],string);
                rimNumber.show(result);
            }
        }else{
            System.out.println("Error");
        }

    }
}
