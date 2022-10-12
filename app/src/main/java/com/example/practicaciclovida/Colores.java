package com.example.practicaciclovida;

import android.graphics.Color;

public class Colores {
    private Colores color;
    private int[] arrayColores;
    private int[] arrryColores2;
    /////
    private int poss ;

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public int getPoss() {
        return poss;
    }

    public void setPoss(int poss) {
        this.poss = poss;
    }

    public Colores(){
        int pos = 0;
        int[]arr= {Color.GREEN, Color.BLUE,Color.RED};
        int[]arrry={Color.CYAN, Color.DKGRAY,Color.GRAY, };

        this.arrayColores= arr;
        this.arrryColores2=arrry;


    }
    public int genColor(){

        if(this.getPoss()>= this.getArrayColores().length-1){
            this.setPoss(0);
        }
        else {
            this.setPoss(this.getPoss()+1);
        }
        return this.getArrayColores()[this.getPoss()];

    }

   /* public int genTextColor(){
        if(this.getPos()>= this.getArrayColores().length-1){
            this.setPos(0);
        }
        else {
            this.setPos(this.getPos()+1);
        }
        return this.getArrayColores()[this.getPos()];
    }*/



///////////////////////////////////////////////////////////////////////

    public int genColores2(){

        if(this.getPoss()>= this.getArrryColores2().length-1){
            this.setPoss(0);
        }
        else {
            this.setPoss(this.getPoss()+1);
        }
        return this.getArrryColores2()[this.getPoss()];

    }

    public int[] getArrayColores() {
        return arrayColores;
    }

    public void setArrayColores(int[] arrayColores) {
        this.arrayColores = arrayColores;
    }


    public int[] getArrryColores2() {
        return arrryColores2;
    }

    public void setArrryColores2(int[] arrryColores2) {
        this.arrryColores2 = arrryColores2;
    }



}
