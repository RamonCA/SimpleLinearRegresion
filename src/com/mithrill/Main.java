package com.mithrill;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] x = {23,26,30,34,43,48,52,57,58};
        int [] y = {651,762,856,1063,1190,1298,1421,1440,1518};

        int arg = 0;

        for (String itm : args) {
            try{
                arg = Integer.parseInt(itm);
            }catch(NumberFormatException e){
                System.out.println("Error por favor ingrese un numero entero positivo");
            }

        }



        beta_calculation test = new beta_calculation(x,y,arg);
        test.point_calculation();
    }
}
