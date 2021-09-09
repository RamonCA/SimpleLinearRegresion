package com.mithrill;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] x = {23,26,30,34,43,48,52,57,58};
        int [] y = {651,762,856,1063,1190,1298,1421,1440,1518};

        beta_calculation test = new beta_calculation(x,y);

        double beta_0 = test.beta_0();
        double beta_1 = test.beta_1();

        System.out.println("punto de interseccion: " + beta_0 + " pendiente: " + beta_1);
    }
}
