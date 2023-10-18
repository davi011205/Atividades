// Nesta atividade você deverá implementar uma fila encadeada.
// Na atividade foi anexado um arquivo contendo uma interface que deverá ser implementada pela fila, um esboço da classe na qual você deverá codificar a fila e o programa principal (classe Main), que executará testes para verificação da corretude da estrutura de dados implementada.
// Modifique a classe Fila, incluindo código que for necessário para que os métodos funcionem. Você poderá, inclusive, acrescentar outras classes que considerar necessárias.
// Inclua os modificadores acesso que julgar convenientes, com base no que foi apresentado na aula aula teórica.
// Não modifique o código da função main.

import java.util.Scanner;

class No {
	private Integer item;
	private No proximo;
	
	public No(Integer item) {
		this(item, null);
	}
	
	public No(Integer item, No proximo) {
		this.item = item;
		this.proximo = proximo;
	}
	
	public Integer getItem() {
		return item;
	}
	
	public void setItem(Integer item) {
		this.item = item;
	}
	
	public No getProximo() {
		return proximo;
	}
	
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
}

class Fila {
	
	private No inicio;
	private No fim;
	private int tamanho;
	
	public Fila() {
		inicio = fim = null;
		tamanho = 0;
	}
    
    /**
     * Adiciona @code{item} no final da fila.
     */
    void enfileirar(Integer item) {
    	No novo = new No(item);
    	
    	if (!estaVazia()) {
    		fim.setProximo(novo);
    		fim = novo;
    	}
    	else
    		inicio = fim = novo;
    	
    	tamanho++;
    }
    
    /**
     * Remove um @code{item} no início da fila.
     * return @code{item} no início da fila ou @code{null} se a fila estiver vazia.
    */
    Integer desenfileirar() {
    	if (!estaVazia()) {
    		No aux = inicio;
    		inicio = inicio.getProximo();
    		aux.setProximo(null);
    		tamanho--;
    		return aux.getItem();
    	}
    	else
    		return null;
    }
    
    /**
     * Recupera @code{item} no início da fila, sem remover.
     * @return @code{item} no início da fila ou @code{null} se a fila estiver vazia.
     */
    Integer getItem() {
    	if(!estaVazia())
    		return inicio.getItem();
    	else
    		return null;
    }
    
    /**
     * Recupera número de itens na fila.
     * @return Número de itens mantidos na fila.
     */
    int tamanho() {
    	return tamanho;
    }
    
    /**
     * Retorna @code{true} se a fila não possuir qualquer @code{item}.
     * @return @code{true} se a fila não possuir qualquer @code{item}, 
     * ou @code{false} se possuir.
     */
    boolean estaVazia() {
    	return (tamanho == 0);
    }
    
    /**
     * Retorna um array contendo todos os elementos da fila.
     * @return um array com todos os elementos da fila @code{null} se a fila estiver vazia.
     */
    Integer[] toArray() {
    	if (!estaVazia()) {
	    	Integer r[] = new Integer[tamanho];
	    	No x = inicio;
	    	for(int i = 0; i < tamanho; i++) {
	    		r[i] = x.getItem();
	    		x = x.getProximo();
	    	}
	    	return r;
    	}
    	else
    		return null;
    }
}


class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Fila fila = new Fila();
        String token;
        Integer valor;
        
        token = scan.next();
        while (!token.equals("Q")) {
            switch(token) {
                case "AF":
                    valor = scan.nextInt();
                    fila.enfileirar(valor);
                    break;
                case "RI":
                    valor = fila.desenfileirar();
                    if (valor == null)
                        System.out.println("NenhumItemException");
                    break;
                case "G":
                    valor = fila.getItem();
                    if (valor != null)
                        System.out.println(valor);
                    else
                        System.out.println("NenhumItemException");
                    break;
                case "T":
                    System.out.println(fila.tamanho());
                    break;
                case "V":
                    System.out.println(fila.estaVazia());
                    break;
                case "P":
                    Integer valores[] = fila.toArray();
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
