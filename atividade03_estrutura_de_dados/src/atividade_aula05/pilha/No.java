package atividade_aula05.pilha;

public class No<T> {
	
	private T elemento;
	private No<T> anterior;
	
	public No() {
		this.elemento = null;
		this.anterior = null;
	}
	
	public void setElemento(T elemento) {
		this.elemento = elemento;
	}
	
	public T getElemento() {
		return this.elemento;
	}
	
	public void setAnterior(No<T> no) {
		this.anterior = no;
	}
	
	public No<T> getAnterior() {
		return this.anterior;
	}
	
}
