 import java.util.ArrayList;

 public class Red {
        ArrayList<Nodo> nodos;

        Red() {
            nodos = new ArrayList<>();
             // TODO: Realizar constructor //AÑADIDA
        }

        void agregarNodo(Nodo n) {
            if (!nodos.contains(n))
                nodos.add(n);
            // TODO: añade nodo a la red //AÑADIDA
        }

        void conectar(Nodo a, Nodo b) {
            a.conectar(b);
            b.conectar(a);
            // TODO: conecta a <-> b (bidireccional)//AÑADIDA
        }

        
        void mostrar() {
                System.out.println("===GRAFO===");
                for (Nodo n : nodos){
                    System.out.println(n.getNombre() + "-->" + n.getVecinos());

                }
            // TODO: imprime topología (nodo -> vecinos)//AÑADIDA
        }
        
        void resetCompromisos() {
            // TODO: poner comprometido=false a todos los nodos
        }

        void escanearDesde(Nodo origen) {
            // TODO: BFS desde origen - https://www.geeksforgeeks.org/dsa/breadth-first-search-or-bfs-for-a-graph/
            // Reglas:
            // - si un nodo visitado es vulnerable => comprometido=true
            // - si un nodo visitado es firewall => NO se propaga a sus vecinos
        }

        Nodo buscarPorIP(String ip) {
            // Buscar por IP (iterar nodos)
            return null;
        }
  
        int contarVulnerablesAlcanzables(Nodo origen) {
            // Contar vulnerables alcanzables desde origen (BFS)
            return 0;
        }

        String listarVecinosDe(Nodo n) {
            // Listar vecinos (iterar vecinos)
            return "";
        }

        ArrayList<Nodo> nodosAislados() {
            // Obtener nodos aislados (vecinos.size()==0)
            return new ArrayList<>();
        }
    }
