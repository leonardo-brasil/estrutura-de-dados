package atividade_aula05.pilha;

public class Pilha<T> {
	
	private No<T> topo;
	private int tamanho;
	
	public Pilha() {
		this.topo = null;
		this.tamanho = 0;
	}
	
	public void inserir(T elemento) {
		
		No<T> noAux = new No<>();
		noAux.setElemento(elemento);
		
		if(this.topo == null) {
			this.topo = noAux;
		} else {
			noAux.setAnterior(this.topo);
			this.topo = noAux;
		}
		
		this.tamanho++;
		
	}
	
	public void remover() {
		
		if(this.topo == null) return;
		
		No<T> noAux = this.topo;
		this.topo = noAux.getAnterior();
		noAux.setAnterior(null);
		
		this.tamanho--;
		
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	public boolean estaVazia() {
		
		if(this.topo == null) return true;
		if(this.tamanho == 0) return true;
		
		return false;
		
	}
	
	public void imprimir() {
		this.imprimir(this.topo);
	}
	
	public void imprimir(No<T> no) {
		if(no == null) return;
		System.out.println(no.getElemento());
		if(no.getAnterior() != null) this.imprimir(no.getAnterior());
	}
	
}
