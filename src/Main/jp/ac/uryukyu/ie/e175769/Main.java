package jp.ac.uryukyu.ie.e175769;

public class Main {
    public static void main(String[] args) {
        try {
            String str = "3．14";
            double value = Double.parseDouble(str);
            //System.out.println(str.length());
        }
        catch(NumberFormatException e){
            System.out.println(e.toString()+"が発生");
            System.out.println(e.getMessage());
        }
    }
}

