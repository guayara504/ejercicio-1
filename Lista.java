
package linkedlist;
import javax.swing.JOptionPane;

public class Lista {
    
    private Nodo cabeza;
    
    private int contador = 0;

    public int getContador() {
        return contador;
    }
    
    
    public void AddNodo(Nodo n){
         Nodo k = cabeza;
        contador++;
        if(k==null){
            cabeza = n;
            cabeza.setSiguiente(null);
           
        }else{
            for(k = cabeza; k.getSiguiente() != null; k= k.getSiguiente()){
                
            }
            n.setAnterior(k);
            k.setSiguiente(n);
            n.setSiguiente(null);
            
        }
    }
    
    public void AddHead(Nodo n){
        contador++;
        
        if(cabeza==null){
            cabeza= n;
        }else{
            n.setSiguiente(cabeza);
            cabeza=n;
        }
        
        
    }
    
    
    public void Remove(String estudiante){
        contador--;
        Nodo k;
        
        if(contador>0){
            for(k=cabeza;k.getSiguiente()!=null;k=k.getSiguiente()){
                if(k.getEstudiante().trim().equals(estudiante.trim())){
                    if(cabeza== k){
                        cabeza = cabeza.getSiguiente();
                    }else{
                        k.getAnterior().setSiguiente(k.getSiguiente());
                    }
                }
            }
                if(k.getSiguiente()==null){
                    if(k.getEstudiante().trim().equals(estudiante.trim())){
                        
                        k.getAnterior().setSiguiente(null);
                
                    }
                }
        }
        
     
        
    }
    
    

    

    public void Print(){
        
        if(cabeza==null){
            JOptionPane.showMessageDialog(null, "La lista está vacia");
        }else{
         int contadorLista=1;  
        Nodo i = cabeza;
            JOptionPane.showMessageDialog(null, "Lista estudiantes:\n");
        while(i!=null){
           JOptionPane.showMessageDialog(null," \n Estudiante "+contadorLista+": "+ i.getEstudiante());
           i =i.getSiguiente();
           contadorLista++;
           
        }
            
        }
        
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
