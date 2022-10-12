
public class Elementos implements Comparable<Elementos>{

    private final int a;
    private final int[] elementos;
    private int i;

    public Elementos(int a, int[] elementos, int i){
        this.a = a;
        this.elementos = elementos;
        this.i = i;
    }

    public void linearSearch() {

        for(i = 0; i < this.elementos.length; i++)
        {
            if (compareTo(new Elementos(this.a, this.elementos, i)) == 1){
                System.out.println("Achei " + this.elementos[i] + " na posicao " + i);
                System.exit(0);
            }

        }
        System.out.println("Elemento não encontrado :( ");
    }

    @Override
    public int compareTo(Elementos o) {
        if (this.a == o.elementos[i])
            return 1;

        return -1;
    }
}
