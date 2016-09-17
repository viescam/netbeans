/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagithub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Vicente
 */
public class PruebaGITHUB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
        int n1,n2;
        System.out.println("Introduce un numero");
        n1=Integer.parseInt(tec.readLine());
        System.out.println("Introduce otro numero");
        n2=Integer.parseInt(tec.readLine());
        System.out.println("Los numeros introducidos son "+n1+" y "+n2);
    }
    
}
