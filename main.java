import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   int vida=3;
   int felicidad=100;
   int hambre=0;
  Scanner entrada = new Scanner(System.in);
   System.out.println("---MASCOTA---");
   System.out.println("Felicidad: "+felicidad+"     Hambre: "+hambre+"     Vidas: "+vida);
   while (vida!=0){
   System.out.println("1) Jugar   2)Alimentar   3)Comprar alimento    4)Comprar juguete   5)Trabajar    6)Ver inventario");
   System.out.println("> ");
   int accion = entrada.nextInt();
   switch(accion){
     case 1:
   }
 }
 }
}
