/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repaso;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;


/**
 *
 * @author JoséMiguel
 */
public class ejercicios {
    public double resultado;
    public static void main(String[] args) {
        // aqui se invoca
        
        //ejercicio1();
        ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
        //ejercicio9();
        
    }
    public static void ejercicio1(){
             int num1, num2, sum, res, residuo1, residuo2;
            System.out.println ("coloque el primer numero");
             Scanner p = new Scanner(System.in);
             num1= p.nextInt();
             System.out.println ("coloque el segundo numero");
             Scanner k = new Scanner(System.in);
             num2= k.nextInt();
             sum= num1+num2;
             res=num1-num2;
             if (num2>num1) {
                 res=num2-num1;
                 
             }
             residuo1= num1%2;
             residuo2= num2%2;
              System.out.println (+num1+ "+" +num2);
             System.out.println ("La suma entre los numeros es " +sum);
             System.out.println (+num1+ "-" +num2+ " o " +num2+"-"+num1 );
             System.out.println ("La resta entre los numeros es  " +res);
             System.out.println (+num1+ "%2");
             System.out.println ("El residuo del primer numero es "+residuo1);
             System.out.println (+num2+ "%2");
             System.out.println ("El residuo del segundo numero es "+residuo2);
        
        
             
         }
    public static void ejercicio2(){
            String animal;
            System.out.println ("coloque el animal");
            Scanner variable=new Scanner(System.in);
            animal=variable.nextLine();
            
              if ("Mono".equalsIgnoreCase(animal)) {
                  
                  System.out.println ("Mamifero");
              }
              
               if ("Tucan".equalsIgnoreCase(animal)) {
                  
                  System.out.println ("Ave");
              }
               if ("Serpiente".equalsIgnoreCase(animal)) {
                  
                  System.out.println ("Reptil");
              }
               if ("Rana".equalsIgnoreCase(animal)) {
                  
                  System.out.println ("Anfibio");
              }
               if ("Atun".equalsIgnoreCase(animal)) {
                  
                  System.out.println ("Peces");
              }
              
             
          }
    public static void ejercicio3(){
              int num;
              num= Integer.parseInt(JOptionPane.showInputDialog(null, "escriba el numero"));
             switch(num){
                 case 1: num= 1;
                     System.out.println ("DO");
                     break;
                  case 2: num= 2;
                     System.out.println ("RE");
                       break;
                  case 3: num= 3;
                     System.out.println ("MI");
                       break;
                  case 4: num= 4;
                     System.out.println ("FA");
                       break;
                   case 5: num= 5;
                     System.out.println ("SOL");
                        break;
                    case 6: num= 6;
                     System.out.println ("LA");
                         break;
                   case 7: num= 7;
                     System.out.println ("SI");
                        break;
                        
             }
    
}
    public static void ejercicio4(){
              int num;
              num= Integer.parseInt(JOptionPane.showInputDialog(null, "escriba el numero"));
              for (int i = 0; i<=num ; i++) {
                  System.out.println (i);
              }
          }
           public static void ejercicio5(){
               int num;
              num= Integer.parseInt(JOptionPane.showInputDialog(null, "escriba el numero"));
              for (int i = 0; i<=num ; i= i+3) {
                  System.out.println (i);
              }
           }
           public static void ejercicio6(){
               int num;
              num= Integer.parseInt(JOptionPane.showInputDialog(null, "escriba el numero"));
              if(num%2==0){
                  System.out.println("Es par");
              }
              else{
                  System.out.println("Es impar");
              }
              
               
           }
           public static void ejercicio7(){
               int n1=0, n2=1;
               int p, l=999999999; 
               System.out.println(n1);
               System.out.println(n2);
               while(n2+n1<= l){
                   p=n1;
                   n1=n2;
                   n2= p+n1;
                   System.out.println(n2);
               }
           }
            public static void ejercicio8(){
                int num, i=1, denegado=0;
                num= Integer.parseInt(JOptionPane.showInputDialog(null, "escriba el numero"));
                while (i<=3){
                    Random aleatorio = new Random();
                     int azar=  aleatorio.nextInt(10);
                       if(num==azar){
                        System.out.println("Acceso permitido");
                       }
                       else{
                            System.out.println("Acceso denegado");
                            denegado++;
                        
                            
                       } 
                         if(denegado==3){
                                System.out.println("Clave bloqueada");
                            }
                          i++;
                    }
                 
                }
            public static void ejercicio9(){ //
                int numper;
                numper= Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba numero de persona"));
                for (int i = 0; i < numper; i++) {
                   int edad, dinero;// "La cantidad de dinero que genera al mes determinara su estrato", "Empleado o desempleado"
                   int altura, peso;
                   edad= Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba la edad de las personas"));
                   dinero= Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba el dinero que genera por mes (En pesos)"));
                   altura= Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba su altura"));
                   peso= Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba su peso"));
                    if(edad<18){
                        System.out.println("Es menor de edad");
                    }
                    if(edad>18){
                        System.out.println("Es mayor de edad");
                    }
                    if(dinero<10000){
                        System.out.println("Es de estrato 1");
                    }
                    if(dinero>10000&& dinero<500000){
                        System.out.println("Es de estrato 2");
                    }
                    if(dinero>500000){
                        System.out.println("Es de estrato 3");
                    }
                    if(peso+20>altura){
                        System.out.println("Tiene sobrepeso");
                    }
                    if(peso<altura){
                        System.out.println("Peso normal");
                    }
                }
               
                
            }
          
            //ALTERNATIVO
           // public  void ejercicio10(double n1, double n2 ){
                //double mul;
               // mul= n1*n1 + n2*n2;
                
                //resultado =Math.sqrt(mul);
                
                
                
                
            //}
}

