/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenu1;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author HP
 */
public class OperacionListas {
    ArrayList <String> comparacion;
    List  ListaNueva=new ArrayList ();
     
        int elemento;
       
     
    public void InsertarDatos()
    {
        Scanner leer=new Scanner (System.in);
       for(int i=0;i<10;i++) {
        System.out.println("Ingresa los datos a la lista-- > ");
        elemento=leer.nextInt();
        ListaNueva.add(elemento);
    
       }

    }
    
    public void Sumar()
    {
       
        Scanner leer=new Scanner (System.in);
          int a,b,c,s=0;
        ListaNueva.iterator();
        System.out.println(ListaNueva);
        
        System.out.println("Inserta el 1");
       a=leer.nextInt();
       System.out.println("Inserta el 2");
       b=leer.nextInt();
       System.out.println("Inserta el 3");
       c=leer.nextInt();
       
        for(int i=0;i<ListaNueva.size();i++){
          if(ListaNueva.contains(a &b &c)){
            s=a+b+c;
              
              
          }
                
         
        
    }
         System.out.println("la suma es --> "+s);
    }
    public void Resta()
    {
        Scanner leer=new Scanner (System.in);
       
            
       int a,b,c,r=0;
        System.out.println("Ingresa el 1---->");
        a=leer.nextInt();
       System.out.println("Ingresa el 2---->");
        b=leer.nextInt();
        System.out.println("Ingresa el 3---->");
        c=leer.nextInt();
        
for(int i=0;i<ListaNueva.size();i++){
          if(ListaNueva.contains(a &b &c)){
            r=a-b-c;
             
          }
                
          
        
    
       
     }  
 System.out.println("la resta es --> "+r);
              
    }
   
    
    public void Multiplicacion()
    {
          
         Scanner leer=new Scanner (System.in);
         int a,b,m=0;
        System.out.println("Ingresa el primer datoo---->");
        a=leer.nextInt();
       System.out.println("Ingresa el primer datoo---->");
        b=leer.nextInt();
        
                for(int i=0;i<ListaNueva.size();i++){
          if(ListaNueva.contains(a &b )){
            m=a*b;
             
              
          }
                
            
                }  
            System.out.println("la multiplicacion es --> "+m);
    }
    
    
    
    
    public void Menu()
{
        Scanner leer=new Scanner(System.in); 
        int opcion,opc;
        
        do{
        System.out.println("**********************************************");
        System.out.println("++++++++++++++Operacion de la Lista  ++++++++++++++++");
        System.out.println("1.- Ingresar datos a la lista ");
        System.out.println("2.- suma de 3  ");
        System.out.println("3.- Resta de 3 .");
        System.out.println("4.-multiplicacion ");
        System.out.println("5.- Salir  ");
        System.out.println("**********************************************");
            System.out.println("Elige una opcion ---->");
        opcion=leer.nextInt();
        switch(opcion){
            case 1:
                InsertarDatos();
            break;
                
            case 2:
                Sumar();

            break;
                
            case 3:
                Resta();
            break;
                
            case 4:
             Multiplicacion();
            break;
                
            case 5:
                System.out.println("Gracias por utilizar el programa!");
            break;    
                
                
                
            default:
                System.out.println("Opcion incorrecta favor de elegir una opción correcta!");
        }
        
        
        
            System.out.println("¿Deseas repetir el menu ?\n1-->Si\n6-->No");
            opc=leer.nextInt();
        }
        
        
        while( opc ==1 );
        if( opc == 5 ){
            System.out.println("¡Gracias por utilizar el programa!");
            
            
            
            
            
        }
    }
    
    
    
    
    
    
    
}
