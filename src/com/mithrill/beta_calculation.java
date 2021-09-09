package com.mithrill;

public class beta_calculation {

    private final int [] val_x;
    private final int [] val_y;

    public beta_calculation(int[] val_x, int[] val_y) {
        this.val_x = val_x;
        this.val_y = val_y;
    }

    public double beta_0(){
        return (double) (this.sum_xsqr() * this.sum_y() - this.sum_x() * this.sum_xy()) / (this.val_x.length *
                this.sum_xsqr() - this.sum_x() * this.sum_x());
    }

    public double beta_1(){
        return (double) (this.val_x.length * this.sum_xy() - this.sum_x() * this.sum_y()) / (this.val_x.length *
                this.sum_xsqr() - this.sum_x() * this.sum_x());
    }

    private int sum_x(){
        int sum_x = 0;
        for (int itm : this.val_x){
            sum_x += itm;
        }
        return sum_x;
    }

    private int sum_y(){
        int sum_y = 0;
        for (int itm : this.val_y){
            sum_y += itm;
        }
        return sum_y;
    }

    private int sum_xy(){
        int sum_xy = 0;
        for (int i = 0; i < this.val_x.length; i++) {
            sum_xy += (this.val_x[i] * this.val_y[i]);
        }
        return sum_xy;
    }

    private int sum_xsqr(){
        int sum_xsqr = 0;
        for (int itm : this.val_x) {
            sum_xsqr += (itm * itm);
        }
        return sum_xsqr;
    }
}
