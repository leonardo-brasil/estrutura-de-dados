package atividade_aula05.fila;

public class Fila<T> {
	
	private No<T> inicio;
	private No<T> fim;
	private int tamanho;
	
	public Fila() {
		this.inicio = null;
		this.fim = null;
		this.tamanho = 0;
	}
	
	public void inserir(T elemento) {
		
		if(elemento == null) return;
		
		No<T> noAux = new No<>();
		noAux.setElemento(elemento);
		
		if(this.inicio == null) {
			this.inicio = noAux;
			this.fim = noAux;
		} else {
			this.fim.setProximo(noAux);
			this.fim = noAux;
		}
		
		this.tamanho++;
		
	}
	
	public void remover() {
		
		if(this.inicio == null) return;
		
		No<T> noAux = this.inicio;
		
		if(noAux.getProximo() == null) {
			this.inicio = null;
			this.fim = null;
		} else {
			this.inicio = noAux.getProximo();
			noAux.setProximo(null);
		}
		
		this.tamanho--;
		
	}
	
	public boolean estaVazia() {
		return this.inicio == null ? true : false;
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	public void imprimir() {
		
		if(this.inicio != null) this.imprimir(this.inicio);
		
	}
	
	private void imprimir(No<T> no) {
		
		System.out.println(no.getElemento());
		if(no.getProximo() != null) this.imprimir(no.getProximo());
		
	}
	
}
