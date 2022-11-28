public class ArvoreBinaria {
    
    public static void main (String[] args){

        Arvore<Integer> arvore = new Arvore<Integer>();
        arvore.adicionar (50);
        arvore.adicionar (45);
        arvore.adicionar(55);
        arvore.adicionar(42);
        arvore.adicionar(48);
        arvore.adicionar(52);
        arvore.adicionar(58);
        arvore.adicionar(38);
        arvore.adicionar(43);
        arvore.adicionar(46);
        arvore.adicionar(51);
        arvore.adicionar(49);
        arvore.adicionar(53);
        arvore.adicionar(56);
        arvore.adicionar(60);
        arvore.adicionar(35);
        arvore.adicionar(40);
        arvore.adicionar(45);
        arvore.adicionar(32);
        arvore.adicionar(44);
        arvore.adicionar(47);

        System.out.println("\n\nEm-Ordem");
        arvore.emOrdem(arvore.getRaiz());

        System.out.println("\n\nPré-Ordem");
        arvore.preOrdem(arvore.getRaiz());

        System.out.println("\n\nPós-Ordem");
        arvore.posOrdem(arvore.getRaiz());
    }
}
