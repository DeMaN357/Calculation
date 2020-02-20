public class Number {

    static Boolean ExceptionNumber(String[] string) {
        Boolean fl = true;
        try {
            Integer.parseInt(string[0]);
            Integer.parseInt(string[2]);
        } catch (NumberFormatException e) {
            fl = false;
        }
        if(fl==true){
            if((Integer.parseInt(string[0])<1 | Integer.parseInt(string[0])>10) | (Integer.parseInt(string[2])<1 | Integer.parseInt(string[2])>10)){
                fl=false;
            }
        }
        return fl;

    }

    public int  CalculationNumber(String s, String[] strings) {
        int res=0;
        if(s.equals("+")){
            res=Integer.parseInt(strings[0]) + Integer.parseInt(strings[2]);
        }else if(s.equals("-")){
            res=Integer.parseInt(strings[0]) - Integer.parseInt(strings[2]);
        }else if(s.equals("*")){
            res=Integer.parseInt(strings[0]) * Integer.parseInt(strings[2]);
        }else if(s.equals("/")){
            res=Integer.parseInt(strings[0]) / Integer.parseInt(strings[2]);
        }
        return res;
    }

    public void show(int result) {
        System.out.println(result);
    }
}
