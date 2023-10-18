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

class List<T> implements Fila<T> {
    private No<T> inicio;
    private No<T> fim;
    private int tamanho;
    
    class No<T> {
        private T item;
        private No<T> proximo;

        public No(T item) {
            this(item, null);
        }

        public No(T item, No<T> proximo) {
            this.item = item;
            this.proximo = proximo;
        }

        public T getItem() {
            return item;
        }

        public void setItem(T item) {
            this.item = item;
        }

        public No<T> getProximo() {
            return proximo;
        }

        public void setProximo(No<T> proximo) {
            this.proximo = proximo;
        }
    }    
    
    protected List() {
        inicio = fim = null;
        tamanho = 0;
    }

    public void adicionarInicio(T item) {
        No<T> novo = new No<T>(item, inicio);
        inicio = novo;
        
        tamanho++;
    }
    

    @Override
    public void enfileirar(T item) {
        No<T> novo = new No<T>(item, null);
        
        if (!vazia()) {
            fim.setProximo(novo);
            fim = novo;
        }
        else
            inicio = fim = novo;
        
        tamanho++;
    }
    
    public void adicionar(T item, int posicao) {
        if (posicao < 0 || posicao > tamanho)
            throw new PosicaoInvalidaException();
        if (posicao == 0)
            adicionarInicio(item);
        else if (posicao == tamanho)
            enfileirar(item);
        else {
            No<T> aux = inicio;
            for (int i = 1; i < posicao; i++)
                aux = aux.getProximo();
            
            No<T> novo = new No<T>(item, aux.getProximo());
            aux.setProximo(novo);
            tamanho++;
        }            
    }
    

    @Override
    public T desenfileirar() {
        if (!vazia()) {
            No<T> aux = inicio;
            inicio = inicio.getProximo();
            
            aux.setProximo(null);
            tamanho--;
            return aux.getItem();
        }
        else
            throw new NenhumItemException();
    }

    public T removerFim() {
        if (!vazia()) {
            No<T> aux = inicio;
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

    public T remover(int posicao) {
        if (vazia())
            throw new NenhumItemException();
        else if (posicao < 0 || posicao > (tamanho - 1)) 
            throw new PosicaoInvalidaException();
        else if (posicao == 0)
            return desenfileirar();
        else {
            No<T> aux = inicio;
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
    

    @Override
    public T getItem() {
        if(!vazia())
            return inicio.getItem();
        
        throw new NenhumItemException();
    }

    public T getItem(int posicao) {
        if (vazia())
            throw new NenhumItemException();
        else if (posicao < 0 || posicao > (tamanho - 1)) 
            throw new PosicaoInvalidaException();
        
        return inicio.getItem();
    }
    
    @Override
    public int tamanho() {
        return tamanho;
    }
    

    @Override
    public boolean vazia() {
        return (tamanho == 0);
    }
    

    
    @Override
    public <T> T[] toArray(T[] d) {
        Object items[];
        
        if (!vazia()) {
            items = d;
            
            No x = inicio;
            for (int i = 0; i < tamanho; i++) {
                items[i] = x.getItem();
                x = x.getProximo();
            }
            return d;
        }
            
        return null;
    }
}

interface Fila<T> {
    void enfileirar(T item);
    T desenfileirar();
    int tamanho();
    boolean vazia();
    T getItem();
    <T> T[] toArray(T[] d);
}



class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Fila<Integer> list = new List<>();
        String token;
        Integer valor;
        int posicao;
        
        token = in.next();
         while (!token.equals("Q")) {
            try {
            switch(token) {
                case "AF":
                    valor = in.nextInt();
                    list.enfileirar(valor);
                    break;
                case "RI":
                    valor = list.desenfileirar();
                    if (valor == null)
                        System.out.println("NenhumItemException");
                    break;
                case "G":
                    valor = list.getItem();
                    if (valor != null)
                        System.out.println(valor);
                    else
                        System.out.println("NenhumItemException");
                    break;
                case "T":
                    System.out.println(list.tamanho());
                    break;
                case "V":
                    System.out.println(list.vazia());
                    break;
                case "P":
                    Integer valores[] = new Integer[list.tamanho()];
                    valores = list.toArray(valores);
                    if (valores != null) {
                        for(Integer item: valores)
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