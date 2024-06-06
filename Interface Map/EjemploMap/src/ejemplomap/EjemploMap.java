import java.util.HashMap;
import java.util.Map;

public class EjemploMap {
    public static void main(String[] args) {
    
        Map<String, Integer> edades = new HashMap<>();
        

        edades.put("Juan", 25);
        edades.put("María", 30);
        edades.put("Pedro", 20);
        edades.put("Laura", 35);
        
      
        System.out.println("Contenido del mapa: " + edades);
        
  
        System.out.println("Edad de Juan: " + edades.get("Juan"));
        
     
        System.out.println("¿El mapa contiene la clave 'María'? " + edades.containsKey("María"));
        System.out.println("¿El mapa contiene la clave 'Ana'? " + edades.containsKey("Ana"));
        
    
        System.out.println("¿El mapa contiene el valor 30? " + edades.containsValue(30));
        
       
        edades.remove("Pedro");
        System.out.println("Contenido del mapa después de eliminar 'Pedro': " + edades);
        
 
        System.out.println("Tamaño del mapa: " + edades.size());
        
    
        System.out.println("¿El mapa está vacío? " + edades.isEmpty());
        
 
        edades.clear();
        System.out.println("Contenido del mapa después de limpiar: " + edades);
    }
}
