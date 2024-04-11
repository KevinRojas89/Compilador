package inter;

public class Instr extends Nodo {
    public Instr() { }

    public static Instr Null = new Instr();

    public void gen(int b, int a) {
        // Se llama con etiquetas inicio y después
    }

    int despues = 0; // Almacena la etiqueta después

    public static Instr Circundante = Instr.Null; // Se utiliza para instrucciones break
}
