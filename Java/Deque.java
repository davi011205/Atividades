// Implementar um Deque (double-ended queue), o qual possui funções para inserir e remover no início e no fim da estrutura. Além disso deve possuir funções para informar o número de elementos disponíveis na estrutura e também indicar se a estrutura está ou não fazia.

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

class Deque {
  private No inicio;
  private No fim;
  private int tamanho;
  
  int tamanho() {
    return tamanho;
  }
  
  boolean vazia() {
    return inicio == null;
  }
  
  Integer getItem() {
    if (vazia()) {
      return null;
    }
    return inicio.getItem();
  }
  
  void adicionarFim(Integer item) {
    No novo = new No(item);
    
    if (!vazia()) {
      fim.setProximo(novo);
      fim = novo;
    }
    else
      inicio = fim = novo;
      tamanho++;
  }
  
  Integer removerFim() {
    if (!vazia()) {
      No aux = inicio;
      inicio = inicio.getProximo();
      aux.setProximo(null);
      tamanho--;
      return aux.getItem();
    }
    else
    return null;
  }
  
  Integer removerInicio() {
    if (vazia()) {
      return null;
    }
    tamanho--;
    int valor = inicio.getItem();
    inicio = inicio.getProximo();
    return valor;
  }
  
  void adicionarInicio(int valor) {
    tamanho++;
    inicio = new No(valor,inicio);
  }
  
  Integer[] toArray() {
    if(!vazia()) {
      No anterior;
      Integer itens[] = new Integer[tamanho];
      
      itens[0] = inicio.getItem();
      anterior = inicio.getProximo();
      
      for(int i = 1; i < tamanho; i++) {
        itens[i] = anterior.getItem();
        anterior = anterior.getProximo();
      }
      return itens;
    }
    return null;
  }
}


class Main {
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Deque deque = new Deque();
    String token;
    Integer valor;
    
    token = scan.next();
    while (!token.equals("Q")) {
      switch(token) {
        case "AF":
          valor = scan.nextInt();
          deque.adicionarFim(valor);
        break;
        case "AI":
          valor = scan.nextInt();
          deque.adicionarInicio(valor);    
        break;                    
        case "RI":
          valor = deque.removerInicio();
          if (valor == null)
            System.out.println("NenhumItemException");
        break;
        case "RF":
          valor = deque.removerFim();
          if (valor == null)
          System.out.println("NenhumItemException");
        break;
        case "G":
          valor = deque.getItem();
          if (valor != null)
            System.out.println(valor);
          else
            System.out.println("NenhumItemException");
        break;
        case "T":
          System.out.println(deque.tamanho());
        break;
        case "V":
          System.out.println(deque.vazia());
        break;
        case "P":
          Integer valores[] = deque.toArray();
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