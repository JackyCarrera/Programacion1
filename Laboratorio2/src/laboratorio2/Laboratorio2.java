/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;

import java.util.Scanner;

/**
 *
 * @author Jacky
 */
public class Laboratorio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
persona a[]= new persona[4];
String nombre="";
int sueldo=0;
float igss=0;
float isr=0;
float isrt=0;
for(int i=0;i<a.length;i++){
    System.out.println("Ingrese Un nombre y un apellido: ");
    nombre= leer.nextLine();
    System.out.println("Ingrese Sueldo minimo: ");
    sueldo= leer.nextInt();
    leer.nextLine();
  a[i] = new persona(nombre,sueldo,igss,isrt,isr);
  
}System.out.println("Nombre               Sueldo   IGSS   ISR");
for(int i=0;i<a.length;i++){
    
    System.out.println(a[i].getnombre()+"        "+a[i].getsueldo()+"   "+a[i].getigss()+"  "+a[i].getisrt()+"  ");
}

       
        
        
    }
    
    
        

    
    
    
}
