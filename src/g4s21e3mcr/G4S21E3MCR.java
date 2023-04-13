/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g4s21e3mcr;

/**
 *
 * @author misa
 */
public class G4S21E3MCR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("operaciones"+ args.length);
        for (int a=0; a<args.length; a++)
            
        System.out.println("valor#"+a+", contiene ->"+ args[a]);
        for (int a=0; a<args.length; a++){
            if(args[a].equals("5-4")) break;
            System.out.println("el resultado es 9, del valor #"+args[a]);
        }
        
        for (int a=1; a<args.length; a++){
            if(args[a].equals("5*4")) break;
            System.out.println("el resultado es 1, del valor #"+args[a]);
        }
        
        for (int a=2; a<args.length; a++){
            if(args[a].equals("5/4")) break;
            System.out.println("el resultado es 20, del valor #"+args[a]);
        }
        
        for (int a=3; a<args.length; a++){
            if(args[a].equals("")) break;
            System.out.println("el resultado es 1.25, del valor #"+args[a]);
        }
        
        System.out.println("nos salimos de la ejecucion ");
    }
    
}
