
package figuras.geometricas;
import java.util.Scanner;
import javax.swing.JOptionPane;

 //@author BRAHAYAM CARDENAS CARDENAS 

public class FigurasGeometricas {

    
    public static void main(String[] args) {
        
        Scanner sn =new Scanner(System.in);
        
        boolean salir=false;
        int opcion;
        
        
        // 
        do{
             
           
            System.out.println("****MENU FIGURAS GEOMETRICAS**** ");
            System.out.println("1.CIRCULO ");
            System.out.println("2.CUADRADO");
            System.out.println("3.TRIANGULO");
            System.out.println("4.RECTANGULO");
            System.out.println("4.SALIR");
            System.out.println("ELIGE UNA OPCION");
            opcion= sn.nextInt();
            
            
            
                
           
            switch(opcion){
                 case 1:
                    
                    circulo();
                    
                     break;
                case 2:
                    
                    cuadrado();
                    
                     break;
                case 3:
                    
                    triangulo();
                    
                     break;
                
                case 4:
                    rectangulo();
                    
                    break;
                case 5:    
                    salir=true;
                    System.out.println("QUE TENGA UN BUEN DIA  ");
                     break;
                    
                    
                default:
                    System.out.println("INGRESAR UN VALOR ENTRE  1-4");
                    
              
            
            
            
            }
        
        
        
        
        
        }while(!salir);
        
        System.out.println("FIN");
        
        
        
        
        
    }
    public static void circulo(){
    Scanner entrada =new Scanner(System.in);
    double pi=3.1416;
    double radio;
    double area;
    double perimetro;
    boolean salir=false;
    int opcion;
    do{
        System.out.println("***CIRCULO***");
        System.out.println("1.DESEA CALCULAR EL AREA ");
        System.out.println("2.DESEA CALCULAR EL PERIMETRO ");
        System.out.println("3.REGRESAR AL MENU PRINCIPAL");
        System.out.println("ELIGE UNA OPCION: ");
        opcion= entrada.nextInt();
        switch(opcion){
            case 1:
                 System.out.println("INRESE EL VALOR DEL RADIO ");
                 radio=entrada.nextInt();
                 area=pi*Math.pow(radio, 2);
                 System.out.println("el area del circulo es:"+" "+area);
                break;
                
                 
            case 2:
                System.out.println("INRESE EL VALOR DEL RADIO ");
                radio=entrada.nextInt();
                perimetro=2*radio*pi;
                System.out.println("el perimetro  del circulo es:"+" "+perimetro);
               
                break;
            case 3:
                
                salir=true;
                break;
        } 
        
    }while(salir==false);
    
    
    
}  

    
    
    
    
  public static void cuadrado (){
     Scanner entrada =new Scanner(System.in);
     double lado1;
     double perimetro;
     double area;
     boolean salir=false;
     int opcion;
      do{
        System.out.println("***CUADRADO***");
        System.out.println("1.DESEA CALCULAR EL AREA ");
        System.out.println("2.DESEA CALCULAR EL PERIMETRO ");
        System.out.println("3.REGRESAR AL MENU PRINCIPAL");
        System.out.println("ELIGE UNA OPCION: ");
        opcion= entrada.nextInt();
        switch(opcion){
            case 1:
                 System.out.println("INRESE EL VALOR DE ALGUN LADO DEL CUADRADO ");
                 lado1=entrada.nextInt();
                 area=Math.pow(lado1, 2);
                 
                 System.out.println("EL AREA DEL CUADRADO ES:"+" "+area);
                break;
                
                 
            case 2:
                System.out.println("INRESE EL VALOR DE ALGUN LADO DEL CUADRADO ");
                lado1=entrada.nextInt();
                perimetro=4*lado1;
              
                System.out.println(" EL PERIMETRO DEL CUADRADO ES:"+" "+perimetro);
               
                break;
                
            case 3:
                salir==true;
        } 
        
    }while(salir==false);
    
    
}
  public  static void triangulo(){
      Scanner entrada =new Scanner(System.in);
       int lado1,lado2,lado3;
       boolean salir=false;
       int opcion;
         do{
        System.out.println("***TRIANGULO***");
        System.out.println("1.DESEA CALCULAR TIPO DE TRIANGULO ");
        System.out.println("2.DESEA CALCULAR EL AREA DEL TRIANGULO");
        System.out.println("3.REGRESAR AL MENU PRINCIPAL");
        System.out.println("ELIGE UNA OPCION: ");
        opcion= entrada.nextInt();
        switch(opcion){
            case 1:
                  System.out.println("INRESE MEDIDA DEL LADO 1");
                  lado1=entrada.nextInt();
                  System.out.println("INRESE MEDIDA DEL LADO 2");
                  lado2=entrada.nextInt();
                  System.out.println("INRESE MEDIDA DEL LADO 3"); 
                  lado3=entrada.nextInt();
                  if(lado1==lado2 && lado1==lado3)
                  System.out.println("EL TRIAANGULO ES EQUILATERO");
                  if((lado1==lado2 && lado1!=lado3)||(lado2==lado3 && lado2!=lado1)||(lado3==lado1 && lado3!=lado2))
                  System.out.println("EL TRIANGULO ES ISOCELES");
                  if(lado1!=lado2 && lado1!=lado3 && lado2!=lado3)
                  System.out.println("EL TRIANGULO ES ESCALENO");
            
          
                  break;
                
                 
            case 2:
                
       
       float base;
       float altura;
       float area;
       System.out.println("INRESE LA BASE DEL TRIANGULO");
        base=entrada.nextInt();
        System.out.println("INRESE LA ALTURA DEL TRIANGULO");
        altura=entrada.nextInt();
        area=(base*altura)/2;
        System.out.println("el area del Triangulo es:"+" "+area);
        break;
        
        case 3:
             salir==true;
          break;
          
        
    }while(!salir);
    
    
    public static void rectangulo(){
        
    }
    
    
        
            
          }
  
  
        
      

      
    
    
      
