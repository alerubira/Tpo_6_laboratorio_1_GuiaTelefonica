
package tpo_6_laboratorio_1_guiatelefonica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/*Un directorio telefónico posee una lista de Clientes de los que interesa conocer su dni, 
nombre, apellido, ciudad y dirección.
El directorio telefónico posee además las siguientes funcionalidades:

*/

public class Directorio {
    
    private  HashMap<String,Cliente> mapClientes=new HashMap<>();

    public Directorio() {
    }
    
    /*�? agregarCliente() que permite registrar un nuevo cliente con su respectivo nro de 
    teléfono. Siendo el nro del teléfono la clave del mismo.*/
    public void agreagarCliente(){
        
    }
   /*buscarTel�fono() que en base a un apellido nos devuelve una lista con los nros de
    tel�fono asociados a dicho apellido.*/ 
    public void buscarTelefono(String apellido)
    {
        
    }
    /*�? buscarCliente() que en base al nro de teléfono retorna el Cliente asociado al 
mismo.*/
    public void buscarCliente(){
        
    }
    /*�? buscarClientes() que en base a una ciudad nos devuelve una lista con los Clientes 
asociados a dicha ciudad.*/
    public void buscarClientes(String ciudad){
        ArrayList<Cliente>clientes=new ArrayList();
        Iterator<String> it=mapClientes.keySet().iterator();
        while(it.hasNext()){
            
        }
    }
    //�? borrarCliente() que en base al número de teléfono elimina al cliente del directorio.
    public void borrarCliente(){
        
    }
}
