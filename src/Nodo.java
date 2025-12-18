import java.util.ArrayList;

public class Nodo {
    String nombre;
    String ip;
    boolean firewall;
    boolean vulnerable;
    boolean comprometido;
    ArrayList<Nodo> vecinos;

    Nodo(String nombre, String ip, boolean firewall, boolean vulnerable) {
        this.nombre = nombre;
        this.vecinos = new ArrayList<>();
        this.ip = ip;
        this.firewall = firewall;
        this.vulnerable = vulnerable;

        // TODO: Realizar constructor//AÑADIDA
    }

        
    void conectar(Nodo otro) {
        if(!vecinos.contains(otro))
            vecinos.add(otro);
        // TODO: conecta este nodo con "otro" (sin duplicados)//AÑADIDA
    }

    public String getNombre(){
        return nombre;
    }

    public ArrayList<Nodo> getVecinos(){
        return vecinos;
    }



    @Override
    public String toString() {
        // TODO: devolver algo tipo: 
        // "WebServer (172.16.0.10) [VULN] [PWN]" etc. //AÑADIDA
        return nombre + ip;
    }



}