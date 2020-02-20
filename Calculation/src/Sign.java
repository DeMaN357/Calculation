public class Sign {

    public Boolean ExceptionSign(String s) {
        String [] str= new String[]{"*","/","+","-"};
        Boolean fl=false;
        int i=0;
        while(i<str.length & fl==false){
            if(str[i].equals(s)==true){
                fl=true;
            }
            i++;
        }
        return fl;
    }
}
