/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jurnal.no.pkg1;

import java.util.Scanner;

/**
 *
 * @author Praktikum
 */
public class JurnalNo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=0;
        int b=0;
        int a=1;
        Scanner input=new Scanner(System.in);
        System.out.print("Angka: ");
        n =input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(a);
            a=a+b;
            b=a;
        }
    }
    
}
