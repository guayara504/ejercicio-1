
package linkedlist;

import javax.swing.JOptionPane;


public class LinkedList {

    
    public static void main(String[] args) {
        Lista registro =new Lista();
        
        Nodo e;
        int respuesta;
        String borrar;
        
        do{
        respuesta =Integer.parseInt(JOptionPane.showInputDialog(null,"1) Agregar estudiante\n2)Agregar a la cabeza\n3)remover por nombre\n4)Mostrar lista\n5)Salir"));
        switch(respuesta){
            case 1:
                
                e =new Nodo();
                e.setEstudiante(JOptionPane.showInputDialog("Digite un nombre: "));
                registro.AddNodo(e);
                break;
            case 2:
                e =new Nodo();
                e.setEstudiante(JOptionPane.showInputDialog("Digite un nombre: "));
                registro.AddHead(e);
                break;
            case 3:
              
              borrar=(JOptionPane.showInputDialog(null, "Nombre del estudiante:"));
              registro.Remove(borrar);
              break;
            
            case 4:
                registro.Print();
               break;
               
            case 5:
                JOptionPane.showMessageDialog(null, "Ejecucion finalizada");
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                break;
        }
      
        }while(respuesta!=5);
        
        
        
        
    }
    
}
