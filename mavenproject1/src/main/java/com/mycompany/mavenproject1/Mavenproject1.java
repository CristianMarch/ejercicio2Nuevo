/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author kicho
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        int matriz[][] = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    matriz[i][j] = 8;
                } else if(i == (matriz.length-1-j)){
                    matriz[i][j] = 1;
                    
                }else{
                    matriz[i][j] = 0;
                }
            }
        }
            for ( int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print(" ["+ matriz[i][j]+ "]");
                }
                System.out.println("");
            }   
            System.out.println("Hola! Soy Pablo");
            }
    
        }

class Caro{
    int num1=2;

    public Caro() {
        for (int i = 0; i < 10; i++) {
            System.out.println("&&&&&&&&&&");
        }
    }
    
    
    
    

}
