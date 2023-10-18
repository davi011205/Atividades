// Nesta atividade você deverá implementar uma pilha encadeada.
// Na atividade foi anexado um arquivo contendo uma interface que deverá ser implementada pela pilha, um esboço da classe na qual você deverá codificar a pilha e o programa principal (classe Main), que executará testes para verificação da corretude da estrutura de dados implementada.
// Modifique a classe Pilha, incluindo código que for necessário para que os métodos funcionem. Você poderá, inclusive, acrescentar outras classes que considerar necessárias.
// Inclua os modificadores acesso que julgar convenientes, com base no que foi apresentado na aula aula teórica.
// Não modifique o código da função main.

import java.util.Scanner;

class Pilha {

    class Celula{
        public int item;
        public Celula proxima;

        public Celula(int valor, Celula proxima) {
            this.item = valor;
            this.proxima = proxima;
        }

        public Celula() {
            this.proxima = null;
        }

        public Celula getProxCel(){
            return proxima;
        }

        public int getItem() {
            return item;
        }
    }

    public int cont=0;
    public Celula topo;

    public Pilha() {
        Celula topo = new Celula();
    }


    /**
     * Adiciona <code>item</code> no final da pilha.
     */
    void empilhar(int valor) {
        cont++;
        topo = new Celula(valor,topo);
    }

    /**
     * Remove um <code>item</code> no topo da pilha.
     * return <code>item</code> no topo da pilha ou <code>null</code> se a pilha estiver vazia.
    */
    Integer desempilhar() {
        if (!vazia()) {
            cont--;
            int valor = topo.getItem();
            topo = topo.getProxCel();
            return valor;
        }
        return null;
    }

    /**
     * Recupera <code>item</code> no topo da pilha, sem remover.
     * @return <code>item</code> no topo da pilha ou <code>null</code> se a pilha estiver vazia.
     */
    Integer getItem() {
        if (!vazia()) {
            return topo.getItem();
        }
        return null;
    }

    /**
     * Recupera número de itens na pilha.
     * @return Número de itens mantidos na pilha.
     */
    int tamanho() {
        return cont;
    }

    /**
     * Retorna <code>true</code> se a pilha não possuir qualquer <code>item</code>.
     * @return <code>true</code> se a pilha não possuir qualquer <code>item</code>, 
     * ou <code>false</code> se possuir.
     */
    boolean vazia() {
        return topo == null;
    }

    /**
     * Retorna um array contendo todos os itens da pilha.
     * @return um array com todos os elementos da pilha <code>null</code> se a pilha estiver vazia.
     */
    Integer[] toArray() {

        if(!vazia()) {

            Celula anterior;

            Integer itens[] = new Integer[cont];
            itens[0] = topo.getItem();
            anterior = topo.getProxCel();

            for(int i = 1; i < cont; i++) {
                itens[i] = anterior.getItem();

                anterior = anterior.getProxCel();
            }

            return itens;
        }

        return null;
    }
}

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pilha pilha = new Pilha();
        String token;
        Integer valor;
       
        token = scan.next();
        while (!token.equals("Q")) {
            switch(token) {
                case "E":
                    valor = scan.nextInt();
                    pilha.empilhar(valor);
                    break;
                case "D":
                    valor = pilha.desempilhar();
                    if (valor == null)
                        System.out.println("NenhumItemException");
                    break;
                case "G":
                    valor = pilha.getItem();
                    if (valor != null)
                        System.out.println(valor);
                    else
                        System.out.println("NenhumItemException");
                    break;
                case "T":
                    System.out.println(pilha.tamanho());
                    break;
                case "V":
                    System.out.println(pilha.vazia());
                    break;
                case "P":
                    Integer valores[] = pilha.toArray();
                    if (valores != null) {
                        for(Integer item: valores)
                            System.out.println(item);
                    }
                    break;
            }
            token = scan.next();
        }
    }
}