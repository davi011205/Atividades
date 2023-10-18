// Nesta atividade você deverá implementar uma lista simplesmente encadeada genérica, implementada com o tipo Object, e com tratamento de exceções.
// Na atividade foi anexado um arquivo contendo uma implementação de uma lista simplesmente encadeada de inteiros e o programa principal (classe Main), que executará testes para verificação da corretude das estruturas de dados implementadas.

import java.util.Scanner;

class PosicaoInvalidaException extends RuntimeException {

    public PosicaoInvalidaException() {
        super("PosicaoInvalidaException");
    }
}

class NenhumItemException extends RuntimeException {

    public NenhumItemException() {
        super("NenhumItemException");
    }
}

class List {

    private No inicio;
    private No fim;
    private int tamanho;

    class No {
        private Object item;
        private No proximo;

        public No(Object item) {
            this(item, null);
        }

        public No(Object item, No proximo) {
            this.item = item;
            this.proximo = proximo;
        }

        public Object getItem() {
            return item;
        }

        public void setItem(Object item) {
            this.item = item;
        }

        public No getProximo() {
            return proximo;
        }

        public void setProximo(No proximo) {
            this.proximo = proximo;
        }
    }

    List() {
        inicio = fim = null;
        tamanho = 0;
    }

    /**
     * Adiciona <code>item</code> no final da deque.
     */
    void adicionarInicio(Object item) {
        No novo = new No(item, inicio);
        inicio = novo;

        tamanho++;
    }

    /**
     * Adiciona <code>item</code> no final da deque.
     */
    void adicionarFim(Object item) {
        No novo = new No(item, null);

        if (!vazia()) {
            fim.setProximo(novo);
            fim = novo;
        }
        else
            inicio = fim = novo;

        tamanho++;
    }

    void adicionar(Object item, int posicao) {
        if (posicao < 0 || posicao > tamanho)
            throw new PosicaoInvalidaException();
        if (posicao == 0)
            adicionarInicio(item);
        else if (posicao == tamanho)
            adicionarFim(item);
        else {
            No aux = inicio;
            for (int i = 1; i < posicao; i++)
                aux = aux.getProximo();

            No novo = new No(item, aux.getProximo());
            aux.setProximo(novo);
            tamanho++;
        }
    }

    /**
     * Remove um <code>item</code> no início da deque.
     * return <code>item</code> no início da deque ou <code>null</code> se a deque estiver vazia.
    */
    Object removerInicio() {
        if (!vazia()) {
            No aux = inicio;
            inicio = inicio.getProximo();

            aux.setProximo(null);
            tamanho--;
            return aux.getItem();
        }
        else
            throw new NenhumItemException();
    }

    /**
     * Remove um <code>item</code> no início da deque.
     * return <code>item</code> no início da deque ou <code>null</code> se a deque estiver vazia.
    */
    Object removerFim() {
        if (!vazia()) {
            No aux = inicio;
            if (tamanho > 1) {
                while(aux.getProximo() != fim)
                    aux = aux.getProximo();

                fim = aux;
                aux = aux.getProximo();
                fim.setProximo(null);
            }

            tamanho--;
            return aux.getItem();
        }
        else
            throw new NenhumItemException();
    }


    /**
     * Remove um <code>item</code> no início da deque.
     * return <code>item</code> no início da deque ou <code>null</code> se a deque estiver vazia.
    */
    Object remover(int posicao) {
        if (vazia())
            throw new NenhumItemException();
        else if (posicao < 0 || posicao > (tamanho - 1))
            throw new PosicaoInvalidaException();
        else if (posicao == 0)
            return removerInicio();
        else {
            No aux = inicio;
            if (tamanho > 1) {
                while(aux.getProximo() != fim)
                    aux = aux.getProximo();

                fim = aux;
                aux = aux.getProximo();
                fim.setProximo(null);
            }

            tamanho--;
            return aux.getItem();
        }
    }

    /**
     * Recupera <code>item</code> no início da deque, sem remover.
     * @return <code>item</code> no início da deque ou <code>null</code> se a deque estiver vazia.
     */
    Object getItem() {
        if(!vazia())
            return inicio.getItem();

        throw new NenhumItemException();
    }

    /**
     * Recupera <code>item</code> no início da deque, sem remover.
     * @return <code>item</code> no início da deque ou <code>null</code> se a deque estiver vazia.
     */
    Object getItem(int posicao) {
        if (vazia())
            throw new NenhumItemException();
        else if (posicao < 0 || posicao > (tamanho - 1))
            throw new PosicaoInvalidaException();

        return inicio.getItem();
    }

    /**
     * Recupera número de itens na deque.
     * @return Número de itens mantidos na deque.
     */
    int tamanho() {
        return tamanho;
    }

    /**
     * Retorna <code>true</code> se a deque não possuir qualquer <code>item</code>.
     * @return <code>true</code> se a deque não possuir qualquer <code>item</code>,
     * ou <code>false</code> se possuir.
     */
    boolean vazia() {
        return (tamanho == 0);
    }

    /**
     * Retorna um array contendo todos os elementos da deque.
     * @return um array com todos os elementos da deque <code>null</code> se a deque estiver vazia.
     */
    Object[] toArray() {
        Object items[];

        if (!vazia()) {
            items = new Object[tamanho];

            No x = inicio;
            for (int i = 0; i < tamanho; i++) {
                items[i] = x.getItem();
                x = x.getProximo();
            }
            return items;
        }

        return null;
    }
}

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List list = new List();
        String token;
        Object valor;
        int posicao;

        token = in.next();
        while (!token.equals("Q")) {
            try {
                switch(token) {
                    case "AF":
                        valor = in.nextInt();
                        list.adicionarFim(valor);
                        break;
                    case "AI":
                        valor = in.nextInt();
                        list.adicionarInicio(valor);
                        break;
                    case "AP":
                        posicao = in.nextInt();
                        valor = in.nextInt();
                        list.adicionar(valor, posicao);
                        break;
                    case "RI":
                        list.removerInicio();
                        break;
                    case "RF":
                        list.removerFim();
                        break;
                    case "RP":
                        posicao = in.nextInt();
                        list.remover(posicao);
                        break;
                    case "G":
                        valor = list.getItem();
                        System.out.println(valor);
                        break;
                    case "GP":
                        posicao = in.nextInt();
                        valor = list.getItem(posicao);
                        System.out.println(valor);
                        break;
                    case "T":
                        System.out.println(list.tamanho());
                        break;
                    case "V":
                        System.out.println(list.vazia());
                        break;
                    case "P":
                        Object valores[] = list.toArray();
                        if (valores != null) {
                            for(Object item: valores)
                                System.out.println(item);
                        }
                        break;
                }
            } catch(NenhumItemException | PosicaoInvalidaException ex) {
                System.out.println(ex.getMessage());
            } finally {
                token = in.next();
            }
        }
    }
}
